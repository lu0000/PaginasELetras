package com.example.paginas_e_letras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paginas_e_letras.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {


    public void deleteById(long id);
}
