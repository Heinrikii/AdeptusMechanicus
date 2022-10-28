package br.com.henrique.AdeptusMechanicus.dao;

import br.com.henrique.AdeptusMechanicus.entidade.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloDao extends JpaRepository<Modelo, Integer> {
}
