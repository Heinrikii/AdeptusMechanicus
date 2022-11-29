package br.com.henrique.entidade;

import javax.persistence.*;

@Entity
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String marca;

	@Override
	public String toString() {return String.format("%s-%s", marca, nome);}

	public Integer getId() {return id;}

	public void setId(Integer id) {this.id = id;}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public String getMarca() {return marca;}

	public void setMarca(String marca) {this.marca = marca;}
}
