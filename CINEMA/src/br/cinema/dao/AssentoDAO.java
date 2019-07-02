package br.cinema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Assento;


public class AssentoDAO {
	public static Logger log = Logger.getLogger(AssentoDAO.class);
	
protected EntityManager em;
	
	public AssentoDAO() {
		
	em = getEntityManager();
	

}
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("cinema");
		
		if(em == null) {
			log.info("Criando conexao");
			em =factory.createEntityManager();
		}
		return em;
	}
	
	public void save(Assento assento) {
		log.info("Salvando assento");
		try {
			em.getTransaction().begin();
			em.persist(assento);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
		log.error ("Erro ao salvar o cliente"+e.getMessage());
			
			}finally {
				em.close();
			}
	}
	
	public void atualizar(Assento assento) {
		em.getTransaction().begin();
		em.merge(assento);
		em.getTransaction().commit();
	}
	
	public Assento getById(final int id) {
		return em.find(Assento.class, id);
	}
	
	public void remover(Assento assento) {
		em.getTransaction().begin();
		Assento assenremover = getById(assento.getId());
		em.remove(assenremover);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Assento> getAll(){
		return em.createQuery("FROM" + Assento.class.getName()).getResultList();
	}
	
}
