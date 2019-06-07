package br.cinema.dao;

import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.model.Sessao;

public interface SessaoDAO {

public void saveSessao(Sessao sessao) throws CinemaDAOException;
	
	public boolean deleteSessao(int id);
	
	public List<Sessao> getSessao();
	
	public void updateSessao(Sessao sessao);
	
}
