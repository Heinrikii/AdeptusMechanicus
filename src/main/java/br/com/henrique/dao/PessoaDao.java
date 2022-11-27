package br.com.henrique.dao;

import br.com.henrique.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Integer> {
}
