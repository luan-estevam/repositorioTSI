package br.cinema.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;

import com.sun.istack.logging.Logger;

public class Teste {
	
	public static Logger log = Logger.getLogger(Teste.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cinema");
		EntityManager em = factory.createEntityManager();
//	}catch (Exception e) {
//		log.error("Erro na abertura da conexao"+e.getMessage());
//	}
	}
}
