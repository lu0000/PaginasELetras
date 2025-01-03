package com.example.paginas_e_letras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Venda;
import com.example.paginas_e_letras.repository.IVendaRepository;

@Service
@Transactional(readOnly = false)
public class VendaService {
    
    @Autowired
    private IVendaRepository repository;

    public void salvar(Venda venda){
        repository.save(venda);
        System.out.println("Venda feita cadastrada com sucesso!");
    }

    public void editar(Venda venda){
        repository.save(venda);
    }

    public void excluir(Venda venda){
        repository.delete(venda);
    }

    public void excluirPorId(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Venda> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Venda buscarPorId(Long id){
        return repository.findById(id).get();
    }

}
