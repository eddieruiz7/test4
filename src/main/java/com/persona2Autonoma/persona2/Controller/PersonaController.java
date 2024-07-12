package com.persona2Autonoma.persona2.Controller;
import com.persona2Autonoma.persona2.Model.Persona;
import com.persona2Autonoma.persona2.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {
    private PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }

    //crear persona
    @PostMapping("/crear")
    public Persona crearPersona(@RequestBody Persona persona){
        return this.personaService.crearPersona(persona);
    }

    //obtener todas las personas
    @GetMapping("/personas")
    public List<Persona> obtenerPersonas(){
        return this.personaService.obtenerPersonas();
    }

    //obtener persona por cc
    @GetMapping("/personas/{cedula}")
    public Optional<Persona> obtenerPersonaCC(@PathVariable("cedula") String cedula){
        return this.personaService.obtenerPersonaPorCedula(cedula);
    }

    //obtener persona por ciudad
    @GetMapping("/personas/")
    public List<Persona> obtenerPersonaPorCiudad(@RequestParam("ciudad") String ciudad){
        return this.personaService.obtenerPersonaPorCiudad(ciudad);
    }

    //eliminar persona por cc
    @DeleteMapping("/personas/{cedula}")
    public Optional<Persona> eliminarPersona(@PathVariable("cedula") String cedula){
        return this.personaService.eliminarPersona(cedula);
    }
}
