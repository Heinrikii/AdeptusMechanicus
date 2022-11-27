package br.com.henrique.entidade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordem_servico")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    private Pessoa cliente;

    @ManyToOne(optional = false)
    private Pessoa funcionario;

    @ManyToOne(optional = false)
    private Veiculo veiculo;

    @OneToMany
    @JoinColumn(name="ordem_servico_id")
    private List<OrdemServicoProduto> produtos = new ArrayList<>();

    @OneToMany
    @JoinColumn(name="ordem_servico_id")
    private List<OrdemServicoServico> servicos = new ArrayList<>();

    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOs;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicioServico;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFimServico;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrega;

    private BigDecimal desconto;

}
