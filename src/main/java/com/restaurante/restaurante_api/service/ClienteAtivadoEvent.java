package com.restaurante.restaurante_api.service;

import com.restaurante.restaurante_api.modelo.Cliente;

public class ClienteAtivadoEvent {

    private Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente){
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
