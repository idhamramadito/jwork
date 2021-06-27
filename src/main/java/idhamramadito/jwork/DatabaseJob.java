package idhamramadito.jwork;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseJob here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class DatabaseJob
{
    // instance variables - replace the example below with your own
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId;

    /**
     * Mengambil database dari job
     * @return JOB_DATABASE
     */
    public static ArrayList<Job> getJobDatabase()
    {
        
        return JOB_DATABASE;
    }

    /**
     * Mengambil id terakhir dari job
     * @return lastId
     */
    public static int getLastId()
    {
        
        return lastId;
    }

    /**
     * Mengambil data job berdasarkan id
     * @param id id
     * @return jobs
     * @throws JobNotFoundException exception job
     */
    public static Job getJobById(int id) throws JobNotFoundException
    {
        Job dummy = null;
        for (Job job : JOB_DATABASE) {
            if (job.getId() == id) {
                dummy = job;
            }
        }
        if (dummy == null)
        {
            throw new JobNotFoundException(id);
        }
        return dummy;
    }

    /**
     * Mendapatkan data recruiter dari id-nya
     * @param recruiterId id dari recruiter
     * @return list dari recruiter
     */
    public static ArrayList<Job> getJobByRecruiter(int recruiterId)
    {
        ArrayList<Job> dummy = new ArrayList<Job>();
        for (Job job : JOB_DATABASE){
            if (job.getRecruiter().getId() == recruiterId){
                dummy.add(job);
            }
        }
        return dummy;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory jobCategory)
    {
        ArrayList<Job> dummy = new ArrayList<Job>();
        for (Job job : JOB_DATABASE){
            if (job.getCategory() == jobCategory) {
                dummy.add(job);
            }
        }
        return dummy;
    }

    public static boolean addJob(Job job)
    {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    public static boolean removeJob(int id) throws JobNotFoundException
    {
        for (Job job : JOB_DATABASE)
        {
            if (job.getId() == id)
            {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        throw new JobNotFoundException(id);
    }
}
