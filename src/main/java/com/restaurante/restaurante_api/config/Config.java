package com.restaurante.restaurante_api.config;

import com.restaurante.restaurante_api.notificacao.NotificadorEmail;
import com.restaurante.restaurante_api.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
//@Configuration
public class Config {

    //@Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.gmail.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }

    //@Bean
    public AtivacaoClienteService ativacaoClienteService(){
        return new AtivacaoClienteService(notificadorEmail());
    }

}*/
