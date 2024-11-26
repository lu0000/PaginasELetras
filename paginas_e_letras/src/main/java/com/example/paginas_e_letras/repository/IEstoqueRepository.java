package com.example.paginas_e_letras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paginas_e_letras.model.Estoque;

public interface IEstoqueRepository extends JpaRepository<Estoque, Long>{

    public Estoque alterar_estoque(Long id, int quantidade);
}
