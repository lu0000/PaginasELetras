package com.example.paginas_e_letras.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ESTOQUE")
public class Estoque extends AbstractEntity<Long>{
    
    @Column(nullable = false)
    private int quant_produto;
    

    public int getQuant_produto() {
        return quant_produto;
    }
    public void setQuant_produto(int quant_produto) {
        this.quant_produto = quant_produto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + quant_produto;
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estoque other = (Estoque) obj;
        if (quant_produto != other.quant_produto)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Estoque [quant_produto=" + quant_produto + "]";
    }

    
}
