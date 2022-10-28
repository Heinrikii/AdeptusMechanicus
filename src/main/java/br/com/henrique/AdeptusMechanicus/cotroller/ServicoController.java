package br.com.henrique.AdeptusMechanicus.cotroller;

import br.com.henrique.AdeptusMechanicus.dao.ServicoDao;
import br.com.henrique.AdeptusMechanicus.entidade.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScoped
public class ServicoController {

    @Autowired
    private ServicoDao servicoDao;
    private Servico servico = new Servico();
    private List<Servico> servicos = new ArrayList<>();

    @PostConstruct
    public void salvar(){
        servicoDao.save(servico);
        servico = new Servico();
        listar();
    }

    public void listar(){
        servicos = servicoDao.findAll();
    }

    public void excluir(Integer id){
        servicoDao.deleteById(id);
        listar();
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
}
