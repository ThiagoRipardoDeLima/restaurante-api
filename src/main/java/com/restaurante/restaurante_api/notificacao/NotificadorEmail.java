package com.restaurante.restaurante_api.notificacao;

import com.restaurante.restaurante_api.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

    /*
    private boolean caixaAlta;
    private String hostSmtp;
    */
    public NotificadorEmail(){
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

    /*
    public void setCaixaAlta(boolean caixaAlta){
        this.caixaAlta = caixaAlta;
    }*/
}
