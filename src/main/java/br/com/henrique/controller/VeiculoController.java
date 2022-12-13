package br.com.henrique.controller;

import br.com.henrique.dao.ModeloDao;
import br.com.henrique.dao.VeiculoDao;
import br.com.henrique.entidade.Modelo;
import br.com.henrique.entidade.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.persistence.ManyToOne;
import javax.transaction.Transactional;
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
    @Autowired
    private ModeloDao modeloDao;

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

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void excluir(Integer id){
        Veiculo v = veiculoDao.findById(id).get();
        veiculoDao.delete(v);
        listar();
    }
    public List<Modelo> completeModelo(String query){
        return modeloDao.listarPorNomeModelo("%" + query + "%");
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
