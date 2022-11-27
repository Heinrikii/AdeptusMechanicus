package br.com.henrique.dao;

import br.com.henrique.entidade.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoDao extends JpaRepository<Servico, Integer> {
}
