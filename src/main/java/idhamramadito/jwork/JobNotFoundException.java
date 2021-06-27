package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class JobNotFoundException extends Exception
{
    private int job_error;

    /**
     * Membuat exception bila job tidak ditemukan
     * @param job_input
     */
    public JobNotFoundException(int job_input)
    {
        super("Job ID : ");
        job_error = job_input;
    }

    /**
     * Memberi pesan error bila job tidak ditemukan
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + job_error + " not found";
    }
}
