package com.example.paginas_e_letras.model;

import java.io.Serializable;

import jakarta.persistence.*;

//AbstractEntity -> essa classe serve como uma base genérica para todas as entidades que eu criar no sistema. Ela vai centralizar o tratamento do identificador único (ID) e seus métodos, para não precisar repetir nas outras classes.


@MappedSuperclass //Diz ao JPA que essa classe não será uma entidade por si só (não terá uma tabela no banco de dados), mas que suas propriedades serão herdadas por outras entidades que a estendem, o id será incluido em todas as tabelas das classes que estederam essa.
public abstract class AbstractEntity <ID extends Serializable> implements Serializable {//<ID extends Serializable> Permite que o tipo de dado do id seja flexível (int, long)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //@Id -> Indica que este campo é a chave primária | @GeneratedValue -> Configura o banco de dados para gerar os valores do ID automaticamente
    private ID id;


//Get, set, hashcode, equals e toString
    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        AbstractEntity<?> other = (AbstractEntity<?>) obj; //Precisou do <?> pois não foi dado um tipo para o atributo Id (int, Long...)
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AbstractEntity [id=" + id + "]";
    }
}
