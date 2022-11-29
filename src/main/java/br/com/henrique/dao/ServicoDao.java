package br.com.henrique.dao;

import br.com.henrique.entidade.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoDao extends JpaRepository<Servico, Integer> {

    @Query(nativeQuery = true, value = "select * from servico s where lower(s.nome) like lower(:nome)")
    List<Servico> listarPorNome(@Param("nome")String nome);
}
