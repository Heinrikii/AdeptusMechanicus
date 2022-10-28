package br.com.henrique.AdeptusMechanicus.dao;

import br.com.henrique.AdeptusMechanicus.entidade.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueDao extends JpaRepository<Estoque, Integer> {
}
