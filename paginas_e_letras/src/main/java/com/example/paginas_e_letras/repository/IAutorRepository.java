package com.example.paginas_e_letras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paginas_e_letras.model.Autor;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
    //IAutorRepository é uma interface que está estendendo a interface Jpa Repository (já tem os métodos CRUD pronto), é passado para o JpaRepository os parametros <classe que ele vai trabalhar, tipo do id da classe>


    
}
