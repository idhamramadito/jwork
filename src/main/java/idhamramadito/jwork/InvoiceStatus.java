package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public enum InvoiceStatus 
{
    OnGoing("OnGoing"),
    Finished("Finished"),
    Cancelled("Cancelled");
    private String status;

    InvoiceStatus(String status)
    {
        this.status = status;
    }
}
