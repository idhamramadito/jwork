package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class JobSeekerNotFoundException extends Exception
{
    private int jobSeeker_error;

    /**
     * Membuat exception bila jobseeker tidak ditemukan
     * @param jobSeeker_input
     */
    public JobSeekerNotFoundException(int jobSeeker_input)
    {
        super("JobSeeker ID: ");
        jobSeeker_error = jobSeeker_input;
    }

    /**
     * Memberi pesan error bila jobseeker tidak ditemukan
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + jobSeeker_error + " not found";
    }
}
