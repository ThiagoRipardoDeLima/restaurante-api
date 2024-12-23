package com.restaurante.restaurante_api.teste.notificacao;

import com.restaurante.restaurante_api.modelo.Cliente;

public class NotificadorEmail {
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
