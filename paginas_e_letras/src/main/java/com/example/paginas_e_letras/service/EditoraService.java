package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Editora;
import com.example.paginas_e_letras.repository.IEditoraRepository;

@Service
@Transactional(readOnly = false)
public class EditoraService {
    
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

    @Transactional(readOnly = true)
    public List<Editora> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Editora> buscarPorId(Long id){
        return repository.findById(id);
    }
}
