package com.example.paginas_e_letras.model;


import jakarta.persistence.*;

@Entity
@Table(name = "FINANCEIRO")
public class Financeiro extends AbstractEntity<Long>{
    
    private double valor_caixa;

    private double entrada;

    private double saida;

    @Column(nullable = false)
    private String descricao;

    @OneToOne
    @JoinColumn(name = "compra_id_fk")
    private Compra compras;

    @OneToOne
    @JoinColumn(name = "venda_id_fk")
    private Venda vendas;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Compra getCompras() {
        return compras;
    }

    public void setCompras(Compra compras) {
        this.compras = compras;
    }

    public Venda getVendas() {
        return vendas;
    }

    public void setVendas(Venda vendas) {
        this.vendas = vendas;
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
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((compras == null) ? 0 : compras.hashCode());
        result = prime * result + ((vendas == null) ? 0 : vendas.hashCode());
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
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (compras == null) {
            if (other.compras != null)
                return false;
        } else if (!compras.equals(other.compras))
            return false;
        if (vendas == null) {
            if (other.vendas != null)
                return false;
        } else if (!vendas.equals(other.vendas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Financeiro [valor_caixa=" + valor_caixa + ", entrada=" + entrada + ", saida=" + saida + ", descricao="
                + descricao + ", vendas=" + vendas + ", compras=" + compras + "]";
    }

    
    
    
    
}
