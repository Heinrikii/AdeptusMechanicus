package br.com.henrique.AdeptusMechanicus.dao;

import br.com.henrique.AdeptusMechanicus.entidade.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoDao extends JpaRepository<Servico, Integer> {
}
