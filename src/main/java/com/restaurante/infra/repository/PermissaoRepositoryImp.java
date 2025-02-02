package com.restaurante.infra.repository;

import com.restaurante.domain.model.Permissao;
import com.restaurante.domain.repository.PermissaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PermissaoRepositoryImp implements PermissaoRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permissao> listar(){
        TypedQuery<Permissao> query = manager.createQuery("from Permissao", Permissao.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public Permissao salvar(Permissao permissao){
        return manager.merge(permissao);
    }

    @Override
    public Permissao buscar(Long id) {
        return manager.find(Permissao.class, id);
    }

    @Transactional
    @Override
    public void remover(Permissao permissao){
        permissao = buscar(permissao.getId());
        manager.remove(permissao);
    }
}
