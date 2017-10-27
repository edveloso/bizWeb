package br.edu.infnet.biz.app.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.edu.infnet.biz.app.modelo.Aluno;

@Repository
public class AlunoDao {
	
	@PersistenceContext
	private EntityManager em;

	public void salvar(Aluno aluno) {
		em.persist(aluno);
	}
	
	public List<Aluno> getAll(){
		return em.createQuery("select a from Aluno a").getResultList();
	}
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}
