package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class ReferralCodeAlreadyExistsException extends Exception
{
    private Bonus referral_error;

    /**
     * Membuat exception bila referral code sudah ada
     * @param referral_input
     */
    public ReferralCodeAlreadyExistsException(Bonus referral_input)
    {
        super("Referral Code : ");
        referral_error = referral_input;
    }

    /**
     * Memberi pesan error bila referral code sudah ada
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + referral_error.getReferralCode() + " already exists.";
    }
}
