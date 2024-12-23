package com.restaurante.restaurante_api.service;

import com.restaurante.restaurante_api.modelo.Cliente;
import com.restaurante.restaurante_api.notificacao.NivelUrgencia;
import com.restaurante.restaurante_api.notificacao.Notificador;
import com.restaurante.restaurante_api.notificacao.TipoDoNotificador;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    @PostConstruct
    public void init(){
        System.out.println("INIT");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("DESTROY");
    }

    public void ativar(Cliente cliente){
        cliente.ativar();
        if(notificador != null){
            notificador.notificar(cliente, "Seu cadastro está ativo");
        } else {
            System.out.println("Não existe notificador, mas cliente foi ativado");
        }

    }
}
