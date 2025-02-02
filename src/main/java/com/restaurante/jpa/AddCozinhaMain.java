package com.restaurante.jpa;

import com.restaurante.RestauranteApiApplication;
import com.restaurante.domain.model.Cozinha;
import com.restaurante.infra.repository.CozinhaRepositoryImp;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class AddCozinhaMain {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RestauranteApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepositoryImp cadastroCozinha = applicationContext.getBean(CozinhaRepositoryImp.class);

        Cozinha brasileira = new Cozinha();
        brasileira.setNome("Brasileira");

        Cozinha japonesa = new Cozinha();
        japonesa.setNome("Japonesa");

        cadastroCozinha.salvar(brasileira);
        cadastroCozinha.salvar(japonesa);


        cadastroCozinha.listar()
                .forEach(cozinha -> System.out.println(cozinha.getId() + " - " + cozinha.getNome()));

    }
}
