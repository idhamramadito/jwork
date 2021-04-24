import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId=0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id){
        Invoice dummy = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                dummy = invoice;
            } else {
                return dummy;
            }
        }
        return dummy;
    }

    public static ArrayList<Invoice> getInvoiceByJobSeeker(int jobSeekerId){
        ArrayList<Invoice> dummy = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE){
            if (invoice.getJobseeker().getId() == jobSeekerId) {
                dummy.add(invoice);
            }
        }
        return dummy;
    }

    public static boolean addInvoice(Invoice invoice){
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.get(i).setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }

}