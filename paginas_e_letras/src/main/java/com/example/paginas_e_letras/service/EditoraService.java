package com.example.paginas_e_letras.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Editora;
import com.example.paginas_e_letras.repository.IEditoraRepository;

@Service
@Transactional(readOnly = false)
public class EditoraService {
    @Autowired
    private IEditoraRepository repository;

    public void salvar(Editora editora){
        repository.save(editora);
    }

    public void editar(Editora editora){
        repository.save(editora);
    }

    public void excluir(Editora editora){
        repository.delete(editora);
    }

    public void excluirPorId(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Editora> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Editora buscarPorId(Long id){
        return repository.findById(id).get();
    }
}
