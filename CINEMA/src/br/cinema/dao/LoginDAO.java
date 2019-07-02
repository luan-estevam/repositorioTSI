package br.cinema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.cinema.model.Login;



public class LoginDAO {
protected EntityManager em;
	
	public LoginDAO() {
		
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
	
	public void save(Login login) {
	
		try {
			em.getTransaction().begin();
			em.persist(login);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
			
			}finally {
				em.close();
			}
	}
	
	public void atualizar(Login login) {
		em.getTransaction().begin();
		em.merge(login);
		em.getTransaction().commit();
	}
	
	public Login getById(final int id) {
		return em.find(Login.class, id);
	}
	
	public void remover(Login login) {
		em.getTransaction().begin();
		Login logremover = getById(login.getId());
		em.remove(logremover);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Login> getAll(){
		return em.createQuery("FROM" + Login.class.getName()).getResultList();
	}
	
}
