package idhamramadito.jwork;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public enum PaymentType 
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet Payment");
    private String type;

    PaymentType(String type)
    {
        this.type = type;
    }
}
