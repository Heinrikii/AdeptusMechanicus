package br.com.henrique.dao;

import br.com.henrique.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Integer> {

    @Query(nativeQuery = true, value = "select * from pessoa p  where lower(p.nome) like lower(:nome)")
    List<Pessoa> listarPorNome(@Param("nome")String nome);

    @Query(nativeQuery = true, value = "select * from pessoa p where p.funcionario and lower(p.nome) like lower(:nome)")
    List<Pessoa> listarFuncionarioPorNome(@Param("nome")String nome);
}
