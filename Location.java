
/**
 * Write a description of class Location here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class Location
{
    // instance variables
    private String province;
    private String city;
    private String description;

    /**
     * Constructor dari class Location
     * @param province merupakan provinsi location
     * @param city merupakan kota location
     * @param description merupakan deskripsi lengkap location
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    
    /**
     * melakukan get province dari location 
     * @return province dari location 
     */
    public String getProvince()
    {
        
        return province;
    }
    
    /**
     * melakukan get kota dari location 
     * @return kota dari location 
     */
    public String getCity()
    {
        
        return city;
    }
    
    /**
     * melakukan get deskripsi dari location 
     * @return deksripsi dari location 
     */
    public String getDescription()
    {
        
        return description;
    }
    
    /**
     * melakukan set province dari location
     * @param province dari location
     */
    public void setProvince(String province)
    {
        
        this.province = province;
    }
    
    /**
     * melakukan set city dari location
     * @param city dari location
     */
    public void setCity(String city)
    {
        
        this.city = city;
    }
    
    /**
     * melakukan set deskripsi dari location
     * @param description dari location
     */
    public void setDescription(String description)
    {
        
        this.description = description;
    }
    
    /**
     * metode untuk melakukan printout dari class Location
     * output dari Location berisikan nama provinsi, kota, dan deksripsi
     */
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
