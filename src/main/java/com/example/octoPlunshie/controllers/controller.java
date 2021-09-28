/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.octoPlunshie.controllers;

import com.example.octoPlunshie.entities.Persona;
import com.example.octoPlunshie.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola mundo";
    }
    
    @Autowired
    private PersonaRepository repoPer;
    
    @GetMapping("/add")
    public List<Persona> add(){
        Persona p = new Persona();
        p.setNombre("Daiggo");
        repoPer.save(p);
        return repoPer.findAll();
        
    }
}
