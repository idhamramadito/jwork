package idhamramadito.jwork;
import java.util.ArrayList;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class DatabaseBonus
{
    // instance variables - replace the example below with your own
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId;

    /**
     * Mengambil database bonus
     * @return BONUS_DATABASE
     */
    public static ArrayList<Bonus> getBonusDatabase()
    {
        return BONUS_DATABASE;
    }

    /**
     * Mengambil data bonus dari id terakhir
     * @return lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Mengambil bonus dari id-nya
     * @param  id
     * @return bonus yang dipilih
     */
    public static Bonus getBonusById(int id) throws BonusNotFoundException
    {
        Bonus dummy = null;
        for (Bonus bonus : BONUS_DATABASE)
        {
            if (bonus.getId() == id)
            {
                dummy = bonus;
            }
        }
        if (dummy == null) {
            throw new BonusNotFoundException(id);

        }
        return dummy;
    }

    /**
     * Mengambil data bonus berdasarkan referralcode
     * @return bonus
     */
    public static Bonus getBonusByReferralCode(String referralCode) {
        Bonus dummy = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getReferralCode() == referralCode) {
                dummy = bonus;
            } else {
                return dummy;
            }
        }
        return dummy;
    }

    /**
     * Memasukkan data bonus
     * @param bonus
     */
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException
    {
        for (Bonus cekbonus : BONUS_DATABASE)
        {
            if (bonus.getReferralCode() == cekbonus.getReferralCode())
            {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activeBonus(int id)
    {
        for (Bonus bonus : BONUS_DATABASE){
            if (bonus.getId() == id){
                bonus.setActive(true);
                return true;
            }
        }
        return false;
    }

    public static boolean deactivateBonus(int id)
    {
        for (Bonus bonus : BONUS_DATABASE){
            if (bonus.getId() == id){
                bonus.setActive(false);
                return true;
            }
        }
        return false;
    }

    /**
     * Menghapus data bonus
     * @param id
     */
    public static boolean removeBonus(int id) throws BonusNotFoundException
    {
        for (Bonus bonus : BONUS_DATABASE){
            if (bonus.getId() == id){
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        throw new BonusNotFoundException(id);
    }
}
