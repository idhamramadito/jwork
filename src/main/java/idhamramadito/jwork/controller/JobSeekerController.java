package idhamramadito.jwork.controller;


import idhamramadito.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
@RequestMapping("/jobseeker")
@RestController

public class JobSeekerController
{
    /**
     * Mengambil data jobseeker dari id-nya
     * @param id
     * @return jobseeker
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public JobSeeker getJobseekerById(@PathVariable int id) {
        JobSeeker jobSeeker = null;
        try {
            jobSeeker = DatabaseJobseekerPostgre.getJobSeekerFromId(id);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return jobSeeker;
    }

    /**
     * Melakukan register jobseeker baru
     * @return jobseeker
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public JobSeeker registerJobseeker(@RequestParam(value="name") String name,
                                       @RequestParam(value="email") String email,
                                       @RequestParam(value="password") String password) throws SQLException {
        JobSeeker jobseeker = new JobSeeker(DatabaseJobseekerPostgre.getLastJobSeekerId()+1, name, email, password);
        try {
            DatabaseJobseekerPostgre.insertJobSeeker(jobseeker);
        } catch (EmailAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    /**
     * Melakukan login jobseeker
     * @return jobseeker
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JobSeeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password) throws SQLException {
        JobSeeker jobseeker = DatabaseJobseekerPostgre.jobseekerLogin(email, password);
        return jobseeker;
    }
}