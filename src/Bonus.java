
/**
 * Write a description of class Bonus here.
 *
 * @author Idham Ramadito
 * @version Modul 4, 1 April 2021
 */
public class Bonus
{
    // instance variables - replace the example below with your own
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;

    /**
     * Constructor for objects of class Bonus
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active)
    {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
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
    
    public String getReferralCode()
    {
        
        return referralCode;
    }
    
    public int getExtraFee()
    {
        
        return extraFee;
    }
    
    public int getMinTotalFee()
    {
        
        return minTotalFee;
    }
    
    public boolean getActive()
    {
        
        return true;
    }
    
    public void setId(int id)
    {
        
        this.id = id;
    }
    
    public void setReferralCode(String referralCode)
    {
        
        this.referralCode = referralCode;
    }
    
    public void setExtraFee(int extraFee)
    {
        
        this.extraFee = extraFee;
    }
    
    public void setMinTotalFee(int minTotalFee)
    {
        
        this.minTotalFee = minTotalFee;
    }
    
    public void setActive(boolean active)
    {
        
    }
    
    @Override
    public String toString()
    {
        return String.format("Id = %d\nReferral Code = %s\nExtra Fee = %d\nMin Total Fee = %d\nActive status = %s\n", id, referralCode, extraFee, minTotalFee, active);
    }
}
