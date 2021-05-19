package idhamramadito.jwork;

public class JobSeekerNotFoundException extends Exception
{
    private int jobSeeker_error;

    /**
     * Constructor for objects of class Invoice
     */
    public JobSeekerNotFoundException(int jobSeeker_input)
    {
        super("JobSeeker ID: ");
        jobSeeker_error = jobSeeker_input;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return     id dari class invoice
     */

    public String getMessage()
    {
        return super.getMessage() + jobSeeker_error + " not found";
    }
}
