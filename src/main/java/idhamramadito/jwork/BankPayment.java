package idhamramadito.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class BankPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor dari class BankPayment
     * @param id merupakan id unik dari recruiter
     * @param jobs merupakan list dari job yang ada
     * @param jobseeker merupakan info jobseeker
     */
    public BankPayment(int id, ArrayList<Job> jobs, JobSeeker jobseeker)
    {
        super(id, jobs, jobseeker);
        
    }
    public BankPayment(int id, ArrayList<Job> jobs, JobSeeker jobseeker, int adminFee)
    {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }

    /**
     * Mengambil tipe payment
     * @return   PAYMENT_TYPE
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * Mengambil biaya admin
     * @return   adminFee
     */
    public int getAdminFee()
    {
        
        return adminFee;
    }

    /**
     * Menetapkan biaya admin
     * @param adminFee dari bankpayment
     */
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }

    /**
     * Menetapkan biaya total
     * @return toalfee
     */
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
