package idhamramadito.jwork.controller;

import idhamramadito.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RequestMapping("/bonus")
@RestController
public class BonusController
{
    /**
     * Mengambil data semua bonus yang ada
     * @return bonus
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllBonus()
    {

        return DatabaseBonusPostgre.getDatabaseBonus();
    }

    /**
     * Mengambil data bonus dari referral code-nya
     * @param referralCode
     * @return bonus
     */
    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String referralCode) {
        Bonus bonus = null;
        bonus = DatabaseBonusPostgre.getBonusByReferralCode(referralCode);
        return bonus;
    }

    /**
     * Melakukan penambahan bonus
     * @return bonus
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value="referralCode") String referralCode,
                          @RequestParam(value="extraFee") int extraFee,
                          @RequestParam(value="minTotalFee") int minTotalFee,
                          @RequestParam boolean active) throws ReferralCodeAlreadyExistsException
    {
        Bonus bonus = null;
        try {
            bonus = new Bonus(DatabaseBonusPostgre.getLastBonusId()+1, referralCode, extraFee, minTotalFee, active);
            DatabaseBonusPostgre.insertBonus(bonus);
        } catch (ReferralCodeAlreadyExistsException | SQLException e) {
            e.getMessage();
        }
        return bonus;
    }
}