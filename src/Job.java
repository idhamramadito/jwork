
/**
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class Job
{
    // instance variables
    private int id;
    private String name;
    private int fee;
    private JobCategory category;
    private Recruiter recruiter;

    /**
     * Constructor dari class Job
     * @param id merupakan id unik dari Job
     * @param name merupakan nama dari Job
     * @param fee merupakan fee dari Job
     * @param category merupakan panggilan dari enum JobCategory sebagai kategori dari Job
     * @param recruiter merupakan panggilan dari class recruiter sebagai siapa perekrut dari Job ini
     */
    public Job(int id, String name, int fee, JobCategory category, Recruiter recruiter)
    {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.category = category;
        this.recruiter = recruiter;
    }

    /**
     * @param  id  melakukan get id dari job
     * @return     unik id dari job
     */
    public int getId()
    {
        
        return id;
    }
    
    /**
     * @param  name  melakukan get name dari job
     * @return       name dari job
     */
    public String getName()
    {
        
        return name;
    }
    
    /**
     * @param  fee  melakukan get fee dari job
     * @return      fee dari job
     */
    public int getFee()
    {
        
        return fee;
    }
    
    /**
     * @param  category  melakukan get category dari enum JobCategory
     * @return           category yang dipilih dari list pada JobCategory
     */
    public JobCategory getCategory()
    {
        
        return category;
    }
    
    /**
     * @param  recruiter  melakukan get recruiter dari class Recruiter
     * @return            recruiter dari class Recruiter
     */
    public Recruiter getRecruiter()
    {
        
        return recruiter;
    }
    
    public void setId(int id)
    {
        
        this.id = id;
    }
    
    public void setName(String name)
    {
        
        this.name = name;
    }
    
    public void setRecruiter(Recruiter recruiter)
    {
        
        this.recruiter = recruiter;
    }
    
    public void setFee(int fee)
    {
        
        this.fee = fee;
    }
    
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
