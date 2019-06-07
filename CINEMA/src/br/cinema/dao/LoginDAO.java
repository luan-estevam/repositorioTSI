package br.cinema.dao;

import java.util.List;

import br.cinema.JPA.CinemaDAOException;

import br.cinema.model.Login;

public interface LoginDAO {
	
public void saveLogin(Login login) throws CinemaDAOException;
	
	public boolean deleteLogin(int id);
	
	public List<Login> getLogin();
	
	public void updateLogin(Login login);

}
