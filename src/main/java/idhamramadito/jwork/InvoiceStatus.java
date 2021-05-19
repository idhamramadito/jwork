package idhamramadito.jwork;

/**
 * Write a description of enum InvoiceStatus here.
 *
 * @author Idham Ramadito
 * @version PT_Modul 3, 28 Maret 2021
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
