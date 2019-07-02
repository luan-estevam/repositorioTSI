package br.cinema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Filme;

public class FilmeDAO {
	public static Logger log = Logger.getLogger(FuncionarioDAO.class);
	
protected EntityManager em;
	
	public FilmeDAO() {
		
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
	
	public void save(Filme filme) {
		log.info("Salvando filme");
		try {
			em.getTransaction().begin();
			em.persist(filme);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
		log.error ("Erro ao salvar o cliente"+e.getMessage());
			
			}finally {
				em.close();
			}
	}
	
	public void atualizar(Filme filme) {
		em.getTransaction().begin();
		em.merge(filme);
		em.getTransaction().commit();
	}
	
	public Filme getById(final int id) {
		return em.find(Filme.class, id);
	}
	
	public void remover(Filme filme) {
		em.getTransaction().begin();
		Filme filremover = getById(filme.getId());
		em.remove(filremover);
		em.getTransaction().commit();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Filme> getAll(){
		return em.createQuery("FROM" + Filme.class.getName()).getResultList();
	}
	


}
