package br.cinema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;

import br.cinema.model.Funcionarios;

public class FuncionarioDAO {
	public static Logger log = Logger.getLogger(FuncionarioDAO.class);

protected EntityManager em;
	
	public FuncionarioDAO() {
		
	em = getEntityManager();
	
	}
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("cinema");
		
		if(em == null) {
			em =factory.createEntityManager();
		}
		return em;
	}
	
	public void save(Funcionarios funcionarios) {
		log.info("Salvando funcionario");
		try {
			em.getTransaction().begin();
			em.persist(funcionarios);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
		log.error ("Erro ao salvar o funcionario"+e.getMessage());
			
			}finally {
				em.close();
			}
	}
	
	public void atualizar(Funcionarios funcionarios) {
		em.getTransaction().begin();
		em.merge(funcionarios);
		em.getTransaction().commit();
	}
	
	public Funcionarios getById(final int id) {
		return em.find(Funcionarios.class, id);
	}
	
	public void remover(Funcionarios funcionarios) {
		em.getTransaction().begin();
		Funcionarios funremover = getById(funcionarios.getId());
		em.remove(funremover);
		em.getTransaction().commit();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Funcionarios> getAll(){
		return em.createQuery("FROM" + Funcionarios.class.getName()).getResultList();
	}
}
