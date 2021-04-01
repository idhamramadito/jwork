
/**
 * Write a description of class JWork here.
 *
 * @author Idham Ramadito
 * @version PT_Modul 3, 27 Maret 2021
 */
public class JWork
{
    public static void main(String[] args)
    {
        /*
         * MODUL 1
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Recruiter james = new Recruiter(007, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan);
        Job spy = new Job(007, "Spy", james, 500000, "intelijen");
        JobSeeker jason = new JobSeeker(001, "Jason Bourne", "bourne.001@gmail.com", "080987654321", "18 Maret 2021");
        Invoice pertama = new Invoice(1, 0, "14 Maret 2021", 500000, jason);
        
         * MODUL 2
        Location jakarta = new Location("DKI Jakarta", "Jakarta", "ibukota");
        Recruiter idham = new Recruiter(21, "Idham Ramadito", "idhamadito@gmail.com", "081314992380", jakarta);
        Job it = new Job(21, "IT", idham, 100000, "informatika");
        JobSeeker doe = new JobSeeker(22, "John Doe", "doe.000@gmail.com", "080111111111", "21 Maret 2021");
        Invoice kedua = new Invoice(2, 21, "21 Maret 2021", 100000, doe);
        
        medan.printData();
        james.printData();
        jason.printData();
        
        jakarta.printData();
        idham.printData();
        doe.printData();
        
         * MODUL 3
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Recruiter james = new Recruiter(007, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan);
        Job webdev = new Job(007, "Senior Designer", james, 500000, JobCategory.WebDeveloper);
        JobSeeker jason = new JobSeeker(001, "Jason Bourne", "bourne.001@gmail.com", "080987654321", "28 Maret 2021");
        Invoice pertama = new Invoice(1, webdev.getId(), "28/03/2021", webdev.getFee(), jason, PaymentType.BankPayment, InvoiceStatus.OnGoing);
        
        webdev.printData();
        pertama.printData();
        */
       
        // MODUL 4
        JobSeeker jason = new JobSeeker(001, "Jason Bourne", "bourne.001@gmail.com", "080987654321", "28 Maret 2021");
        Bonus bonus1 = new Bonus(1, "QWERTY", 10000, 1000, true);
        Bonus bonus2 = new Bonus(2, "ASDFGH", 50000, 5000, true);
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Recruiter james = new Recruiter(007, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan);
        Job webdev = new Job(007, "Senior Designer", james, 500000, JobCategory.WebDeveloper);
        EwalletPayment epay1 = new EwalletPayment(1, webdev, "1 April 2021", jason, InvoiceStatus.OnGoing);
        EwalletPayment epay2 = new EwalletPayment(2, webdev, "1 April 2021", jason, InvoiceStatus.Finished, bonus1);
        EwalletPayment epay3 = new EwalletPayment(3, webdev, "1 April 2021", jason, InvoiceStatus.Cancelled, bonus2);
        
        epay1.setTotalFee();
        epay2.setTotalFee();
        epay3.setTotalFee();
        
        epay1.printData();
        epay2.printData();
        epay3.printData();
        
    }
}
