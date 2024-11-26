package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Livro;
import com.example.paginas_e_letras.repository.ILivroRepository;

@Service
@Transactional(readOnly = false)
public class LivroService {
    @Autowired
    private ILivroRepository repository;

    public void salvar(Livro livro){
        System.out.println("Tentando salvar o livro: " + livro.getTitulo());
        repository.save(livro);
        System.out.println("Livro salvo com sucesso!");
    }

    public void editar(Livro livro){
        repository.save(livro);
    }

    public void excluir(Livro livro){
        repository.delete(livro);
    }

    @Transactional(readOnly = true)
    public List<Livro> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Livro> buscarPorId(Long id){
        return repository.findById(id);
    }
}
