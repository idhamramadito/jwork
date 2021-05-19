package idhamramadito.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Write a description of class JobSeeker here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class JobSeeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    public Calendar joinDate;

    /**
     * Constructor for objects of class JobSeeker
     */
    public JobSeeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        setJoinDate(joinDate);
    }
    
    public JobSeeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        setJoinDate(year, month, dayOfMonth);
    }

    public JobSeeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
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
    
    public String getPassword()
    {
        
        return password;
    }
    
    public Calendar getJoinDate()
    {
        
        return joinDate;
    }
    
    public void setId(int id)
    {
        
        this.id = id;
    }
    
    public void setName(String name)
    {
        
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        Pattern pattern = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[A-Za-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.matches()) {
        this.email = email;
    }
    }
    
    public void setPassword(String password)
    {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z[0-9]]{6,}$");
        Matcher matcher = pattern.matcher(password);
        
        if (matcher.matches()) {
        this.password = password;
    }
    }
    
    public void setJoinDate(Calendar joinDate)
    {
        
        this.joinDate = joinDate;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    @Override
    public String toString()
    {
        /* System.out.println(
        "\n----JobSeeker----\n" +
        "ID            = "+id +"\n" +
        "Nama          = "+name +"\n" +
        "Email         = "+email +"\n" +
        "Password      = "+password +"\n" +
        "Tanggal Masuk = "+joinDate
        ); */
        SimpleDateFormat ft = new SimpleDateFormat ("dd MMMM yyy");
        if (joinDate != null) {
            return String.format("Id = %d\nNama = %s\nEmail = %s\nPassword = %s\nJoin Date = %s", id, name, email, password, ft.format(joinDate.getTime()));
        }
        return String.format("Id = %d\nNama = %s\nEmail = %s\nPassword = %s", id, name, email, password);
    }
}
