
/**
 * Write a description of class Invoice here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class Invoice
{
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private JobSeeker jobseeker;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, JobSeeker jobseeker)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
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
    
    public void printData()
    {
        System.out.println(
        "\n----Invoice----\n" +
        "ID = "+id +"\n" +
        "Job ID = "+idJob +"\n" +
        "Tanggal = "+date +"\n" +
        "Total Biaya = "+totalFee +"\n" +
        "Jobseeker = "+jobseeker.getName()
        );
        
    }
}
