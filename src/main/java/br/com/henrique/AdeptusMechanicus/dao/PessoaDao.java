package br.com.henrique.AdeptusMechanicus.dao;

import br.com.henrique.AdeptusMechanicus.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Integer> {
}
