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
    public EwalletPayment(int id, Job job, Calendar date, JobSeeker jobseeker, InvoiceStatus invoicestatus)
    {
        super(id, job, date, jobseeker, invoicestatus);
        
    }
    public EwalletPayment(int id, Job job, Calendar date, JobSeeker jobseeker, InvoiceStatus invoicestatus, Bonus bonus)
    {
        super(id, job, date, jobseeker, invoicestatus);
        this.bonus = bonus;
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
        if (bonus != null && bonus.getActive() && super.getJob().getFee() > bonus.getMinTotalFee()){
            super.totalFee = super.getJob().getFee() + bonus.getExtraFee();
        } else 
        {
            super.totalFee = super.getJob().getFee();
        }
    }
    
    @Override
    public String toString()
    {
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
            return String.format("Id = %d\nJob = %s\nDate = %s\nSeeker = %s\nFee = %d\nReferral Code = %s\nStatus = %s\nPayment Type = %s", super.getId(), super.getJob().getName(), ft.format(getDate().getTime()), super.getJobseeker().getName(), super.totalFee, getBonus().getReferralCode(), super.getInvoiceStatus(), PAYMENT_TYPE);
        }
        return String.format("Id = %d\nJob = %s\nDate = %s\nSeeker = %s\nFee = %d\nStatus = %s\nPayment Type = %s\n", super.getId(), super.getJob().getName(), ft.format(getDate().getTime()), super.getJobseeker().getName(), super.totalFee, super.getInvoiceStatus(), PAYMENT_TYPE);
    }
}
