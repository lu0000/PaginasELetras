package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Autor;
import com.example.paginas_e_letras.repository.IAutorRepository;

@Service //Equivale a camada de serviço: Faz a lógica de negócio e as Transações
@Transactional(readOnly = false)
public class AutorService {
    
    private IAutorRepository repository;

    public void salvar(Autor autor){
        repository.save(autor);
    }

    public void editar(Autor autor){
        repository.save(autor);
    }

    public void excluir(Autor autor){
        repository.delete(autor);
    }

    @Transactional(readOnly = true)
    public List<Autor> buscarTodos(){
        return repository.findAll();
    }

    //A classe Optional é uma maneira de lidar com valores possivelmente nulos de maneira mais segura e explícita.
    @Transactional(readOnly = true)
    public Optional<Autor> buscarPorId(Long id){
        return repository.findById(id);
    }
    
}
