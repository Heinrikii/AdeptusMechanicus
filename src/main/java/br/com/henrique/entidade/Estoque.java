package br.com.henrique.entidade;

import javax.persistence.*;

@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Produto produto;

    private Integer quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {this.id = id;}

    public Produto getProduto() {return produto;}

    public void setProduto(Produto produto) {this.produto = produto;}

    public Integer getQuantidade() {return quantidade;}

    public void setQuantidade(Integer quantidade) {this.quantidade = quantidade;}

    @Override
    public String toString() {
        return "Estoque{" +
                "produto=" + produto +
                '}';
    }
}
