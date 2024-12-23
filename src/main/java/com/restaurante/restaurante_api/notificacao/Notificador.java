package com.restaurante.restaurante_api.notificacao;

import com.restaurante.restaurante_api.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
