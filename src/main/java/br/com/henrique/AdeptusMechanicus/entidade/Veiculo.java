package br.com.henrique.AdeptusMechanicus.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer veiculo_id;
    private Date ano;
    private Date ano_modelo;
    private Integer km;
    private String placa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVeiculo_id() {
        return veiculo_id;
    }

    public void setVeiculo_id(Integer veiculo_id) {
        this.veiculo_id = veiculo_id;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Date getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(Date ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return String.format("%d - %d - %t - %t - %d - %s", veiculo_id, ano, ano_modelo, km, placa);
    }
}
