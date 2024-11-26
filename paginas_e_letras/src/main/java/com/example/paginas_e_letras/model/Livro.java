package com.example.paginas_e_letras.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIVRO")
public class Livro extends AbstractEntity<Long>{
    
    @Column(nullable = false)
    private String titulo;
    
    @Column(nullable = false, unique = true)
    private String isbn;
    
    @Column(nullable = false)
    private String genero;
    
    @Column(nullable = false)
    private double valor;

    @ManyToOne
    @JoinColumn(name = "editora_id_fk")
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "autor_id_fk")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "estoque_id_fk")
    private Estoque estoque;

    @ManyToMany
    @JoinTable(name = "venda", joinColumns = @JoinColumn(name = "livro_id_fk"), inverseJoinColumns = @JoinColumn(name = "cliente_id_fk"))
    private List<Cliente> cliente = new ArrayList<>();


    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valor);
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
        Livro other = (Livro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", isbn=" + isbn + ", genero=" + genero + ", valor=" + valor
                + "]";
    }

    
}
