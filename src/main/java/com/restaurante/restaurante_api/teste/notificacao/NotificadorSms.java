package com.restaurante.restaurante_api.teste.notificacao;

import com.restaurante.restaurante_api.teste.modelo.Cliente;

public class NotificadorSms implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
