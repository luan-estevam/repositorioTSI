package br.cinema.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import br.cinema.app.Teste;

public class AutenticarDAO {
	
public static Logger log = Logger.getLogger(Teste.class);
	
	
	protected EntityManager em = null;

	public AutenticarDAO() {
		
	em = getEntityManager();
	
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cinema");

		if (em == null) {
			log.info("Criando conexao");
			em = factory.createEntityManager();
		}
		return em;
	}
	
	public boolean getLogin(String user, String pwd) {
		System.out.printf("user = %s e senha = %s", user, pwd);
		String sqlLogin = "from Cliente c where c.email = :email and c.senha = :senha\n";
		
		
		Query qLogin = em.createQuery(sqlLogin);
		qLogin.setParameter("email", user);	
		qLogin.setParameter("senha", pwd);
		
		if(qLogin.getResultList().size() > 0) return true;
		
		return false;
		
		
	}
	
	
}

