package com.restaurante.jpa;

import com.restaurante.RestauranteApiApplication;
import com.restaurante.infra.repository.CidadeRepositoryImp;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class ConsultaCidadeMain {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RestauranteApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CidadeRepositoryImp cidade = applicationContext.getBean(CidadeRepositoryImp.class);

        cidade
                .listar()
                .forEach(pag -> System.out.printf("%s/%s\n", pag.getNome(), pag.getEstado().getSigla()));

    }
}
