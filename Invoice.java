
/**
 * Write a description of class Invoice here.
 *
 * @author Idham Ramadito
 * @version PT_Modul 3, 27 Maret 2021
 */
public class Invoice
{
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private JobSeeker jobseeker;
    private PaymentType paymenttype;
    private InvoiceStatus status;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, JobSeeker jobseeker, PaymentType paymenttype, InvoiceStatus status)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymenttype = paymenttype;
        this.status = status;
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
    
    public int getIdJob()
    {
        
        return idJob;
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
    
    public PaymentType getPaymentType()
    {
        
        return paymenttype;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        
        return status;
    }
    
    public void setId(int id)
    {
        
        this.id = id;
    }
    
    public void setIdJob(int idJob)
    {
        
        this.idJob = idJob;
    }
    
    public void setDate(String date)
    {
        
        this.date = date;
    }
    
    public void setTotalFee(int totalFee)
    {
        
        this.totalFee = totalFee;
    }
    
    public void setJobseeker(JobSeeker jobseeker)
    {
        
        this.jobseeker = jobseeker;
    }
    
    public void setPaymentType(PaymentType paymenttype)
    {
        
        this.paymenttype = paymenttype;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
        this.status = status;
    }
    
    public void printData()
    {
        System.out.println(
        "\n==========Invoice==========\n" +
        "ID     = "+id +"\n" +
        "ID Job = "+idJob +"\n" +
        "Date   = "+date +"\n" +
        "Seeker = "+jobseeker.getName() +"\n" +
        "Fee    = "+totalFee +"\n" +
        "Status = "+status
        );
        
    }
}
