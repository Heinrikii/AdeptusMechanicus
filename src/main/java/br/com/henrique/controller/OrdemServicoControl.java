package br.com.henrique.controller;


import br.com.henrique.dao.*;
import br.com.henrique.entidade.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.SessionScoped;
import java.util.List;

@Component
@SessionScoped
public class OrdemServicoControl {

	private Integer pessoaId;

	private Integer servicoId;

	private Integer funcionarioId;

	@Autowired
	private VeiculoDao veiculoDao;
	@Autowired
	private OrdemServicoDao ordemServicoDao;

	@Autowired
	private PessoaDaoImpl pessoaDaoImpl;

	@Autowired
	private ServicoDao servicoDao;

	@Autowired
	private ProdutoDao produtoDao;

	private String placa;

	private OrdemServico ordemServico = new OrdemServico();

	private OrdemServicoServico ordemServicoServico = new OrdemServicoServico();

	private OrdemServicoProduto ordemServicoProduto = new OrdemServicoProduto();

	public void atualizarVeiculo() {
		Veiculo veiculo = veiculoDao.consultarPorPlaca(placa);
		ordemServico.setVeiculo(veiculo);
	}

	public void selecionarServico() {
		Servico servico = servicoDao.findById(servicoId).get();
		ordemServicoServico.setServico(servico);
		ordemServicoServico.setPreco(servico.getPreco());
	}

	public void salvar(){
		ordemServicoDao.save(ordemServico);
	}

	public void addServico() {
		ordemServicoServico.setPreco(ordemServicoServico.getServico().getPreco());
		ordemServico.getServicos().add(ordemServicoServico);
		ordemServicoServico = new OrdemServicoServico();
	}

	public void addProduto() {
		ordemServicoProduto.setPreco(ordemServicoProduto.getProduto().getPrecoVenda());
		ordemServico.getProdutos().add(ordemServicoProduto);
		ordemServicoProduto = new OrdemServicoProduto();
	}

	public List<Pessoa> completePessoa(String query) {
		List<Pessoa> result = pessoaDaoImpl.listarPorNome("%" + query + "%", null);
		return result;
	}

	public List<Servico> completeServico(String query) {
		return servicoDao.listarPorNome("%" + query + "%");
	}

	public List<Produto> completeProduto(String query) {
		return produtoDao.listarPorNomeProduto("%" + query + "%");
	}

	public List<Pessoa> completeFuncionario(String query) {
		return pessoaDaoImpl.listarPorNome("%" + query + "%", true);
	}

	public Integer getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Integer pessoaId) {
		this.pessoaId = pessoaId;
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
	public Integer getServicoId() {
		return servicoId;
	}
	public void setServicoId(Integer servicoId) {
		this.servicoId = servicoId;
	}
	public OrdemServicoServico getOrdemServicoServico() {
		return ordemServicoServico;
	}
	public void setOrdemServicoServico(OrdemServicoServico ordemServicoServico) {
		this.ordemServicoServico = ordemServicoServico;
	}
	public OrdemServicoProduto getOrdemServicoProduto() {
		return ordemServicoProduto;
	}
	public void setOrdemServicoProduto(OrdemServicoProduto ordemServicoProduto) {
		this.ordemServicoProduto = ordemServicoProduto;
	}
}
