package com.restaurante.jpa;

import com.restaurante.RestauranteApiApplication;
import com.restaurante.domain.model.Cozinha;
import com.restaurante.infra.repository.CozinhaRepositoryImp;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class BuscaCozinhaMain {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RestauranteApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepositoryImp cadastroCozinha = applicationContext.getBean(CozinhaRepositoryImp.class);

        Cozinha co = cadastroCozinha.buscar(1L);
        System.out.println(co.getId() + " - " + co.getNome());

    }
}
