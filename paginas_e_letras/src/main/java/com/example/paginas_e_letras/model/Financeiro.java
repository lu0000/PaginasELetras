package com.example.paginas_e_letras.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FINANCEIRO")
public class Financeiro extends AbstractEntity<Long>{
    
    @Column(nullable = false)
    private double receita;

    @Column(nullable = false)
    private double despesas;
    
    public double getReceita() {
        return receita;
    }
    public void setReceita(double receita) {
        this.receita = receita;
    }
    public double getDespesas() {
        return despesas;
    }
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(receita);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(despesas);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Financeiro other = (Financeiro) obj;
        if (Double.doubleToLongBits(receita) != Double.doubleToLongBits(other.receita))
            return false;
        if (Double.doubleToLongBits(despesas) != Double.doubleToLongBits(other.despesas))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Financeiro [receita=" + receita + ", despesas=" + despesas + "]";
    }
    
    
}
