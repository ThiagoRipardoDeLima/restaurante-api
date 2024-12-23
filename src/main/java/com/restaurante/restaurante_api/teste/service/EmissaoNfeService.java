package com.restaurante.restaurante_api.teste.service;

import com.restaurante.restaurante_api.teste.modelo.Cliente;
import com.restaurante.restaurante_api.teste.modelo.Produto;
import com.restaurante.restaurante_api.teste.notificacao.Notificador;
import com.restaurante.restaurante_api.teste.notificacao.NotificadorEmail;

public class EmissaoNfeService {

    private Notificador notificador;

    public EmissaoNfeService(Notificador notificador){
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto){
        this.notificador.notificar(cliente, "Nota Fiscal do Produto " + produto.getNome() + " foi emitida");
    }
}
