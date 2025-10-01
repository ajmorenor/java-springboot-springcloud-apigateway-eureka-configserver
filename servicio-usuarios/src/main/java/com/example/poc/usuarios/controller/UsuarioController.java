package com.example.poc.usuarios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Marca la clase como controlador REST
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    // Endpoint GET /usuarios
    @GetMapping
    public List<Usuario> listarUsuarios() {
        // Devuelve lista de usuarios de ejemplo
        return List.of(
                new Usuario(1, "Ana"),
                new Usuario(2, "Luis")
        );
    }
}

// Clase Usuario de ejemplo
class Usuario {
    private int id;
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() { return id; }
    public String getNombre() { return nombre; }
}