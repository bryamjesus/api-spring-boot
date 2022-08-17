package com.pruebas.rest;

import com.pruebas.dao.PersonaDAO;
import com.pruebas.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personas")
public class PersonaRest {
    @Autowired
    private PersonaDAO personaDAO;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Persona persona) {
        personaDAO.save(persona);
    }


}
