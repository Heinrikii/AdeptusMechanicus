package br.com.henrique.dao;

import br.com.henrique.entidade.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioDao extends JpaRepository<Municipio, Integer> {
}
