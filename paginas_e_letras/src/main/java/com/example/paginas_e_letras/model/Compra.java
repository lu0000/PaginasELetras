package com.example.paginas_e_letras.model;

public class Compra {
    private Long id;
    private String forma_de_pagamento;
    private double valor_total;
    //desconto????
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getForma_de_pagamento() {
        return forma_de_pagamento;
    }
    public void setForma_de_pagamento(String forma_de_pagamento) {
        this.forma_de_pagamento = forma_de_pagamento;
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
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((forma_de_pagamento == null) ? 0 : forma_de_pagamento.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valor_total);
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
        Compra other = (Compra) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (forma_de_pagamento == null) {
            if (other.forma_de_pagamento != null)
                return false;
        } else if (!forma_de_pagamento.equals(other.forma_de_pagamento))
            return false;
        if (Double.doubleToLongBits(valor_total) != Double.doubleToLongBits(other.valor_total))
            return false;
        return true;
    }

    

    
}
