package br.cinema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Pagamento;



public class PagamentoDAO {
	public static Logger log = Logger.getLogger(PagamentoDAO.class);

protected EntityManager em;
	
	public PagamentoDAO() {
		
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
	
	public void save(Pagamento pagamento) {
		log.info("Salvando cliente");
		try {
			em.getTransaction().begin();
			em.persist(pagamento);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
		log.error ("Erro ao salvar o cliente"+e.getMessage());
			
			}finally {
				em.close();
			}
	}
	
	public void atualizar(Pagamento pagamento) {
		em.getTransaction().begin();
		em.merge(pagamento);
		em.getTransaction().commit();
	}
	
	public Pagamento getById(final int id) {
		return em.find(Pagamento.class, id);
	}
	
	public void remover(Pagamento pagamento) {
		em.getTransaction().begin();
		Pagamento pagremover = getById(pagamento.getId());
		em.remove(pagremover);
		em.getTransaction().commit();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Pagamento> getAll(){
		return em.createQuery("FROM" + Pagamento.class.getName()).getResultList();
	}
	
}
