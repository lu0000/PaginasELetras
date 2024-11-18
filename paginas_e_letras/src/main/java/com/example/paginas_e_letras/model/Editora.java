package com.example.paginas_e_letras.model;
//https://cursos.alura.com.br/forum/topico-considere-os-requisitos-para-o-banco-de-dados-de-uma-livraria-164677
public class Editora {
    private Long id;
    private String nome;
    private String telefone;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    
}
