package br.com.henrique.entidade;

import javax.persistence.*;

@Entity
@Table(name = "municipio")
public class Municipio {
    @Id
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private EnumUf uf;
    @Column(name = "codigo_ibge")
    private Integer codigoIbge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public EnumUf getUf() {return uf;}

    public void setUf(EnumUf uf) {this.uf = uf;}

    public Integer getCodigoIbge() {return codigoIbge;}

    public void setCodigoIbge(Integer codigoIbge) {this.codigoIbge = codigoIbge;}
}
