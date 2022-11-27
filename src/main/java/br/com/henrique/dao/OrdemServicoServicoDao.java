package br.com.henrique.dao;

import br.com.henrique.entidade.OrdemServicoServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoServicoDao extends JpaRepository<OrdemServicoServico, Integer> {
}
