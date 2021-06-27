package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class InvoiceNotFoundException extends Exception
{
    private int invoice_error;

    /**
     * Membuat exception bila invoice tidak ditemukan
     * @param invoice_input
     */
    public InvoiceNotFoundException(int invoice_input)
    {
        super("Invoice ID : ");
        invoice_error = invoice_input;
    }

    /**
     * Memberi pesan error bila invoice tidak ditemukan
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not found";
    }
}
