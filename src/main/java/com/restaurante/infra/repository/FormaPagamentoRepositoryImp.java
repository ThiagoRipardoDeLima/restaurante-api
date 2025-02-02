package com.restaurante.infra.repository;

import com.restaurante.domain.model.FormaPagamento;
import com.restaurante.domain.repository.FormaPagamentoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class FormaPagamentoRepositoryImp implements FormaPagamentoRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<FormaPagamento> listar(){
        TypedQuery<FormaPagamento> query = manager.createQuery("from FormaPagamento", FormaPagamento.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return manager.merge(formaPagamento);
    }

    @Override
    public FormaPagamento buscar(Long id) {
        return manager.find(FormaPagamento.class, id);
    }

    @Transactional
    @Override
    public void remover(FormaPagamento formaPagamento){
        formaPagamento = buscar(formaPagamento.getId());
        manager.remove(formaPagamento);
    }
}
