package br.cinema.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import br.cinema.app.Teste;
import br.cinema.model.Cliente;

public class ClientesDAO {
	//public static Logger log = Logger.getLogger(ClientesDAO.class);
	
	protected EntityManager em;
	
	public ClientesDAO() {
		
	em = getEntityManager();
	
	}
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("cinema");
		
		if(em == null) {
			//log.info("Criando conexao");
			em =factory.createEntityManager();
		}
		return em;
	}
	
	public void save(Cliente cliente) {
		//log.info("Salvando cliente");
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
		//log.er ("Erro ao salvar o cliente"+e.getMessage());
			
			}finally {
				em.close();
			}
	}
	
}

