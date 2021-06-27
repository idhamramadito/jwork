package idhamramadito.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public abstract class Invoice
{
    // instance variables
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private JobSeeker jobseeker;
    private InvoiceStatus invoicestatus;

    /**
     * Constructor dari class Recruiter
     * @param id merupakan id unik dari invoice
     * @param jobs merupakan nama pekerjaan yang dipilih
     * @param jobseeker merupakan nama pelamar
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
     * Mengambil id invoice
     * @return   id dari invoice
     */
    public int getId()
    {
        
        return id;
    }

    /**
     * Mengambil nama pekerjaan yang dipilih
     * @return   jobs yang dipilih
     */
    public ArrayList<Job> getJobs()
    {
        
        return jobs;
    }

    /**
     * Mengambil tanggal dibuatnya invoice
     * @return   date
     */
    public Calendar getDate()
    {
        
        return date;
    }

    /**
     * Mengambil biaya total
     * @return   totalFee
     */
    public int getTotalfee()
    {
        
        return totalFee;
    }

    /**
     * Mengambil nama pelamar
     * @return   jobseeker
     */
    public JobSeeker getJobseeker()
    {
        
        return jobseeker;
    }

    /**
     * Mengambil tipe pembayran yang dipilih
     */
    public abstract PaymentType getPaymentType();

    /**
     * Mengambil status dari invoice
     * @return   invoicestatus
     */
    public InvoiceStatus getInvoiceStatus()
    {
        
        return invoicestatus;
    }

    /**
     * Menetapkan id dari invoice
     * @param id dari invoice
     */
    public void setId(int id)
    {
        
        this.id = id;
    }

    /**
     * Menetapkan pekerjaan yang dipilih
     * @param jobs
     */
    public void setJobs(ArrayList<Job> jobs)
    {
        
        this.jobs = jobs;
    }

    /**
     * Menetapkan tanggal hari ini
     * @param date
     */
    public void setDate(Calendar date)
    {
        
        this.date = date;
    }

    /**
     * Menetapkan tanggal menjadi DD/MM/YYYY
     * @return tanggal
     */
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**
     * Menetapkan biaya total
     */
    public abstract void setTotalFee();

    /**
     * Menetapkan pelamar
     * @param jobseeker
     */
    public void setJobseeker(JobSeeker jobseeker)
    {
        
        this.jobseeker = jobseeker;
    }

    /**
     * Menetapkan status dari invoice
     * @param invoicestatus
     */
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
