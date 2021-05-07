import java.util.ArrayList;
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
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private JobSeeker jobseeker;
    private InvoiceStatus invoicestatus;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, ArrayList<Job> jobs, JobSeeker jobseeker)
    {
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
        this.invoicestatus = invoicestatus.OnGoing;
        this.date = new GregorianCalendar();
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
    
    public ArrayList<Job> getJobs()
    {
        
        return jobs;
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
    
    public void setJobs(ArrayList<Job> jobs)
    {
        
        this.jobs = jobs;
    }
    
    public void setDate(Calendar date)
    {
        
        this.date = date;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth)
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
        return String.format("Id = %d\nJob = %s\nDate = %s\nTotal Fee = %d\nJobseeker = %d\nInvoice status = %s\n", id, jobs, ft.format(date.getTime()), totalFee, jobseeker, invoicestatus);
    }
}
