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
        JobSeeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseeker.getJobSeekerById(id);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public JobSeeker addJobSeeker(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        JobSeeker jobseeker = new JobSeeker(DatabaseJobseeker.getLastId()+1, name, email, password);
        try {
            DatabaseJobseeker.addJobSeeker(jobseeker);
        } catch (EmailAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }
}