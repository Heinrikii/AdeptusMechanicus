package br.com.henrique.entidade;

import javax.persistence.*;
import java.util.List;
@Entity
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String marca;

	@OneToMany(mappedBy = "modelo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Column(name = "veiculo")
	private List<Veiculo> veiculoList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Veiculo> getVeiculoList() {
		return veiculoList;
	}

	public void setVeiculoList(List<Veiculo> veiculoList) {
		this.veiculoList = veiculoList;
	}

	@Override
	public String toString() {return String.format("%s-%s", marca, nome);}

}
