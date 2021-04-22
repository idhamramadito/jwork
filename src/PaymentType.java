
/**
 * Write a description of enum PaymentType here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
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
