package com.example.paginas_e_letras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paginas_e_letras.model.Editora;

public interface IEditoraRepository extends JpaRepository<Editora, Long>{
    public void deleteById(long id);

    
}
