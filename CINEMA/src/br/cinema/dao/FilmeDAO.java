package br.cinema.dao;

import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.model.Filme;

public interface FilmeDAO {
	
	public void saveFilme(Filme filme) throws CinemaDAOException;
	
	public boolean deleteMovie(int id);
	
	public List<Filme> getMovies();
	
	public void updateMovie(Filme filme);
}
