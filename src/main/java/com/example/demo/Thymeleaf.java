package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.time.LocalDateTime;

@Controller
public class Thymeleaf {

    @GetMapping("/thymeleaf")
    public String welcome(Model model) {
        model.addAttribute("name", "Htut");
        model.addAttribute("currentDate", 1234);
        return "index"; // Corresponds to src/main/resources/templates/index.html
    }


}
