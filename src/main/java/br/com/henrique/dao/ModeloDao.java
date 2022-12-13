package br.com.henrique.dao;

import br.com.henrique.entidade.Modelo;
import br.com.henrique.entidade.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeloDao extends JpaRepository<Modelo, Integer> {

    @Query(nativeQuery = true, value = "select * from modelo m where lower(m.nome) like lower(:nome)")
    List<Modelo> listarPorNomeModelo(@Param("nome") String nome);
}
