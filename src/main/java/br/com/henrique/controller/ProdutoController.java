package br.com.henrique.controller;

import br.com.henrique.dao.ProdutoDao;
import br.com.henrique.entidade.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScoped
public class ProdutoController {

    @Autowired
    private ProdutoDao produtoDao;

    private Produto produto = new Produto();

    private List<Produto> produtos = new ArrayList<>();

    @PostConstruct
    public void init(){
        listar();
    }

    public void salvar(){
        produtoDao.save(produto);
        produto = new Produto();
        listar();
    }

    public void listar(){
        produtos = produtoDao.findAll();
    }

    public void excluir(Integer id){
        produtoDao.deleteById(id);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
