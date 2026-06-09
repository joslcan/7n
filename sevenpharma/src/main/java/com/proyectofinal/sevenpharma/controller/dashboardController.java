package com.proyectofinal.sevenpharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class dashboardController {
    
    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "dashboard";
    }
    
}
