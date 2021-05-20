package idhamramadito.jwork.controller;

import idhamramadito.jwork.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/jobseeker")
@RestController
public class JobSeekerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/{id}")
    public JobSeeker getJobSeekerById(@PathVariable int id) {
        JobSeeker jobSeeker = null;
        try {
            jobSeeker = DatabaseJobseeker.getJobSeekerById(id);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return jobSeeker;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public JobSeeker registerJobSeeker( @RequestParam(value="name") String name,
                                        @RequestParam(value="email") String email,
                                        @RequestParam(value="password") String password)
    {
        JobSeeker jobSeeker = new JobSeeker(DatabaseJobseeker.getLastId()+1, name, email, password);
        try {
            DatabaseJobseeker.addJobSeeker(jobSeeker);
        } catch (EmailAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return jobSeeker;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JobSeeker loginJobSeeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password)
    {
        JobSeeker jobSeeker = loginJobSeeker(email, password);
        return jobSeeker;

    }
}