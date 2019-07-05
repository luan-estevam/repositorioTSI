package br.cinema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Venda;


public class VendaDAO {
	
	public static Logger log = Logger.getLogger(VendaDAO.class);
	
	protected EntityManager em;
		
		public VendaDAO() {
			
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
		
		public void save(Venda venda) {
			log.info("Salvando venda");
			try {
				em.getTransaction().begin();
				em.persist(venda);
				em.getTransaction().commit();
				
			}catch(Exception e) {
				
			log.error ("Erro ao salvar o cliente"+e.getMessage());
				
				}finally {
					em.close();
				}
		}
		
		public void atualizar(Venda venda) {
			em.getTransaction().begin();
			em.merge(venda);
			em.getTransaction().commit();
		}
		
		public Venda getById(final int id) {
			return em.find(Venda.class, id);
		}
		
		public void remover(Venda venda) {
			em.getTransaction().begin();
			Venda vendremover = getById(venda.getId());
			em.remove(vendremover);
			em.getTransaction().commit();
		}
		
		@SuppressWarnings("unchecked")
		public List<Venda> getAll(){
			return em.createQuery("FROM" + Venda.class.getName()).getResultList();
		}

}
