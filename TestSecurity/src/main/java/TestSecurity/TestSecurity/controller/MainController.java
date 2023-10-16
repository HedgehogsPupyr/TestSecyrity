package TestSecurity.TestSecurity.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {


    @GetMapping("/")
    public String home ( Model model) {

        return "main";

    }

    @GetMapping("/chapterOne")
    public String chapterOne (Model model) {

        return "chapterOne";
    }

    @GetMapping("/chapterTwo")
    public String chapterTwo (Model model) {

        return "chapterTwo";
    }

    @GetMapping("/chapterThree")
    public String chapterThree (Model model) {

        return "chapterThree";
    }


    @PostMapping("/objectAdd")
    public String objectPostAdd (@RequestParam String object, @RequestParam String customer, @RequestParam String builder,
                              @RequestParam String architect, Model model) {


        return "redirect:/";
    }







}
