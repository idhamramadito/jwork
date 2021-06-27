package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class OngoingInvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;

    /**
     * Membuat exception bila invoice yang berjalan sudah ada
     * @param invoice_input
     */
    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Ongoing Invoice : ");
        invoice_error = invoice_input;
    }

    /**
     * Memberi pesan error bila invoice yang berjalan sudah ada
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}
