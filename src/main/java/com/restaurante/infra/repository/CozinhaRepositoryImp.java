package com.restaurante.infra.repository;

import com.restaurante.domain.model.Cozinha;
import com.restaurante.domain.repository.CozinhaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CozinhaRepositoryImp implements CozinhaRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> listar(){
        TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public Cozinha salvar(Cozinha cozinha){
        return manager.merge(cozinha);
    }

    @Override
    public Cozinha buscar(Long id) {
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public void remover(Cozinha cozinha){
        cozinha = buscar(cozinha.getId());
        manager.remove(cozinha);
    }
}
