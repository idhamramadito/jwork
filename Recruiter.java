
/**
 * Write a description of class Recruiter here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class Recruiter
{
    // instance variables
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor dari class Recruiter
     * @param id merupakan id unik dari recruiter
     * @param name merupakan nama dari recruiter
     * @param email merupakan alamat email dari recruiter
     * @param phoneNumber merupakan nomor telepon dari recruiter
     * @param location merupakan panggilan dari class Location
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
     * @param  id   melakukan get id dari recruiter
     * @return      unik id dari recruiter
     */
    public int getId()
    {
        
        return id;
    }
    
    /**
     * @param  name   melakukan get name dari recruiter
     * @return        name dari recruiter
     */
    public String getName()
    {
        
        return name;
    }
    
    /**
     * @param  email  melakukan get email dari recruiter
     * @return        email dari recruiter
     */
    public String getEmail()
    {
        
        return email;
    }
    
    /**
     * @param  phoneNumber  melakukan get nomor telepon dari recruiter
     * @return              nomor telepon dari recruiter
     */
    public String getPhoneNumber()
    {
        
        return phoneNumber;
    }
    
    /**
     * @param  location   melakukan get location dari class Location
     * @return            location dari class Location
     */
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
