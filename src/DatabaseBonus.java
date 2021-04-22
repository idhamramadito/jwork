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
    private static ArrayList<Bonus> BONUS_DATABASE;
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

    public static Bonus getBonusById(int id) {
        Bonus dummy = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                dummy = bonus;
            } else {
                return dummy;
            }
        }
        return dummy;
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

    public static boolean addBonus(Bonus bonus)
    {
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean removeBonus(int id)
    {
        for (Bonus bonus : BONUS_DATABASE){
            if (bonus.getId() == id){
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        return false;
    }
}
