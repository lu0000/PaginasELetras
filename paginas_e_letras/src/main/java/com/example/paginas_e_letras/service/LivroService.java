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
        System.out.println("Livro excluido com sucesso!");
    }

    public void excluirPorId(Long id){
        repository.deleteById(id);
        System.out.println("Livro excluido com sucesso!");
    }

    @Transactional(readOnly = true)
    public List<Livro> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Livro> buscarPorId(Long id){
        System.out.println("Procurando o livro com id: " + id);
        return repository.findById(id); 
    }

    @Transactional(readOnly = true)
    public Livro buscarPorTitulo(String titulo){
        
        Livro livro = repository.findByTitulo(titulo);

        if (livro != null) {
            System.out.println("Livro encontrado: " + livro.getTitulo() + " | Valor: " + livro.getValor());
        } else {
            System.out.println("Nenhum livro encontrado com o título: " + titulo);
        }

        return livro;
        
        /*System.out.println("Procurando o livro: " + titulo);
        if (titulo != null) {
        repository.findByTitulo(titulo);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro.getTitulo() + " | Valor: " + livro.getValor());
        } else {
            System.out.println("Nenhum livro encontrado com o título: " + titulo);
        }
        return repository.findByTitulo(titulo);
        }*/
    }
}
