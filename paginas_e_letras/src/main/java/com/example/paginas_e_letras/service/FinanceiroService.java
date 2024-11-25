package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Financeiro;
import com.example.paginas_e_letras.repository.IFinanceiroRepository;

@Service
@Transactional(readOnly = false)
public class FinanceiroService {
    
    private IFinanceiroRepository repository;

    public void salvar(Financeiro financeiro){
        repository.save(financeiro);
    }

    public void editar(Financeiro financeiro){
        repository.save(financeiro);
    }

    public void excluir(Financeiro financeiro){
        repository.delete(financeiro);
    }

    @Transactional(readOnly = true)
    public List<Financeiro> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Financeiro> buscarPorId(Long id){
        return repository.findById(id);
    }
}
