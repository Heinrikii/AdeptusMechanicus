package br.com.henrique.dao;

import br.com.henrique.entidade.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PessoaDaoImpl {

	@Autowired
	private EntityManager em;
	
	public List<Pessoa> listarPorNome(String nome, Boolean funcionario){
		String sql = "select * from pessoa p where lower(p.nome) like lower(:nome)";
		
		if(funcionario != null) {
			sql += " and p.funcionario";
		}
		
		Query query = em.createNativeQuery(sql, Pessoa.class);
		query.setParameter("nome", nome);
		return query.getResultList();
	}
}
