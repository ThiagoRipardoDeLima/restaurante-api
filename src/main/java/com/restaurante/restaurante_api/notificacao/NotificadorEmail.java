package com.restaurante.restaurante_api.notificacao;

import com.restaurante.restaurante_api.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

    /*
    private boolean caixaAlta;
    private String hostSmtp;
    */

    @Value("${spring.notificador.email.host}")
    private String host;
    @Value("${spring.notificador.email.port}")
    private String port;

    public NotificadorEmail(){
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Host: " + this.host);
        System.out.println("Porta: " + this.port);
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

    /*
    public void setCaixaAlta(boolean caixaAlta){
        this.caixaAlta = caixaAlta;
    }*/
}
