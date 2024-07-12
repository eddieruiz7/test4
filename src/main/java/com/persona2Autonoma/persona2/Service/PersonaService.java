package com.persona2Autonoma.persona2.Service;
import java.util.*;
import java.util.stream.Collectors;

import com.persona2Autonoma.persona2.Model.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    private List<Persona> personas;

    public PersonaService(){
        personas = new ArrayList<>();
    }

    // crear persona
    public Persona crearPersona(Persona persona){
        this.personas.add(persona);
        return persona;
    }

    // obtener todas las personas
    public List<Persona> obtenerPersonas(){
        return personas;
    }

    // obtener persona por cc
    public Optional<Persona> obtenerPersonaPorCedula(String cedula){
        return personas.stream()
                .filter(persona -> persona.getCedula().equals(cedula))
                .findFirst();
    }

    //obtener persona por ciudad
    public List<Persona> obtenerPersonaPorCiudad(String ciudad){
        return personas.stream()
                .filter(persona -> persona.getCiudad().equalsIgnoreCase(ciudad))
                .collect(Collectors.toList());
    }

    //eliminar persona
    public Optional<Persona> eliminarPersona(String cedula){
        personas.removeIf(persona -> persona.getCedula().equals(cedula));
        return null;
    }
}
