package br.com.henrique.dao;

import br.com.henrique.entidade.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueDao extends JpaRepository<Estoque, Integer> {
}
