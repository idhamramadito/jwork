package idhamramadito.jwork.controller;

import idhamramadito.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
@RequestMapping("/recruiter")
@RestController

/**
 * Mengambil data semua recuiter yang ada
 * @param id
 * @return recruiter
 */
public class RecruiterController
{
    @RequestMapping("")
    public static ArrayList<Recruiter> getAllRecruiter()
    {
        return DatabaseRecruiter.getRecruiterDatabase();
    }

    /**
     * Mengambil data recruiter dari id-nya
     * @param id
     * @return recruiter
     */
    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
        }
        return recruiter;
    }

    /**
     * Melakukan register recruiter baru
     * @return recruiter
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="phoneNumber") String phoneNumber,
                                  @RequestParam(value="province") String province,
                                  @RequestParam(value="description") String description,
                                  @RequestParam(value="city") String city) throws RecruiterNotFoundException
    {
        Location location = new Location(province, city, description);
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, location);

        if (DatabaseRecruiter.addRecruiter(recruiter))
        {
            return recruiter;
        } else
        {
            return null;
        }
    }
}