package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class FeeCalculator implements Runnable
{
    Invoice invoice;
    public FeeCalculator (Invoice invoice)
    {
        this.invoice = invoice;
    }
    @Override
    public void run()
    {
        System.out.println("Calculating Invoice ID : " + invoice.getId());
        invoice.setTotalFee();
        System.out.println("Finished calculating invoice ID : " + invoice.getId());
    }
}
