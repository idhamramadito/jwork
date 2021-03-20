
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String city;
    private String description;

    /**
     * Constructor for objects of class Location
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    
    public String getProvince()
    {
        
        return province;
    }
    
    public String getCity()
    {
        
        return city;
    }
    
    public String getDescription()
    {
        
        return description;
    }
    
    public void setProvince(String province)
    {
        
        this.province = province;
    }
    
    public void setCity(String city)
    {
        
        this.city = city;
    }
    
    public void setDescription(String description)
    {
        
        this.description = description;
    }
    
    public void printData()
    {
        System.out.println(
        "\n----Location----\n" +
        "Provinsi = "+province +"\n" +
        "Kota = "+city +"\n" +
        "Deskripsi = "+description
        );
    }
}
