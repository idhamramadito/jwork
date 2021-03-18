
/**
 * Write a description of class Recruiter here.
 *
 * @author Idham Ramadito
 * @version 18 Maret 2021
 */
public class Recruiter
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Recruiter
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
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
    
    public String getEmail()
    {
        
        return email;
    }
    
    public String getPhoneNumber()
    {
        
        return phoneNumber;
    }
    
    public Location getLocation()
    {
        
        return location;
    }
    
    public void setId(int id)
    {
        
        this.id = id;
    }
    
    public void setEmail(String email)
    {
        
        this.email = email;
    }
    
    public void setName(String name)
    {
        
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation(Location location)
    {
        
        this.location = location;
    }
    
    public void printData()
    {
        System.out.println(
        "\n----Recruiter----\n" +
        "ID          = "+id +"\n" +
        "Nama        = "+name +"\n" +
        "Email       = "+email +"\n" +
        "No. Telepon = "+phoneNumber +"\n" +
        "Lokasi      = "+location.getCity()
        );
    }
}
