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
    public BankPayment(int id, Job job, Calendar date, JobSeeker jobseeker, InvoiceStatus invoicestatus)
    {
        super(id, job, date, jobseeker, invoicestatus);
        
    }
    public BankPayment(int id, Job job, Calendar date, JobSeeker jobseeker, InvoiceStatus invoicestatus, int adminFee)
    {
        super(id, job, date, jobseeker, invoicestatus);
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
        if (adminFee != 0){
            super.totalFee = super.getJob().getFee() - adminFee;
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
        System.out.println("Admin Fee        = "+getAdminFee());
        setTotalFee();
        System.out.println("Total Fee        = "+super.totalFee);
        System.out.println("Status           = "+super.getInvoiceStatus().toString());
        System.out.println("Payment Type     = "+PAYMENT_TYPE.toString()); */
        SimpleDateFormat ft = new SimpleDateFormat ("dd MMMM yyy");
        return String.format("Id = %d\nJob = %s\nDate = %s\nSeeker = %s\nAdmin Fee = %d\nTotal Fee = %d\nStatus = %s\nPayment Type = %s\n", getId(), getJob(), ft.format(getDate().getTime()), getJobseeker().getName(), getAdminFee(), getTotalfee(), getInvoiceStatus(), PAYMENT_TYPE);
    }
}
