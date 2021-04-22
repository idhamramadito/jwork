import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * Write a description of class BankPayment here.
 *
 * @author Idham Ramadito
 * @version PT Modul 4, 3 April 2021
 */
public class BankPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor for objects of class BankPayment
     */
    public BankPayment(int id, ArrayList<Job> jobs, Calendar date, JobSeeker jobseeker)
    {
        super(id, jobs, date, jobseeker);
        
    }
    public BankPayment(int id, ArrayList<Job> jobs, Calendar date, JobSeeker jobseeker, int adminFee)
    {
        super(id, jobs, date, jobseeker);
        this.adminFee = adminFee;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public int getAdminFee()
    {
        
        return adminFee;
    }
    
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }
    
    @Override
    public void setTotalFee()
    {
        int totaljobfee = 0;
        for (Job job : getJobs()) {
            totaljobfee = totaljobfee + job.getFee();
        }
        if (adminFee != 0){
            super.totalFee = totaljobfee - adminFee;
        } else 
        {
            super.totalFee = totaljobfee;
        }
    }
    
    @Override
    public String toString()
    {
        String jobname = "";
        for (Job job : getJobs()) {
            jobname = jobname + job.getName();
        }
        /* System.out.println("\n==========Invoice==========\n");
        System.out.println("ID               = "+super.getId());
        System.out.println("Job              = "+super.getJob().getName());
        System.out.println("Date             = "+super.getDate());
        System.out.println("Seeker           = "+super.getJobseeker().getName());
        System.out.println("Admin Fee        = "+getAdminFee());
        setTotalFee();
        System.out.println("Total Fee        = "+super.totalFee);
        System.out.println("Status           = "+super.getInvoiceStatus().toString());
        System.out.println("Payment Type     = "+PAYMENT_TYPE.toString()); */
        SimpleDateFormat ft = new SimpleDateFormat ("dd MMMM yyy");
        return String.format(
                "Id = %d\n" +
                "Job = %s\n" +
                "Date = %s\n" +
                "Seeker = %s\n" +
                "Admin Fee = %d\n" +
                "Total Fee = %d\n" +
                "Status = %s\n" +
                "Payment Type = %s\n",
                super.getId(),
                jobname,
                ft.format(getDate().getTime()),
                super.getJobseeker().getName(),
                getAdminFee(), super.getTotalfee(),
                super.getInvoiceStatus(),
                PAYMENT_TYPE);
    }
}
