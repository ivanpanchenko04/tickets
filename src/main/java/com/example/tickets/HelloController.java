package com.example.tickets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(value = {"/", "/index"})
    public String greetMessage(Model model) {
        String greeting = "Hi Guys!";
        model.addAttribute("message", greeting);
        return "index";
    }
}
