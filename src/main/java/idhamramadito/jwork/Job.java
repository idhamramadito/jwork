package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class Job
{
    // instance variables
    private int id;
    private String name;
    private Recruiter recruiter;
    private int fee;
    private JobCategory category;

    /**
     * Constructor dari class Job
     * @param id merupakan id unik dari Job
     * @param name merupakan nama dari Job
     * @param fee merupakan fee dari Job
     * @param category merupakan panggilan dari enum JobCategory sebagai kategori dari Job
     * @param recruiter merupakan panggilan dari class recruiter sebagai siapa perekrut dari Job ini
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.category = category;
        this.recruiter = recruiter;
    }

    /**
     * Mengambil id job
     * @return   id job
     */
    public int getId()
    {
        
        return id;
    }

    /**
     * Mengambil name dari job
     * @return   name dari job
     */
    public String getName()
    {
        
        return name;
    }

    /**
     * Mengambil biaya dari job
     * @return   fee dari job
     */
    public int getFee()
    {
        
        return fee;
    }

    /**
     * Mengambil kategori dari job
     * @return   category dari job
     */
    public JobCategory getCategory()
    {
        
        return category;
    }

    /**
     * Mengambil name dari recruiter
     * @return   recruiter
     */
    public Recruiter getRecruiter()
    {
        
        return recruiter;
    }

    /**
     * Menetapkan id dari job
     * @param id dari job
     */
    public void setId(int id)
    {
        
        this.id = id;
    }

    /**
     * Menetapkan nama dari job
     * @param name dari recruiter
     */
    public void setName(String name)
    {
        
        this.name = name;
    }

    /**
     * Menetapkan recruiter
     * @param recruiter
     */
    public void setRecruiter(Recruiter recruiter)
    {
        
        this.recruiter = recruiter;
    }

    /**
     * Menetapkan biaya dari job
     * @param fee dari recruiter
     */
    public void setFee(int fee)
    {
        
        this.fee = fee;
    }

    /**
     * Menetapkan kategori pekerjaan
     * @param category dari job
     */
    public void setCategory(JobCategory category)
    {
        
        this.category = category;
    }
    
    @Override
    public String toString()
    {
        /* System.out.println(
        "\n==========Job==========\n" +
        "ID        = "+id +"\n" +
        "Name      = "+name +"\n" +
        "Recruiter = "+recruiter.getName() +"\n" +
        "City      = "+recruiter.getLocation().getCity() +"\n" +
        "Fee       = "+fee +"\n" +
        "Category  = "+category
        );
        */
        return String.format("Id = %d\nName = %s\nRecruiter = %s\nCity = %s\nFee = %d\nCategory = %s", id, name, recruiter.getName(), recruiter.getLocation().getCity(), fee, category);
    }
}
