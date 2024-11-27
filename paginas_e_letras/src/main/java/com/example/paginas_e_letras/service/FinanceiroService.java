package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Financeiro;
import com.example.paginas_e_letras.repository.IFinanceiroRepository;

@Service
@Transactional(readOnly = false)
public class FinanceiroService {
    @Autowired
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

    public void excluirPorId(Long id){
        repository.deleteById(id);
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
