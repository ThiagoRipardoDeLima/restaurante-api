package com.restaurante.restaurante_api.service;

import com.restaurante.restaurante_api.modelo.Cliente;
import com.restaurante.restaurante_api.notificacao.NivelUrgencia;
import com.restaurante.restaurante_api.notificacao.Notificador;
import com.restaurante.restaurante_api.notificacao.TipoDoNotificador;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @PostConstruct
    public void init(){
        System.out.println("INIT");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("DESTROY");
    }

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativar(Cliente cliente){
        cliente.ativar();
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }
}
