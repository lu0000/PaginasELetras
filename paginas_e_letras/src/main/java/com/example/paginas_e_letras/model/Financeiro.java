package com.example.paginas_e_letras.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "FINANCEIRO")
public class Financeiro extends AbstractEntity<Long>{
    
    private double valor_caixa;

    private double entrada;

    private double saida;

    @Column(nullable = false)
    private double descricao;

    @OneToMany(mappedBy = "financeiro")
    private List<Venda> vendas;

    @OneToMany(mappedBy = "financeiro")
    private List<Compra> compras;


    public double getValor_caixa() {
        return valor_caixa;
    }

    public void setValor_caixa(double valor_caixa) {
        this.valor_caixa = valor_caixa;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }

    public double getDescricao() {
        return descricao;
    }

    public void setDescricao(double descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(valor_caixa);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(entrada);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(saida);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(descricao);
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
        Financeiro other = (Financeiro) obj;
        if (Double.doubleToLongBits(valor_caixa) != Double.doubleToLongBits(other.valor_caixa))
            return false;
        if (Double.doubleToLongBits(entrada) != Double.doubleToLongBits(other.entrada))
            return false;
        if (Double.doubleToLongBits(saida) != Double.doubleToLongBits(other.saida))
            return false;
        if (Double.doubleToLongBits(descricao) != Double.doubleToLongBits(other.descricao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Financeiro [valor_caixa=" + valor_caixa + ", entrada=" + entrada + ", saida=" + saida + ", descricao="
                + descricao + "]";
    }
    
    
    
}
