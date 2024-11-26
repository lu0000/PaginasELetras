package com.example.paginas_e_letras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paginas_e_letras.model.Livro;

public interface ILivroRepository extends JpaRepository<Livro, Long>{

    public Livro findByNome(String nome);
}
