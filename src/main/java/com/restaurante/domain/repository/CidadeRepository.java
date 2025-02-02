package com.restaurante.domain.repository;

import com.restaurante.domain.model.Cidade;

import java.util.List;

public interface CidadeRepository {
    List<Cidade> listar();
    Cidade buscar(Long id);
    Cidade salvar(Cidade estado);
    void remover(Cidade estado);
}
