
/**
 * Write a description of class Job here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class Job
{
    private int id;
    private String name;
    private int fee;
    private JobCategory category;
    private Recruiter recruiter;

    /**
     * Constructor for objects of class Job
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        
        return id;
    }
    
    public String getName()
    {
        
        return name;
    }
    
    public int getFee()
    {
        
        return fee;
    }
    
    public JobCategory getCategory()
    {
        
        return category;
    }
    
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
    
    public void printData()
    {
        System.out.println(
        "\n==========Job==========\n" +
        "ID        = "+id +"\n" +
        "Name      = "+name +"\n" +
        "Recruiter = "+recruiter.getName() +"\n" +
        "City      = "+recruiter.getLocation().getCity() +"\n" +
        "Fee       = "+fee +"\n" +
        "Category  = "+category
        );
        
    }
}
