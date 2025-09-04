package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        try {
            String hostname = InetAddress.getLocalHost().getHostName();
            model.addAttribute("hostname", hostname);
	    model.addAttribute("message", "Welcome to the updated Java 17 Web App!");
        } catch (Exception e) {
            model.addAttribute("hostname", "Unknown");
        }
        return "index";
    }
}

