package br.cinema.JPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	EntityManagerFactory emf = null;
	
	
//-------------------------------------------------------
	public Conexao() {
		if(emf == null) {
			emf = createEntity();
		}else {
			getEntity();
		}
	}
	
//-----------------------------------------------------
	public EntityManagerFactory getEntity() {
		return emf;
	}

	
	public EntityManagerFactory createEntity() {
		emf = Persistence.createEntityManagerFactory("CINEMA");
		return emf;
	}
	
	
	
	public void closeEMF() {
		emf.close();
	}
}
