package br.com.henrique.cotroller;

import br.com.henrique.dao.*;
import br.com.henrique.entidade.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.faces.bean.SessionScoped;
import java.util.List;

@Component
@SessionScoped
public class OrdemServicoController {

    private Integer pessoaId;

    private Integer servicoId;

    private Integer funcionarioId;
    @Autowired
    private PessoaDao pessoaDao;
    @Autowired
    private VeiculoDao veiculoDao;

    private String placa;
    private OrdemServico ordemServico = new OrdemServico();

    private OrdemServicoServico ordenServicoServico = new OrdemServicoServico();

    @Autowired
    private PessoaDaoImplemente pessoaDaoImplemente;

    @Autowired
    private ServicoDao servicoDao;

    public void atualizarVeiculo(){
        Veiculo veiculo = veiculoDao.consultarPorPlaca(placa);
        ordemServico.setVeiculo(veiculo);
    }
    public void selecionarServico(){
        Servico servico = servicoDao.findById(servicoId).get();
        ordenServicoServico.setServico(servico);
        ordenServicoServico.setPreco(servico.getPreco());
    }
    public void addServico(){
        ordemServico.getServicos().add(ordenServicoServico);
        servicoId = null;
        ordenServicoServico = new OrdemServicoServico();
    }
    public List<Pessoa> completePessoa(String query){return pessoaDaoImplemente.listarPorNome("%" + query + "%", null);}
    public List<Servico> completeServico(String query){return servicoDao.listarPorNome("%" + query + "%");}
    public List<Pessoa> completeFuncionario(String query){return pessoaDaoImplemente.listarPorNome("%" + query + "%", true);}

    public Integer getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Integer pessoaId) {
        this.pessoaId = pessoaId;
    }

    public Integer getServicoId() {
        return servicoId;
    }

    public void setServicoId(Integer servicoId) {
        this.servicoId = servicoId;
    }

    public Integer getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Integer funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public OrdemServicoServico getOrdenServicoServico() {
        return ordenServicoServico;
    }

    public void setOrdenServicoServico(OrdemServicoServico ordenServicoServico) {
        this.ordenServicoServico = ordenServicoServico;
    }
}
