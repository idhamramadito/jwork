package idhamramadito.jwork;
import java.util.ArrayList;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class DatabaseRecruiter
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId;

    /**
     * Mengambil database recruiter
     * @return BONUS_DATABASE
     */
    public static ArrayList<Recruiter> getRecruiterDatabase()
    {
        return RECRUITER_DATABASE;
    }

    /**
     * Mengambil data recruiter dari id terakhir
     * @return lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Mengambil recruiter dari id-nya
     * @param  id
     * @return recruiter yang dipilih
     */
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

    /**
     * Memasukkan data recruiter
     * @param recruiter
     */
    public static boolean addRecruiter(Recruiter recruiter)
    {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    /**
     * Menghapus data recruiter
     * @param id
     */
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
