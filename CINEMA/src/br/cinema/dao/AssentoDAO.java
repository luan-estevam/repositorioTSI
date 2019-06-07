package br.cinema.dao;

import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.model.Assento;


public interface AssentoDAO {
	
	public void saveAssento(Assento assento) throws CinemaDAOException;
	
	public boolean deleteAssento(int id);
	
	public List<Assento> getAssento();
	
	public void updateMovie(Assento assento);

}
