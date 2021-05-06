

public class EmailAlreadyExistsException extends Exception
{
    private JobSeeker jobSeeker_error;

    public EmailAlreadyExistsException(JobSeeker jobSeeker_input)
    {
        super("JobSeeker Email : ");
        jobSeeker_error = jobSeeker_input;
    }

    public String getMessage()
    {
        return super.getMessage() + jobSeeker_error.getEmail() + " already exists.";
    }
}
