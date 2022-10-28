package br.com.henrique.AdeptusMechanicus.dao;

import br.com.henrique.AdeptusMechanicus.entidade.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoDao extends JpaRepository<Veiculo, Integer> {
}
