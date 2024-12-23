package com.restaurante.restaurante_api.notificacao;

import com.restaurante.restaurante_api.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {

    /*
    private boolean caixaAlta;
    private String hostSmtp;
*/
    public NotificadorEmailMock(){
        System.out.println("NotificadorEmail MOCK");
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
