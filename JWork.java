
/**
 * Write a description of class JWork here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */
public class JWork
{
    public static void main(String[] args)
    {
        /*
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Recruiter james = new Recruiter(007, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan);
        Job spy = new Job(007, "Spy", james, 500000, "intelijen");
        JobSeeker jason = new JobSeeker(001, "Jason Bourne", "bourne.001@gmail.com", "080987654321", "18 Maret 2021");
        Invoice pertama = new Invoice(1, 0, "14 Maret 2021", 500000, jason);
        
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
        */
       
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Recruiter james = new Recruiter(007, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan);
        Job webdev = new Job(007, "Senior Designer", james, 500000, JobCategory.WebDeveloper);
        
        webdev.printData();
    }
}
