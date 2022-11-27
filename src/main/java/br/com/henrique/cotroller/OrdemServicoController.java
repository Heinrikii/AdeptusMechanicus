package br.com.henrique.cotroller;

import br.com.henrique.dao.OrdemServicoDao;
import br.com.henrique.entidade.OrdemServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScoped
public class OrdemServicoController {

    @Autowired
    private OrdemServicoDao ordemServicoDAO;

    private OrdemServico ordemServico;

    private List<OrdemServico> ordensServicos = new ArrayList<>();

    @PostConstruct
    public void init(){
        listar();
    }

    public void salvar(){
        ordemServicoDAO.save(ordemServico);
        ordemServico = new OrdemServico();
        listar();
    }

    public void listar(){
        ordensServicos = ordemServicoDAO.findAll();
    }

    public void excluir(Integer id){
        ordemServicoDAO.deleteById(id);
        listar();
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public List<OrdemServico> getOrdensServicos() {
        return ordensServicos;
    }

    public void setOrdensServicos(List<OrdemServico> ordensServicos) {
        this.ordensServicos = ordensServicos;
    }
}
