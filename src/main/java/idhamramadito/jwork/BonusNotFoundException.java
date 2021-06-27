package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class BonusNotFoundException extends Exception
{
    private int bonus_error;

    /**
     * Membuat exception bila bonus tidak ditemukan
     * @param bonus_input
     */
    public BonusNotFoundException(int bonus_input)
    {
        super("Bonus ID : ");
        bonus_error = bonus_input;
    }

    /**
     * Memberi pesan error bila bonus tidak ditemukan
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + bonus_error + " not found";
    }
}
