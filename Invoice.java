import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Invoice here.
 *
 * @author Idham Ramadito
 * @version PT_Modul 3, 27 Maret 2021
 */
abstract class Invoice
{
    private int id;
    private Job job;
    private Calendar date;
    protected int totalFee;
    private JobSeeker jobseeker;
    private InvoiceStatus invoicestatus;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Job job, Calendar date, JobSeeker jobseeker, InvoiceStatus invoicestatus)
    {
        this.id = id;
        this.job = job;
        setDate(date);
        this.jobseeker = jobseeker;
        this.invoicestatus = invoicestatus;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  id  melakukan get id dari dari class invoice
     * @return     id dari class invoice
     */
    public int getId()
    {
        
        return id;
    }
    
    public Job getJob()
    {
        
        return job;
    }
    
    public Calendar getDate()
    {
        
        return date;
    }
    
    public int getTotalfee()
    {
        
        return totalFee;
    }
    
    public JobSeeker getJobseeker()
    {
        
        return jobseeker;
    }
    
    public abstract PaymentType getPaymentType();
    
    
    public InvoiceStatus getInvoiceStatus()
    {
        
        return invoicestatus;
    }
    
    public void setId(int id)
    {
        
        this.id = id;
    }
    
    public void setJob(Job job)
    {
        
        this.job = job;
    }
    
    public void setDate(Calendar date)
    {
        
        this.date = date;
    }
    
    public void setDate(int year, int month, int dayOfMonth)
    {
        
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    public abstract void setTotalFee();
    
    public void setJobseeker(JobSeeker jobseeker)
    {
        
        this.jobseeker = jobseeker;
    }
    
    public void setInvoiceStatus(InvoiceStatus invoicestatus)
    {
        
        this.invoicestatus = invoicestatus;
    }
    
    @Override
    public String toString()
    {
        SimpleDateFormat ft = new SimpleDateFormat ("dd MMMM yyy");
        return String.format("Id = %d\nJob = %s\nDate = %s\nTotal Fee = %d\nJobseeker = %d\nInvoice status = %s\n", id, job, ft.format(date.getTime()), totalFee, jobseeker, invoicestatus);
    }
}
