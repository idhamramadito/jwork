package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
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
     * Mengambil id recruiter
     * @return   id dari recruiter
     */
    public int getId()
    {
        
        return id;
    }
    
    /**
     * Mengambil name dari recruiter
     * @return   name dari recruiter
     */
    public String getName()
    {
        
        return name;
    }
    
    /**
     * Mengambil email dari recruiter
     * @return   email dari recruiter
     */
    public String getEmail()
    {
        
        return email;
    }
    
    /**
     * Mengambil phonenumber dari recruiter
     * @return   phonenumber dari recruiter
     */
    public String getPhoneNumber()
    {
        
        return phoneNumber;
    }
    
    /**
     * Mengambil location dari recruiter
     * @return   location dari class Location
     */
    public Location getLocation()
    {
        
        return location;
    }

    /**
     * Menetapkan id dari recruiter
     * @param id dari recruiter
     */
    public void setId(int id)
    {
        
        this.id = id;
    }

    /**
     * Menetapkan email dari recruiter
     * @param email dari recruiter
     */
    public void setEmail(String email)
    {
        
        this.email = email;
    }

    /**
     * Menetapkan name dari recruiter
     * @param name dari recruiter
     */
    public void setName(String name)
    {
        
        this.name = name;
    }

    /**
     * Menetapkan phonenumber dari recruiter
     * @param phoneNumber dari recruiter
     */
    public void setPhoneNumber(String phoneNumber)
    {
        
        this.phoneNumber = phoneNumber;
    }

    /**
     * Menetapkan location dari recruiter
     * @param location dari recruiter
     */
    public void setLocation(Location location)
    {
        
        this.location = location;
    }
    
    @Override
    public String toString()
    {
        /* System.out.println(
        "\n----Recruiter----\n" +
        "ID          = "+id +"\n" +
        "Nama        = "+name +"\n" +
        "Email       = "+email +"\n" +
        "No. Telepon = "+phoneNumber +"\n" +
        "Lokasi      = "+location.getCity()
        ); */
        return String.format("Id = %d\nName = %s\nEmail = %s\nPhoneNumber = %s\nLocation = %s", id, name, email, phoneNumber, location.getCity());
    }
}
