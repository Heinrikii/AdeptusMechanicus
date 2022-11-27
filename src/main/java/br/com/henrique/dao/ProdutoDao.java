package br.com.henrique.dao;

import br.com.henrique.entidade.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Integer> {
}
