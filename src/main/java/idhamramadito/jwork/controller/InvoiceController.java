package idhamramadito.jwork.controller;

import idhamramadito.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
@RestController
@RequestMapping("/invoice")
public class InvoiceController
{
    /**
     * Mengambil data semua invoice yang ada
     * @return invoice
     */
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice()
    {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    /**
     * Mengambil data invoice dari id-nya
     * @param id
     * @return invoice
     */
    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id)
    {
        try {
            return DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
    }

    /**
     * Mengambil data invoice dari id jobseeker-nya
     * @param jobseekerId
     * @return invoice
     */
    @RequestMapping("/JobSeeker/{jobseekerId}")
    public ArrayList<Invoice> getInvoiceByJobseekerId(@PathVariable int jobseekerId)
    {
        JobSeeker jobseeker;

        try {
            jobseeker = DatabaseJobseekerPostgre.getJobSeekerFromId(jobseekerId);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
            return null;
        }

        return DatabaseInvoice.getInvoiceByJobSeeker(jobseekerId);
    }

    /**
     * Mengubah status dari invoice
     * @param id
     * @return invoice status
     */
    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id, @RequestParam InvoiceStatus invoiceStatus)
    {
        if (DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus))
        {
            try {
                return DatabaseInvoice.getInvoiceById(id);
            } catch (InvoiceNotFoundException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * Menghapus invoice yang dipilih
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public boolean removeInvoice(@PathVariable int id)
    {
        try {
            return DatabaseInvoice.removeInvoice(id);
        } catch (InvoiceNotFoundException e) {
            return false;
        }
    }

    /**
     * Membuat invoice dengan type bank payment
     * @param jobIdList
     * @return invoice bankpayment
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam ArrayList<Integer> jobIdList,
                                  @RequestParam int jobseekerId,
                                  @RequestParam int adminFee)
    {
        ArrayList<Job> jobs = new ArrayList<>();

        for (int id : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(id));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }

        JobSeeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobSeekerFromId(jobseekerId);
        } catch (JobSeekerNotFoundException e) {
            return null;
        }

        Invoice invoice = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, adminFee);

        invoice.setTotalFee();

        try {
            DatabaseInvoice.addInvoice(invoice);
            return invoice;
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
    }

    /**
     * Membuat invoice dengan type Ewallet payment
     * @param jobIdList
     * @return invoice Ewalletpayment
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam ArrayList<Integer> jobIdList,
                                     @RequestParam int jobseekerId,
                                     @RequestParam String referralCode)
    {
        ArrayList<Job> jobs = new ArrayList<>();

        for (int id : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(id));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }

        JobSeeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobSeekerFromId(jobseekerId);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
            return null;
        }

        Bonus bonus = null;
        bonus = DatabaseBonus.getBonusByReferralCode(referralCode);

        Invoice invoice = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, bonus);

        invoice.setTotalFee();

        try {
            DatabaseInvoice.addInvoice(invoice);
            return invoice;
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
    }
}
