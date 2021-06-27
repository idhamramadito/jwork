package idhamramadito.jwork;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class DatabaseJobseekerPostgre extends DatabaseConnectionPostgre
{
    private static ArrayList<JobSeeker> JOBSEEKER_DATABASE = new ArrayList<JobSeeker>();
    private static int lastId;

    /**
     * Mengambil database dari jobseeker
     * @return JOBSEEKER_DATABASE
     */
    public static ArrayList<JobSeeker> getJobSeekerDatabase() throws SQLException {
        JOBSEEKER_DATABASE.clear();
        Connection c = connection();
        PreparedStatement st;
        String name = null;
        String email = null;
        String password = null;
        JobSeeker js = null;
        String query = "SELECT * FROM jobseeker;";
        st = c.prepareStatement(query);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            lastId = rs.getInt("id");
            name = rs.getString("name");
            email = rs.getString("email");
            password = rs.getString("password");
            js = new JobSeeker(lastId, name, email, password);
            JOBSEEKER_DATABASE.add(js);
        }
        return JOBSEEKER_DATABASE;
    }



    /**
     * Melakukan penambahan jobseeker
     * @param jobseeker
     * @return informasi jobseeker
     */
    public static JobSeeker insertJobSeeker(JobSeeker jobseeker) throws EmailAlreadyExistsException
    {
        Connection c = connection();
        PreparedStatement st;
        JobSeeker js = null;
        try{
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            String query = "INSERT INTO jobseeker (id, name, email, password, joindate) VALUES (?,?,?,?,?) RETURNING id;";
            st = c.prepareStatement(query);
            st.setInt(1, DatabaseJobseekerPostgre.getLastJobSeekerId()+1);
            st.setString(2, jobseeker.getName());
            st.setString(3, jobseeker.getEmail());
            st.setString(4, jobseeker.getPassword());
            st.setString(5, sdf.format(date.getTime()));
            ResultSet rs = st.executeQuery();

            js = new JobSeeker(DatabaseJobseekerPostgre.getLastJobSeekerId()+1, jobseeker.getName(), jobseeker.getEmail(), jobseeker.getPassword());
            st.close();
            c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return js;
    }

    /**
     * Mengambil id jobseeker terakhir
     * @return lastId
     */
    public static int getLastJobSeekerId() throws SQLException {
        Connection c = connection();
        PreparedStatement st;
        lastId=0;
        String query = "SELECT id FROM jobseeker;";
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
     * mengambil data jobseeker
     * @param email_js email dari jobseeker
     * @param pass_js password dari jobseeker
     * @return jobseeker
     */
    public static JobSeeker getJobSeeker(String email_js, String pass_js) throws SQLException {
        Connection c = connection();
        PreparedStatement st;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        String joinDate = null;
        JobSeeker js;
        String query = "SELECT id, name, email, password, joindate FROM jobseeker WHERE email=? AND password=?;";
        st = c.prepareStatement(query);
        st.setString(1, email_js);
        st.setString(2, pass_js);
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            id = rs.getInt("id");
            name = rs.getString("name");
            email = rs.getString("email");
            password = rs.getString("password");
            joinDate = rs.getString("joindate");
        }
        st.close();
        c.close();
        js = new JobSeeker(id, name, email, password);
        return js;
    }

    /**
     * Menghapus data jobseeker
     * @param id
     * @return boolean
     */
    public static boolean removeJobSeeker(int id){
        Connection c = connection();
        PreparedStatement st;
        boolean b;
        try{
            String query = "DELETE FROM jobseeker WHERE id=?;";
            st = c.prepareStatement(query);
            st.setInt(1, id);
            st.execute();
            st.close();
            c.close();
            b = true;
        } catch (SQLException e){
            b = false;
            e.printStackTrace();
        }
        return b;
    }

    /**
     * Melakukan login jobseeker
     * @param  email email dari jobseeker
     * @param password password dari jobseeker
     */
    public static JobSeeker jobseekerLogin(String email, String password) throws SQLException
    {
        JobSeeker js1 = null;
        for(JobSeeker js : getJobSeekerDatabase()){
            if(js.getEmail().equals(email) && js.getPassword().equals(password)){
                js1 = js;
            }
        }

        return js1;
    }

    /**
     * Mengambil jobseeker dari id-nya
     * @param  id
     * @return jobseeker yang dipilih
     */
    public static JobSeeker getJobSeekerFromId(int id) throws JobSeekerNotFoundException
    {
        Connection c = connection();
        JobSeeker js1 = null;
        PreparedStatement st;
        int idjs = 0;
        String name = null;
        String email = null;
        String password = null;
        try{
            String query = "SELECT * FROM jobseeker WHERE id=?;";
            st = c.prepareStatement(query);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                idjs = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                password = rs.getString("password");
            }
            st.close();
            c.close();
            js1 = new JobSeeker(idjs, name, email, password);
        } catch(SQLException e){
            e.printStackTrace();
        }
        if(js1==null)
        {
            JobSeekerNotFoundException e = new JobSeekerNotFoundException(id);
            System.out.println(e.getMessage());
        }
        return js1;
    }
}