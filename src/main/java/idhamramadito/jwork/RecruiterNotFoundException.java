package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class RecruiterNotFoundException extends Exception
{
    private int recruiter_error;

    /**
     * Membuat exception bila recruiter sudah ada
     * @param recruiter_input
     */
    public RecruiterNotFoundException(int recruiter_input)
    {
        super("Recruiter ID : ");
        recruiter_error = recruiter_input;
    }

    /**
     * Memberi pesan error bila recruiter sudah ada
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + recruiter_error + " not found";
    }
}
