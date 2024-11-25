package com.example.paginas_e_letras.model;

import jakarta.persistence.*;

@Entity
@Table(name = "VENDA")
public class Venda extends AbstractEntity<Long> {
    private String descrição_produto;
    private String forma_de_pagamento;
    private double desconto;
    private double valor_bruto;
    private double valor_liquido;
    
    
    public String getDescrição_produto() {
        return descrição_produto;
    }
    public void setDescrição_produto(String descrição_produto) {
        this.descrição_produto = descrição_produto;
    }
    public String getForma_de_pagamento() {
        return forma_de_pagamento;
    }
    public void setForma_de_pagamento(String forma_de_pagamento) {
        this.forma_de_pagamento = forma_de_pagamento;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double getValor_bruto() {
        return valor_bruto;
    }
    public void setValor_bruto(double valor_bruto) {
        this.valor_bruto = valor_bruto;
    }
    public double getValor_liquido() {
        return valor_liquido;
    }
    public void setValor_liquido(double valor_liquido) {
        this.valor_liquido = valor_liquido;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((descrição_produto == null) ? 0 : descrição_produto.hashCode());
        result = prime * result + ((forma_de_pagamento == null) ? 0 : forma_de_pagamento.hashCode());
        long temp;
        temp = Double.doubleToLongBits(desconto);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valor_bruto);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valor_liquido);
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
        Venda other = (Venda) obj;
        if (descrição_produto == null) {
            if (other.descrição_produto != null)
                return false;
        } else if (!descrição_produto.equals(other.descrição_produto))
            return false;
        if (forma_de_pagamento == null) {
            if (other.forma_de_pagamento != null)
                return false;
        } else if (!forma_de_pagamento.equals(other.forma_de_pagamento))
            return false;
        if (Double.doubleToLongBits(desconto) != Double.doubleToLongBits(other.desconto))
            return false;
        if (Double.doubleToLongBits(valor_bruto) != Double.doubleToLongBits(other.valor_bruto))
            return false;
        if (Double.doubleToLongBits(valor_liquido) != Double.doubleToLongBits(other.valor_liquido))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Venda [descrição_produto=" + descrição_produto + ", forma_de_pagamento=" + forma_de_pagamento
                + ", desconto=" + desconto + ", valor_bruto=" + valor_bruto + ", valor_liquido=" + valor_liquido + "]";
    }

    
    
}
