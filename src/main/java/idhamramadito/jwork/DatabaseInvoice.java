package idhamramadito.jwork;
import java.util.ArrayList;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId;

    /**
     * Mengambil database invoice
     * @return INVOICE_DATABASE
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    /**
     * Mengambil data invoice dari id terakhir
     * @return lastId
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * Mengambil invoice dari id-nya
     * @param  id
     * @return invoice yang dipilih
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException
    {
        Invoice dummy = null;
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    /**
     * Mengambil invoice dari id jobseeker
     * @param  jobSeekerId
     * @return invoice yang dipilih
     */
    public static ArrayList<Invoice> getInvoiceByJobSeeker(int jobSeekerId){
        ArrayList<Invoice> dummy = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE){
            if (invoice.getJobseeker().getId() == jobSeekerId) {
                dummy.add(invoice);
            }
        }
        return dummy;
    }

    /**
     * Memasukkan data invoice
     * @param invoice
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        for (Invoice a : INVOICE_DATABASE)
            if (a.getId() == invoice.getId() && a.getInvoiceStatus() == InvoiceStatus.OnGoing)
                throw new OngoingInvoiceAlreadyExistsException(invoice);
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * Mengubah status invoice
     * @param invoiceStatus
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.get(i).setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * Menghapus invoice
     * @param id
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id)
            {
                INVOICE_DATABASE.remove(i);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}