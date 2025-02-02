package com.restaurante.jpa;

import com.restaurante.RestauranteApiApplication;
import com.restaurante.infra.repository.FormaPagamentoRepositoryImp;
import com.restaurante.infra.repository.RestauranteRepositoryImp;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class ConsultaFormaPagamentoMain {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RestauranteApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        FormaPagamentoRepositoryImp pagamentos = applicationContext.getBean(FormaPagamentoRepositoryImp.class);

        pagamentos
                .listar()
                .forEach(pag -> System.out.printf("%s\n", pag.getDescricao()));

    }
}
