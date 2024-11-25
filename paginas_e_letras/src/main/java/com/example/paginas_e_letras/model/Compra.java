package com.example.paginas_e_letras.model;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPRA")
public class Compra extends AbstractEntity<Long>{
    
    @Column(nullable = false)
    private String descrição_compra;

    @Column(nullable = false)
    private double valor_total;

    public String getDescrição_compra() {
        return descrição_compra;
    }

    public void setDescrição_compra(String descrição_compra) {
        this.descrição_compra = descrição_compra;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((descrição_compra == null) ? 0 : descrição_compra.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valor_total);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Compra other = (Compra) obj;
        if (descrição_compra == null) {
            if (other.descrição_compra != null)
                return false;
        } else if (!descrição_compra.equals(other.descrição_compra))
            return false;
        if (Double.doubleToLongBits(valor_total) != Double.doubleToLongBits(other.valor_total))
            return false;
        return true;
    }

    
}
