package com.restaurante.restaurante_api.teste;

import com.restaurante.restaurante_api.teste.modelo.Cliente;
import com.restaurante.restaurante_api.teste.notificacao.Notificador;
import com.restaurante.restaurante_api.teste.notificacao.NotificadorEmail;
import com.restaurante.restaurante_api.teste.notificacao.NotificadorSms;
import com.restaurante.restaurante_api.teste.service.AtivacaoClienteService;

public class main {
    public static void main(String[] args){
        Cliente joao = new Cliente("João", "joao@gmail.com", "65999319411");
        Cliente maria = new Cliente("Maria", "maria@gmail.com", "65999319411");

        Notificador notificador = new NotificadorSms();

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}
