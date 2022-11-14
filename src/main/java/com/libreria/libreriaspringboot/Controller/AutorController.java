package com.libreria.libreriaspringboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libreria.libreriaspringboot.Service.AutorService;

@Controller
@RequestMapping("/autores")
public class AutorController {
    
    @Autowired
    private AutorService service;

    @GetMapping("/listar")
    public String listarAutores(Model model){
        model.addAttribute("autores", service.listarAutores());
        return "autor/autores";
    }
}
