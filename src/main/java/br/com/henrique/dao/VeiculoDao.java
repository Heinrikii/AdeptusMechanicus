package br.com.henrique.dao;

import br.com.henrique.entidade.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoDao extends JpaRepository<Veiculo, Integer> {

    @Query(nativeQuery = true, value = "select * from veiculo where lower(placa) = lower(:placa)")
    Veiculo consultarPorPlaca(@Param("placa")String placa);
}
