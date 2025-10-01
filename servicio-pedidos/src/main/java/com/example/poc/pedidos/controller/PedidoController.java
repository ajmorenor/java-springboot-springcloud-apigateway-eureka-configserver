package com.example.poc.pedidos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @GetMapping
    public List<Pedido> listarPedidos() {
        return List.of(
                new Pedido(1, 1, 2),
                new Pedido(2, 2, 1)
        );
    }
}

class Pedido {
    private int id;
    private int idUsuario;
    private int idProducto;

    public Pedido(int id, int idUsuario, int idProducto) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
    }
    public int getId() { return id; }
    public int getIdUsuario() { return idUsuario; }
    public int getIdProducto() { return idProducto; }
}
