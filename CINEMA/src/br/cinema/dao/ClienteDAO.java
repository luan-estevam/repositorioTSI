package br.cinema.dao;

import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.model.Cliente;


public interface ClienteDAO {
	
public void saveCliente(Cliente cliente) throws CinemaDAOException;
	
	public boolean deleteCliente(int id);
	
	public List<Cliente> getCliente();
	
	public void updateCliente(Cliente cliente);

}
