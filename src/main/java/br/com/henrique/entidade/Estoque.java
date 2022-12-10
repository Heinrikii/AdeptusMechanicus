package br.com.henrique.entidade;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "estoque")
public class Estoque{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantidade;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Integer getQuantidade() {return quantidade;}

    public void setQuantidade(Integer quantidade) {this.quantidade = quantidade;}


}
