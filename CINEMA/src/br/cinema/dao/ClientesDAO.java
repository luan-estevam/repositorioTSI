package br.cinema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import br.cinema.model.Cliente;

public class ClientesDAO {
	public static Logger log = Logger.getLogger(ClientesDAO.class);
	
	protected EntityManager em;
	
	public ClientesDAO() {
		
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
	
	public void save(Cliente cliente) {
		log.info("Salvando cliente");
		
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
		log.error ("Erro ao salvar o cliente"+e.getMessage());
			
			}finally {
				em.close();
			}
	}
	
	public void atualizar(Cliente cliente) {
				
		try {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		
	}catch(Exception e) {
		
	log.error ("Erro ao salvar o cliente"+e.getMessage());
		
		}finally {
			em.close();
		}
	}
	
	public Cliente getById(final int id) {
		return em.find(Cliente.class, id);
	}
	
	
	public void remover(Cliente cliente) {
		em.getTransaction().begin();
		Cliente cliremover = getById(cliente.getId());
		em.remove(cliremover);
		em.getTransaction().commit();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Cliente> getAll(){
		return em.createQuery("FROM" + Cliente.class.getName()).getResultList();
	}
	
}

