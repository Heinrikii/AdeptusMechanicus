package br.com.henrique.cotroller;

import br.com.henrique.dao.EstoqueDao;
import br.com.henrique.entidade.Estoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScoped
public class EstoqueController {

    @Autowired
    private EstoqueDao estoqueDao;

    private Estoque estoque = new Estoque();

    private List<Estoque> estoques = new ArrayList<>();

    @PostConstruct
    public void init(){
        listar();
    }

    public void salvar(){
        estoqueDao.save(estoque);
        estoque = new Estoque();
        listar();
    }

    public void listar(){
        estoques = estoqueDao.findAll();
    }

    public void excluir(Integer id){
        estoqueDao.deleteById(id);
        listar();
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public List<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }
}
