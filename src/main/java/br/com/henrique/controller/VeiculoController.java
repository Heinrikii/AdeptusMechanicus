package br.com.henrique.controller;

import br.com.henrique.dao.VeiculoDao;
import br.com.henrique.entidade.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScoped
public class VeiculoController {

    @Autowired
    private VeiculoDao veiculoDao;
    private Veiculo veiculo = new Veiculo();
    @ManyToOne
    private List veiculos = new ArrayList<>();

    @PostConstruct
    public void init(){
        listar();
    }

    public void salvar(){
        veiculoDao.save(veiculo);
        veiculo = new Veiculo();
        listar();
    }

    public void listar(){
        veiculos = veiculoDao.findAll();
    }

    public void excluir(Integer id){
        veiculoDao.deleteById(id);
        listar();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List veiculos) {
        this.veiculos = veiculos;
    }
}