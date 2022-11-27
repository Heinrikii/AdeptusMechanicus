package br.com.henrique.dao;

import br.com.henrique.entidade.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloDao extends JpaRepository<Modelo, Integer> {
}
