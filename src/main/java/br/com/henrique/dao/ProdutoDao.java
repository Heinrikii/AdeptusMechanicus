package br.com.henrique.dao;

import br.com.henrique.entidade.Produto;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Integer> {

    @Query(nativeQuery = true, value = "select * from produto s where lower(s.nome) like lower(:nome)")
    List<Produto> listarPorNome(@Param("nome") String nome);
}
