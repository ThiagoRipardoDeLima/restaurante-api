package com.restaurante.restaurante_api.controller;

import com.restaurante.restaurante_api.service.AtivacaoClienteService;
import com.restaurante.restaurante_api.modelo.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PedidoController {

    private AtivacaoClienteService ativacaoCliente;

    public PedidoController(AtivacaoClienteService ativacaoCliente){
        this.ativacaoCliente = ativacaoCliente;

        System.out.println("PedidoController: " + ativacaoCliente);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

        Cliente joao = new Cliente("João", "joao@gmail.com", "65999319411");
        ativacaoCliente.ativar(joao);

        return "ola tudo otimo";
    }
}
