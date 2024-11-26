package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Estoque;
import com.example.paginas_e_letras.repository.IEstoqueRepository;

@Service
@Transactional(readOnly = false)
public class EstoqueService {
    
    private IEstoqueRepository repository;

    public void salvar(Estoque estoque){
        repository.save(estoque);
    }

    public void editar(Estoque estoque){
        repository.save(estoque);
    }

    public void excluir(Estoque estoque){
        repository.delete(estoque);
    }

    @Transactional(readOnly = true)
    public List<Estoque> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Estoque> buscarPorId(Long id){
        return repository.findById(id);
    }

    
}
