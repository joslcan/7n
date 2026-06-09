package com.proyectofinal.sevenpharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class entregaController {
    @GetMapping("/entregas")
    public String entregaPage() {
        return "entrega";
    }
    
    @PostMapping("/entregas")
    public String registrarEntrega(String hospital, String licitacion, String medicamento, int cantidad, String fecha, String estado){
        System.out.println("Entrega registrada: " + hospital + " - " + medicamento + " - " + cantidad);
        return "redirect:/entregas";
    }
}
