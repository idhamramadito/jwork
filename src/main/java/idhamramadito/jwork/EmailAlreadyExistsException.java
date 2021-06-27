package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class EmailAlreadyExistsException extends Exception
{
    private JobSeeker jobSeeker_error;

    /**
     * Membuat exception bila email yang digunakan sudah dipakai
     * @param jobSeeker_input
     */
    public EmailAlreadyExistsException(JobSeeker jobSeeker_input)
    {
        super("JobSeeker Email : ");
        jobSeeker_error = jobSeeker_input;
    }

    /**
     * Memberi pesan error bila email yang digunakan sudah dipakai
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + jobSeeker_error.getEmail() + " already exists.";
    }
}
