package com.example.paginas_e_letras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paginas_e_letras.model.Financeiro;

public interface IFinanceiroRepository extends JpaRepository<Financeiro, Long> {
    public void deleteById(long id);
}
