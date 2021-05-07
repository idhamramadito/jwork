import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * Write a description of class EwalletPayment here.
 *
 * @author Idham Ramadito
 * @version Mdoul 4, 1 April 2021
 */
public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, JobSeeker jobseeker)
    {
        super(id, jobs, jobseeker);
        
    }
    public EwalletPayment(int id, ArrayList<Job> jobs, JobSeeker jobseeker, Bonus bonus)
    {
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Bonus getBonus()
    {
        
        return bonus;
    }
    
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }
    
    @Override
    public void setTotalFee()
    {
        int totaljobfee = 0;
        for (Job job : getJobs()) {
            totaljobfee = totaljobfee + job.getFee();
        }
        if (bonus != null && bonus.getActive() && totaljobfee > bonus.getMinTotalFee()){
            super.totalFee = bonus.getExtraFee() + totaljobfee;
        } else {
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
        System.out.println("Fee              = "+super.totalFee);
        
        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee()) {
            System.out.println("Referral Code    = "+bonus.getReferralCode());
        }
        
        System.out.println("Status           = "+super.getInvoiceStatus().toString());
        System.out.println("Payment Type     = "+PAYMENT_TYPE.toString()); */
        SimpleDateFormat ft = new SimpleDateFormat ("dd MMMM yyy");
        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee()) {
            return String.format(
                    "Id = %d\n" +
                    "Job = %s\n" +
                    "Date = %s\n" +
                    "Seeker = %s\n" +
                    "Fee = %d\n" +
                    "Referral Code = %s" +
                    "\nStatus = %s" +
                    "\nPayment Type = %s",
                    super.getId(),
                    jobname,
                    ft.format(getDate().getTime()),
                    super.getJobseeker().getName(),
                    super.totalFee,
                    getBonus().getReferralCode(),
                    super.getInvoiceStatus(),
                    PAYMENT_TYPE);
        }
        return String.format(
                "Id = %d\n" +
                "Job = %s\n" +
                "Date = %s\n" +
                "Seeker = %s\n" +
                "Fee = %d\n" +
                "Status = %s\n" +
                "Payment Type = %s\n",
                super.getId(),
                jobname,
                ft.format(getDate().getTime()),
                super.getJobseeker().getName(),
                super.totalFee,
                super.getInvoiceStatus(),
                PAYMENT_TYPE);
    }
}
