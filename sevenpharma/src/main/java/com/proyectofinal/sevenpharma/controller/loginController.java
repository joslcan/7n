package com.proyectofinal.sevenpharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class loginController {
    
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }   
    
    @PostMapping("/login")
    public String processLogin(String username, String password){
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "redirect:/dashboard";
        } else {
            return "login?error=true";
        }
    }

}
