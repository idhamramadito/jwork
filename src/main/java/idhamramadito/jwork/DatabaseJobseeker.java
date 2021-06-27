package idhamramadito.jwork;
import java.util.ArrayList;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class DatabaseJobseeker
{
    private static ArrayList<JobSeeker> JOBSEEKER_DATABASE = new ArrayList<JobSeeker>();
    private static int lastId;

    /**
     * Mengambil database jobSeeker
     * @return JOBSEEKER_DATABASE
     */
    public static ArrayList<JobSeeker> getDatabaseJobSeeker()
    {
        return JOBSEEKER_DATABASE;
    }

    /**
     * Mengambil data jobSeeker dari id terakhir
     * @return lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Mengambil jobSeeker dari id-nya
     * @param  id
     * @return jobSeeker yang dipilih
     */
    public static JobSeeker getJobSeekerById(int id) throws JobSeekerNotFoundException
    {
        JobSeeker dummy = null;
        for (JobSeeker jobSeeker : JOBSEEKER_DATABASE)
        {
            if (jobSeeker.getId() == id)
            {
                dummy = jobSeeker;
            }
        }
        if (dummy == null)
    {
        throw new JobSeekerNotFoundException(id);
    }
        return dummy;
    }

    /**
     * Memasukkan data jobSeeker
     * @param jobSeeker
     */
    public static boolean addJobSeeker(JobSeeker jobSeeker) throws EmailAlreadyExistsException
    {
        for (JobSeeker orang : JOBSEEKER_DATABASE) {
            if (jobSeeker.getEmail() == orang.getEmail()) {
                throw new EmailAlreadyExistsException(jobSeeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobSeeker);
        lastId = jobSeeker.getId();
        return true;
    }

    /**
     * Menghapus data jobSeeker
     * @param id
     */
    public static boolean removeJobSeeker(int id) throws JobSeekerNotFoundException
    {
        for (JobSeeker jobSeeker : JOBSEEKER_DATABASE){
            if (jobSeeker.getId() == id)
            {
                JOBSEEKER_DATABASE.remove(jobSeeker);
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    /**
     * Melakukan login jobseeker
     * @param email, password
     */
    public static JobSeeker jobSeekerLogin(String email, String password)
    {
        JobSeeker dummy = null;
        for (JobSeeker jobSeeker : JOBSEEKER_DATABASE)
        {
            if (jobSeeker.getEmail().equals(email) && jobSeeker.getPassword().equals(password))
            {
                dummy = jobSeeker;
            }
        }
        return dummy;
    }
}
