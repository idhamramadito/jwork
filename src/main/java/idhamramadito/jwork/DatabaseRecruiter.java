package idhamramadito.jwork;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class DatabaseRecruiter
{
    // instance variables - replace the example below with your own
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId=0;
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Recruiter> getRecruiterDatabase()
    {
        return RECRUITER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException
    {
        Recruiter dummy = null;
        for (Recruiter recruiter : RECRUITER_DATABASE)
        {
            if (recruiter.getId() == id) {
                dummy = recruiter;
            }
        }
        if (dummy == null)
        {
            throw new RecruiterNotFoundException(id);
        }
        return dummy;
    }

    public static boolean addRecruiter(Recruiter recruiter)
    {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }
    
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException
    {
        for (Recruiter recruiter : RECRUITER_DATABASE){
            if (recruiter.getId() == id){
                RECRUITER_DATABASE.remove(recruiter);
                return true;
            }
        }
        throw new RecruiterNotFoundException(id);
    }

}
