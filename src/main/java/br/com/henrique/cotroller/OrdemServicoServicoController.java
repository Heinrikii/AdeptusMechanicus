package br.com.henrique.cotroller;

import br.com.henrique.dao.OrdemServicoServicoDao;
import br.com.henrique.entidade.OrdemServicoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScoped
public class OrdemServicoServicoController {

    @Autowired
    private OrdemServicoServicoDao ordemServicoServicoDao;

    private OrdemServicoServico ordemServicoServico = new OrdemServicoServico();

    private List<OrdemServicoServico> ordensServicoServicos = new ArrayList<>();

    @PostConstruct
    public void init(){
        listar();
    }

    public void salvar(){
        ordemServicoServicoDao.save(ordemServicoServico);
        ordemServicoServico = new OrdemServicoServico();
        listar();
    }

    public void listar(){
        ordensServicoServicos = ordemServicoServicoDao.findAll();
    }

    public void excluir(Integer id){
        ordemServicoServicoDao.deleteById(id);
        listar();
    }

    public OrdemServicoServico getOrdemServicoServico() {
        return ordemServicoServico;
    }

    public void setOrdemServicoServico(OrdemServicoServico ordemServicoServico) {
        this.ordemServicoServico = ordemServicoServico;
    }

    public List<OrdemServicoServico> getOrdensServicoServicos() {
        return ordensServicoServicos;
    }

    public void setOrdensServicoServicos(List<OrdemServicoServico> ordensServicoServicos) {
        this.ordensServicoServicos = ordensServicoServicos;
    }
}
