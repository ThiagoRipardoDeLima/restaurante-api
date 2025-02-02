package com.restaurante.jpa;

import com.restaurante.RestauranteApiApplication;
import com.restaurante.infra.repository.CozinhaRepositoryImp;
import com.restaurante.infra.repository.RestauranteRepositoryImp;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class ConsultaRestauranteMain {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RestauranteApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepositoryImp cadastroCozinha = applicationContext.getBean(RestauranteRepositoryImp.class);

        cadastroCozinha
                .listar()
                .forEach(res -> System.out.printf(
                        "%s - %f - %s\n", res.getNome(), res.getTaxaFrete(), res.getCozinha().getNome()
                ));

    }
}
