package com.restaurante.jpa;

import com.restaurante.RestauranteApiApplication;
import com.restaurante.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class AlteracaoCozinhaMain {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RestauranteApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        Cozinha brasileira = new Cozinha();
        brasileira.setId(1L);
        brasileira.setNome("Brasileira");

        cadastroCozinha.salvar(brasileira);

        cadastroCozinha.listar()
                .stream()
                .forEach(cozinha -> System.out.println(cozinha.getId() + " - " + cozinha.getNome()));

    }
}
