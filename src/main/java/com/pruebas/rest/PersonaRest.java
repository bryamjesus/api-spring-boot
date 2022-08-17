package com.pruebas.rest;

import com.pruebas.dao.PersonaDAO;
import com.pruebas.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personas")
public class PersonaRest {
    @Autowired
    private PersonaDAO personaDAO;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Persona persona) {
        personaDAO.save(persona);
    }

    @GetMapping("/listar")
    public List<Persona> listar(){
        return personaDAO.findAll();
    }


}
