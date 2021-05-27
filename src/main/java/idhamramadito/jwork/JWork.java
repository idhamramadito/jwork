package idhamramadito.jwork;

/**
 * Write a description of class JWork here.
 *
 * @author Idham Ramadito
 * @version PT_Modul 3, 27 Maret 2021
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        /*
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Location jakarta = new Location("DKI Jakarta", "Jakarta", "ibukota");
        Location bali = new Location("Bali", "Bali", "liburan");
        Recruiter james = new Recruiter(1, "James Bond", "bond.007@gmail.com", "081234567890", medan);
        Recruiter idham = new Recruiter(2, "Idham Ramadito", "idhamadito@gmail.com", "081314992380", jakarta);
        Recruiter eben = new Recruiter(3, "Hizkia Eben", "hizkiaeben@gmail.com", "081987654321", bali);
        Job webdev = new Job(1, "Senior Designer", james, 500000, JobCategory.WebDeveloper);
        Job UI = new Job(1, "UI", james, 600000, JobCategory.UI);
        Job Devops = new Job(2, "DevOps", idham, 700000, JobCategory.Devops);
        Job Devops2 = new Job(3, "DevOps2", eben, 800000, JobCategory.Devops);

        DatabaseRecruiter.addRecruiter(james);
        DatabaseRecruiter.addRecruiter(idham);
        DatabaseRecruiter.addRecruiter(eben);
        DatabaseJob.addJob(webdev);
        DatabaseJob.addJob(UI);
        DatabaseJob.addJob(Devops);
        DatabaseJob.addJob(Devops2);
        */
        SpringApplication.run(JWork.class, args);
    }

}

