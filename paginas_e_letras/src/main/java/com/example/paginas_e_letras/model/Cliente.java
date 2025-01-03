package com.example.paginas_e_letras.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Cliente extends AbstractEntity<Long>{
    
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;
    
    @Column(nullable = false)
    private String Endereço;
    
    @Column(nullable = false)
    private String celular;

    @Column(nullable = true)
    private String email;

    @OneToMany (mappedBy = "clientes")
    private List<Venda> vendas;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereço() {
        return Endereço;
    }
    public void setEndereço(String endereço) {
        Endereço = endereço;
    }
    public List<Venda> getVendas() {
        return vendas;
    }
    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((Endereço == null) ? 0 : Endereço.hashCode());
        result = prime * result + ((celular == null) ? 0 : celular.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        Cliente other = (Cliente) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (Endereço == null) {
            if (other.Endereço != null)
                return false;
        } else if (!Endereço.equals(other.Endereço))
            return false;
        if (celular == null) {
            if (other.celular != null)
                return false;
        } else if (!celular.equals(other.celular))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
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
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", Endereço=" + Endereço + ", celular=" + celular + ", email="
                + email + ", vendas=" + vendas + "]";
    }
    
    

    

}
