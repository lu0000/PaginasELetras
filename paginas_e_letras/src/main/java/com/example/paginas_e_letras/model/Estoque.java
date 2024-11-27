package com.example.paginas_e_letras.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "ESTOQUE")
public class Estoque extends AbstractEntity<Long>{
    
    @Column(nullable = false)
    private int quant_produto;
    
    @OneToMany(mappedBy = "estoque")
    private List<Livro> livros;

    public int getQuant_produto() {
        return quant_produto;
    }
    public void setQuant_produto(int quant_produto) {
        this.quant_produto = quant_produto;
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
        result = prime * result + quant_produto;
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
        Estoque other = (Estoque) obj;
        if (quant_produto != other.quant_produto)
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
        return "Estoque [quant_produto=" + quant_produto + ", livros=" + livros + "]";
    }
    

    
}