/*
public class JWork
{
    public static void main(String[] args) {

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
       
         * MODUL 4
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
        
         * MODUL 4 PT
        JobSeeker jason = new JobSeeker(001, "Jason Bourne", "bourne.001@gmail.com", "080987654321", "28 Maret 2021");
        Bonus bonus1 = new Bonus(1, "QWERTY", 10000, 1000, true);
        Bonus bonus2 = new Bonus(2, "ASDFGH", 50000, 5000, true);
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Recruiter james = new Recruiter(007, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan);
        Job webdev = new Job(007, "Senior Designer", james, 500000, JobCategory.WebDeveloper);
        BankPayment bpay1 = new BankPayment(1, webdev, "1 April 2021", jason, InvoiceStatus.OnGoing);
        BankPayment bpay2 = new BankPayment(2, webdev, "1 April 2021", jason, InvoiceStatus.Finished, 2000);
        
        bpay1.setTotalFee();
        bpay2.setTotalFee();
        
        bpay1.printData();
        bpay2.printData();
        
         * MODUL 5 CS
        GregorianCalendar tanggal = new GregorianCalendar(2021, 3, 8);
        
        JobSeeker calendar = new JobSeeker(1, "John", ".johndoe@ui.ac.id", "abc", tanggal);
        JobSeeker ymd = new JobSeeker(2, "John", "john.doe@ui.ac.id", "Abc890", 2021, 3, 8);
        JobSeeker nodate = new JobSeeker(3, "John", "john.doe@ui.ac.id", "Abc890");
        
        System.out.println(calendar.toString());
        System.out.println(ymd.toString());
        System.out.println(nodate.toString());
        
        calendar.setEmail("johndoe@ui.ac.id");
        calendar.setPassword("John123");
        
        System.out.println(calendar.toString());

         * MODUL 5 PT
        * GregorianCalendar tanggal = new GregorianCalendar();
        JobSeeker jason = new JobSeeker(1, "John", ".johndoe@ui.ac.id", "abc", tanggal);
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        Recruiter james = new Recruiter(007, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan);
        Job webdev = new Job(007, "Senior Designer", james, 500000, JobCategory.WebDeveloper);
        BankPayment bpay1 = new BankPayment(1, webdev, tanggal, jason, InvoiceStatus.OnGoing);
        EwalletPayment epay2 = new EwalletPayment(2, webdev, tanggal, jason, InvoiceStatus.Finished);

        bpay1.setTotalFee();
        epay2.setTotalFee();
        bpay1.setDate(tanggal);
        epay2.setDate(tanggal);

        System.out.println(bpay1.toString());
        System.out.println(epay2.toString());

         * MODUL 6
        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        DatabaseRecruiter.addRecruiter(new Recruiter(7, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan));
        DatabaseJobseeker.addJobSeeker(new JobSeeker(1, "John", "johndoe@ui.ac.id", "abc890", 2021, 3, 8));
        DatabaseJobseeker.addJobSeeker(new JobSeeker(2, "Doe", "johndoe@ui.ac.id", "eda890", 2021, 4, 8));
        DatabaseJobseeker.addJobSeeker(new JobSeeker(3, "John Doe", "johndoer@ui.ac.id", "Abc890", 2021, 4, 8));
        for (JobSeeker jobSeeker : DatabaseJobseeker.getDatabaseJobSeeker()) {
            System.out.println(jobSeeker);
        }

        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "QWERTY", 10000, 1000, false));
        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "ZXCVBN", 20000, 2000, true));
        for (Bonus bonus : DatabaseBonus.getBonusDatabase()) {
            System.out.println(bonus);
        }

        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Senior Designer", DatabaseRecruiter.getRecruiterById(7), 500000, JobCategory.FrontEnd));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Programmer", DatabaseRecruiter.getRecruiterById(7), 500000, JobCategory.BackEnd));
        for (Job job : DatabaseJob.getJobByCategory(JobCategory.BackEnd)) {
            System.out.println(job);
        }
        for (Job job : DatabaseJob.getJobByCategory(JobCategory.FrontEnd)) {
            System.out.println(job);
        }


        try {
            DatabaseJobseeker.addJobSeeker(new JobSeeker(1, "John", "johndoe@ui.ac.id", "abc890", 2021, 3, 8));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobSeeker(new JobSeeker(2, "Doe", "johndoe@ui.ac.id", "eda890", 2021, 4, 8));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobSeeker(new JobSeeker(3, "John Doe", "johndoer@ui.ac.id", "Abc890", 2021, 4, 8));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        for (JobSeeker jobSeeker : DatabaseJobseeker.getDatabaseJobSeeker()) {
            System.out.println(jobSeeker.toString());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "QWERTY", 10000, 1000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "QWERTY", 10000, 1000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "ZXCVBN", 20000, 2000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        for (Bonus bonus : DatabaseBonus.getBonusDatabase()) {
            System.out.println(bonus.toString());
        }

        Location medan = new Location("Sumatera Barat", "Medan", "kota kedua terbesar");
        JobSeeker jason = new JobSeeker(1, "John", "johndoe@ui.ac.id", "12345", 2021, 4, 6);
        Recruiter eben = new Recruiter(1, "Hizkia Eben", "bond.007@gmail.com", "081234567890", medan);
        Job webdev = new Job(1, "Senior Designer", 500000, JobCategory.WebDeveloper, eben);
        JobSeeker doe = new JobSeeker(2, "Doe", "doe@ui.ac.id", "12345", 2021, 4, 6);
        Recruiter salman = new Recruiter(2, "Salman Alfarisi", "salman@gmail.com", "081234567890", medan);
        Job UI = new Job(2, "UI", 500000, JobCategory.UI, salman);
        JobSeeker jack = new JobSeeker(3, "Jack", "jack@ui.ac.id", "12345", 2021, 4, 6);
        Recruiter farhan = new Recruiter(3, "Muhammad Farhan", "farhan@gmail.com", "081234567890", medan);
        Job Devops = new Job(3, "DevOps", 500000, JobCategory.Devops, farhan);
        DatabaseJob.addJob(webdev);
        DatabaseJob.addJob(UI);
        DatabaseJob.addJob(Devops);
        BankPayment bpay1 = new BankPayment(1, DatabaseJob.getJobDatabase(), jason);
        BankPayment bpay2 = new BankPayment(1, DatabaseJob.getJobDatabase(),  doe);
        BankPayment bpay3 = new BankPayment(3, DatabaseJob.getJobDatabase(), jack);
        try {
            DatabaseInvoice.addInvoice((bpay1));
        } catch (OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice((bpay2));
        } catch (OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice((bpay3));
        } catch (OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
            new Thread(new FeeCalculator(invoice)).start();
        }
    }
}
*/