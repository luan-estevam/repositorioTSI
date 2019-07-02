package br.cinema.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;

import com.sun.istack.logging.Logger;

import br.cinema.dao.ClientesDAO;
import br.cinema.model.Cliente;

public class Teste {
	
	public static Logger log = Logger.getLogger(Teste.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cinema");
		
	
		
		
		EntityManager em = factory.createEntityManager();
		
		Cliente user = new Cliente();
		user.setNome("beto");
		user.setCpf("1234567-09");
		user.setEmail("beto@beto.com");
		user.setEndereco("end123");
		user.setEstudante(null);
		user.setSenha("12345");
		user.setTipoCliente("admin");
		ClientesDAO dao = new ClientesDAO();
		
		dao.save(user);
		

		
		
	}
}
