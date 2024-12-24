package com.restaurante.restaurante_api.listener;

import com.restaurante.restaurante_api.notificacao.NivelUrgencia;
import com.restaurante.restaurante_api.notificacao.Notificador;
import com.restaurante.restaurante_api.notificacao.TipoDoNotificador;
import com.restaurante.restaurante_api.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void ClienteAtivadoListener(ClienteAtivadoEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo");
    }

}
