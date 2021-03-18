
/**
 * Write a description of class JWork here.
 *
 * @author Idham Ramadito
 * @version 14 Maret 2021
 */
public class JWork
{
    public static void main(String[] args)
    {
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Recruiter james = new Recruiter(007, "James Bond", "bond.007@gmail.com", "081234567890", medan);
        Job spy = new Job(007, "Spy", james, 500000, "intelijen");
        JobSeeker jason = new JobSeeker(001, "Jason Bourne", "bourne.001@gmail.com", "080987654321", "18 Maret 2021");
        Invoice pertama = new Invoice(1, 0, "14 Maret 2021", 500000, jason);
        medan.printData();
        james.printData();
        jason.printData();
    }
}
