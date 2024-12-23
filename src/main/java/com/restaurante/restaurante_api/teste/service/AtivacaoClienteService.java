package com.restaurante.restaurante_api.teste.service;

import com.restaurante.restaurante_api.teste.modelo.Cliente;
import com.restaurante.restaurante_api.teste.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro está ativo");
    }
}
