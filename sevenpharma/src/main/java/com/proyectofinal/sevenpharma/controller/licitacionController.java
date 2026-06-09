package com.proyectofinal.sevenpharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class licitacionController {
    
    @GetMapping("/licitaciones")
    public String licitacionPage() {
        return "licitacion";
    }
    
    @PostMapping("/licitaciones")
    public String registrarLicitacion(String codigo, String hospital, String medicamento, String fecha){
        System.out.println("Licitacion registrada: " + codigo + " - " + hospital);
        return "redirect:/licitaciones";
    }

}
