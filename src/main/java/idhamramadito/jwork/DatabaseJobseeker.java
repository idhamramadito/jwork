package idhamramadito.jwork;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseJob here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class DatabaseJobseeker
{
    // instance variables - replace the example below with your own
    private static ArrayList<JobSeeker> JOBSEEKER_DATABASE = new ArrayList<JobSeeker>();
    private static int lastId=0;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<JobSeeker> getDatabaseJobSeeker()
    {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }
    public static JobSeeker getJobSeekerById(int id) throws JobSeekerNotFoundException
    {
        JobSeeker dummy = null;
        for (JobSeeker jobSeeker : JOBSEEKER_DATABASE)
        {
            if (jobSeeker.getId() == id)
            {
                dummy = jobSeeker;
            } else {
                return dummy;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

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
}
