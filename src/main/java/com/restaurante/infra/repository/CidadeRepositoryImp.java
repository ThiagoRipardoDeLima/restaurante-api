package com.restaurante.infra.repository;

import com.restaurante.domain.model.Cidade;
import com.restaurante.domain.repository.CidadeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CidadeRepositoryImp implements CidadeRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cidade> listar(){
        TypedQuery<Cidade> query = manager.createQuery("from Cidade", Cidade.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public Cidade salvar(Cidade cidade){
        return manager.merge(cidade);
    }

    @Override
    public Cidade buscar(Long id) {
        return manager.find(Cidade.class, id);
    }

    @Transactional
    @Override
    public void remover(Cidade cidade){
        cidade = buscar(cidade.getId());
        manager.remove(cidade);
    }
}
