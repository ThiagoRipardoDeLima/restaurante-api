package com.restaurante.jpa;

import com.restaurante.RestauranteApiApplication;
import com.restaurante.infra.repository.PermissaoRepositoryImp;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class ConsultaPermissaoMain {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RestauranteApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        PermissaoRepositoryImp permissao = applicationContext.getBean(PermissaoRepositoryImp.class);

        permissao
                .listar()
                .forEach(pag -> System.out.printf("%s\n", pag.getNome()));

    }
}
