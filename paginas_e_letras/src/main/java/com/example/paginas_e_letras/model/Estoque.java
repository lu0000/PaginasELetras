package com.example.paginas_e_letras.model;

public class Estoque {
    private Long id;
    private int quant_produto;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (quant_produto != other.quant_produto)
            return false;
        return true;
    }

    
}
