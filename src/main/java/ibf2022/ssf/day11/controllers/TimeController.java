package ibf2022.ssf.day11.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/time"}) //any request with /time should be handled by this controller. path is actually an array hence curlies
public class TimeController {
   
    @GetMapping
    public String getTime(Model model) {
        Date date = new Date();
        String currentTime = date.toString();

        System.out.printf(".. the current time is %s\n", currentTime); //to check if output is correct

        model.addAttribute("time", currentTime);
        return "time"; // returns the view combined with the model which is the final html
    }
}
