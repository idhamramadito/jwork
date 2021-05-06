import java.util.ArrayList;

/**
 * Write a description of class DatabaseBonus here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class DatabaseBonus
{
    // instance variables - replace the example below with your own
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId;
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public static ArrayList<Bonus> getBonusDatabase()
    {
        return BONUS_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException
    {
        Bonus dummy = null;
        for (Bonus bonus : BONUS_DATABASE)
        {
            if (bonus.getId() == id)
            {
                dummy = bonus;
            } else {
                return dummy;
            }
        }
        throw new BonusNotFoundException(id);
    }

    public static Bonus getBonusByReferralCode(String referralCode) {
        Bonus dummy = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getReferralCode().equals(referralCode)) {
                dummy = bonus;
            } else {
                return dummy;
            }
        }
        return dummy;
    }

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
