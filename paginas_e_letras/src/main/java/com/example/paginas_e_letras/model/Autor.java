package com.example.paginas_e_letras.model;

import java.util.List;

import jakarta.persistence.*;

@Entity //a classe será mapeada para uma tabela no banco
@Table(name = "AUTOR") //define o nome da tabela
public class Autor extends AbstractEntity<Long>{
    
    @Column(nullable = false) //especificações da coluna (nullabel(é null ou não))
    private String nome_autor;

    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;

    public String getNome_autor() {
        return nome_autor;
    }
    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nome_autor == null) ? 0 : nome_autor.hashCode());
        result = prime * result + ((livros == null) ? 0 : livros.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Autor other = (Autor) obj;
        if (nome_autor == null) {
            if (other.nome_autor != null)
                return false;
        } else if (!nome_autor.equals(other.nome_autor))
            return false;
        if (livros == null) {
            if (other.livros != null)
                return false;
        } else if (!livros.equals(other.livros))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Autor [nome_autor=" + nome_autor + ", livros=" + livros + "]";
    } 


}
