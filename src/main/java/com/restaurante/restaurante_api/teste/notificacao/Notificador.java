package com.restaurante.restaurante_api.teste.notificacao;

import com.restaurante.restaurante_api.teste.modelo.Cliente;

public interface Notificador {

    public void notificar(Cliente cliente, String mensagem);

}
