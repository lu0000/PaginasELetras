package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Autor;
import com.example.paginas_e_letras.model.Compra;
import com.example.paginas_e_letras.repository.ICompraRepository;

@Service
@Transactional(readOnly = false)
public class CompraService {
    @Autowired
    private ICompraRepository repository;

    public void salvar(Compra compra){
        repository.save(compra);
    }

    public void editar(Compra compra){
        repository.save(compra);
    }

    public void excluir(Compra compra){
        repository.delete(compra);
    }

    public void excluirPorId(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Compra> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Compra buscarPorId(Long id){
        return repository.findById(id).get();
    }
}
