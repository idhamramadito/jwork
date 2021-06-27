package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
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
     * Constructor dari class Recruiter
     * @param id merupakan id unik dari bonus
     * @param referralCode merupakan referral code dari bonus
     * @param extraFee merupakan biaya tambahan dari bonus
     * @param minTotalFee merupakan biaya total minimal dari bonus
     * @param active merupakan pengecekan bila ada bonus atau tidak
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
     * Mengambil id bonus
     * @return   id dari bonus
     */
    public int getId()
    {
        
        return id;
    }

    /**
     * Mengambil referral code dari bonus
     * @return   referralCode dari bonus
     */
    public String getReferralCode()
    {
        
        return referralCode;
    }

    /**
     * Mengambil biaya tambahan dari bonus
     * @return   extraFee dari bonus
     */
    public int getExtraFee()
    {
        
        return extraFee;
    }

    /**
     * Mengambil biaya minimum dari bonus
     * @return   minTotalFee dari bonus
     */
    public int getMinTotalFee()
    {
        
        return minTotalFee;
    }

    /**
     * Mengecek apakah ada bonus atau tidak
     * @return   boolean bonus
     */
    public boolean getActive()
    {
        
        return true;
    }

    /**
     * Menetapkan id dari bonus
     * @param id dari bonus
     */
    public void setId(int id)
    {
        
        this.id = id;
    }

    /**
     * Menetapkan referral code dari bonus
     * @param referralCode dari bonus
     */
    public void setReferralCode(String referralCode)
    {
        
        this.referralCode = referralCode;
    }

    /**
     * Menetapkan biaya tambahan dari bonus
     * @param extraFee dari bonus
     */
    public void setExtraFee(int extraFee)
    {
        
        this.extraFee = extraFee;
    }

    /**
     * Menetapkan biaya total minimum dari bonus
     * @param minTotalFee dari bonus
     */
    public void setMinTotalFee(int minTotalFee)
    {
        
        this.minTotalFee = minTotalFee;
    }

    /**
     * Menetapkan bonusada atau tidak
     * @param active dari bonus
     */
    public void setActive(boolean active)
    {
        
    }
    
    @Override
    public String toString()
    {
        return String.format("Id = %d\nReferral Code = %s\nExtra Fee = %d\nMin Total Fee = %d\nActive status = %s\n", id, referralCode, extraFee, minTotalFee, active);
    }
}
