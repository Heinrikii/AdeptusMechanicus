package br.com.henrique.cotroller;

import br.com.henrique.dao.MunicipioDao;
import br.com.henrique.entidade.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScoped
public class MunicipioController {

    @Autowired
    private MunicipioDao municipioDao;

    private Municipio municipio = new Municipio();

    private List<Municipio> municipios = new ArrayList<>();

    @PostConstruct
    public void init(){
        listar();
    }

    public void salvar(){
        municipioDao.save(municipio);
        municipio = new Municipio();
        listar();
    }

    public void listar(){
        municipios = municipioDao.findAll();
    }

    public void excluir(Integer id){
        municipioDao.deleteById(id);
        listar();
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }
}
