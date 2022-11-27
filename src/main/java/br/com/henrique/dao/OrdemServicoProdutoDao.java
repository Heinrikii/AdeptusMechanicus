package br.com.henrique.dao;

import br.com.henrique.entidade.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoProdutoDao extends JpaRepository<OrdemServico, Integer> {
}
