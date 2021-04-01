
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
    private String date;
    protected int totalFee;
    private JobSeeker jobseeker;
    private InvoiceStatus invoicestatus;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Job job, String date, JobSeeker jobseeker, InvoiceStatus invoicestatus)
    {
        this.id = id;
        this.job = job;
        this.date = date;
        this.jobseeker = jobseeker;
        this.invoicestatus = invoicestatus;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        
        return id;
    }
    
    public Job getJob()
    {
        
        return job;
    }
    
    public String getDate()
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
    
    public void setDate(String date)
    {
        
        this.date = date;
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
    
    public abstract void printData();
}
