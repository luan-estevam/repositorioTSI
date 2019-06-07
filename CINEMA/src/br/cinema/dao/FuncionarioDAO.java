package br.cinema.dao;

import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.model.Funcionarios;

public interface FuncionarioDAO {

public void saveFuncionarios(Funcionarios funcionario) throws CinemaDAOException;
	
	public boolean deleteFuncionario(int id);
	
	public List<Funcionarios> getFuncionarios();
	
	public void updateFuncionarios(Funcionarios funcionario);
	
}
