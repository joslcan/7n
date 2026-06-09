package com.proyectofinal.sevenpharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class reporteController {
    
    @GetMapping("/reportes")
    public String reportePage() {
        return "reporte";
    }
    
}
