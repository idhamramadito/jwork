package idhamramadito.jwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseBonus here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class DatabaseBonusPostgre extends DatabaseConnectionPostgre
{
    // instance variables - replace the example below with your own
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<>();
    private static int lastId;

    /**
     * Mengambil database bonus
     * @return BONUS_DATABASE
     */
    public static ArrayList<Bonus> getDatabaseBonus() {

        BONUS_DATABASE.clear();
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String referralCode = null;
        int extraFee = 0;
        int minTotalFee = 0;
        boolean active = false;
        Bonus bonus = null;
        try {
            String sql = "SELECT * FROM bonus;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                referralCode = rs.getString("referralcode");
                extraFee = rs.getInt("extrafee");
                minTotalFee = rs.getInt("mintotalfee");
                active = rs.getBoolean("active");
                bonus = new Bonus(id, referralCode, extraFee, minTotalFee, active);
                BONUS_DATABASE.add(bonus);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return BONUS_DATABASE;
    }

    /**
     * Mengambil data bonus dari id terakhir
     * @return lastId
     */
    public static int getLastBonusId() throws SQLException {
        Connection c = connection();
        PreparedStatement st;
        lastId=0;
        String query = "SELECT id FROM bonus;";
        st = c.prepareStatement(query);
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            lastId = rs.getInt(1);
        }
        st.close();
        c.close();

        return lastId;
    }

    /**
     * Mengambil bonus dari id-nya
     * @param  id
     * @return bonus yang dipilih
     */
    public static Bonus getBonusFromId(int id) throws BonusNotFoundException
    {
        Connection c = connection();
        Bonus bon1 = null;
        PreparedStatement st;
        int idbon = 0;
        String referralCode = null;
        int extraFee = 0;
        int minTotalFee = 0;
        boolean active = false;
        try{
            String query = "SELECT * FROM bonus WHERE id=?;";
            st = c.prepareStatement(query);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                idbon = rs.getInt("id");
                referralCode = rs.getString("referralcode");
                extraFee = rs.getInt("extrafee");
                minTotalFee = rs.getInt("mintotalfee");
                active = rs.getBoolean("active");
            }
            st.close();
            c.close();
            bon1 = new Bonus(idbon, referralCode, extraFee, minTotalFee, active);
        } catch(SQLException e){
            e.printStackTrace();
        }
        if(bon1==null)
        {
            BonusNotFoundException e = new BonusNotFoundException(id);
            System.out.println(e.getMessage());
        }
        return bon1;
    }

    /**
     * Mengambil data bonus berdasarkan referralcode
     * @return bonus
     */
    public static Bonus getBonusByReferralCode(String referralCode)
    {
        Connection c = connection();
        PreparedStatement st;
        Bonus bon1=null;
        int idbon=0;
        String code = null;
        int extraFee=0;
        int minTotalFee=0;
        boolean active = false;
        try {
            String query = "SELECT * FROM bonus WHERE referralcode=?;";
            st = c.prepareStatement(query);
            st.setString(1, referralCode);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                idbon = rs.getInt("id");
                code = rs.getString("referralcode");
                extraFee = rs.getInt("extrafee");
                minTotalFee = rs.getInt("mintotalfee");
                active = rs.getBoolean("active");
            }
            st.close();
            c.close();
            bon1 = new Bonus(idbon, code, extraFee, minTotalFee, active);
        } catch(SQLException e){
            e.printStackTrace();
        }

        return bon1;
    }

    /**
     * Memasukkan data bonus
     * @param bonus
     */
    public static Bonus insertBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException
    {
        Bonus bon1 = null;
        Connection c = connection();
        PreparedStatement st;
        try{
            String query = "INSERT INTO bonus(id, referralcode, extrafee, mintotalfee, active) VALUES(?,?,?,?,?) RETURNING id;";
            st = c.prepareStatement(query);
            st.setInt(1, bonus.getId());
            st.setString(2, bonus.getReferralCode());
            st.setInt(3, bonus.getExtraFee());
            st.setInt(4, bonus.getMinTotalFee());
            st.setBoolean(5, bonus.getActive());
            ResultSet rs = st.executeQuery();
            bon1 = new Bonus(DatabaseBonusPostgre.getLastBonusId()+1, bonus.getReferralCode(), bonus.getExtraFee(), bonus.getMinTotalFee(), bonus.getActive());
        } catch(SQLException e){
            e.printStackTrace();
        }

        return bon1;
    }
}
