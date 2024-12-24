package com.restaurante.restaurante_api.listener;

import com.restaurante.restaurante_api.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event){
        System.out.println("Emitindo nota fiscal para o cliente " + event.getCliente().getNome());
    }
}
