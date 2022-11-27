package br.com.henrique.cotroller;

import br.com.henrique.dao.OrdemServicoProdutoDao;
import br.com.henrique.entidade.OrdemServicoProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScoped
public class OrdemServicoProdutoController {

    @Autowired
    private OrdemServicoProdutoDao ordemServicoProdutoDao;

    private OrdemServicoProduto ordemServicoProduto;

    private List<OrdemServicoProduto> ordemServicosProdutos = new ArrayList<>();

    @PostConstruct
    public void init(){
        listar();
    }

    public void salvar(){

        ordemServicoProduto = new OrdemServicoProduto();
        listar();
    }

    public void listar(){
        ordemServicoProdutoDao.findAll();
    }

    public void excluir(Integer id){
        ordemServicoProdutoDao.deleteById(id);
        listar();
    }

    public OrdemServicoProduto getOrdemServicoProduto() {
        return ordemServicoProduto;
    }

    public void setOrdemServicoProduto(OrdemServicoProduto ordemServicoProduto) {
        this.ordemServicoProduto = ordemServicoProduto;
    }

    public List<OrdemServicoProduto> getOrdemServicosProdutos() {
        return ordemServicosProdutos;
    }

    public void setOrdemServicosProdutos(List<OrdemServicoProduto> ordemServicosProdutos) {
        this.ordemServicosProdutos = ordemServicosProdutos;
    }
}
