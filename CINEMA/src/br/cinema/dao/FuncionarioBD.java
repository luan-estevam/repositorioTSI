package br.cinema.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Funcionarios;

public class FuncionarioBD{

	private Connection conn = null;
	
	public FuncionarioBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	
	public void saveFuncionarios(Funcionarios funcionario) throws CinemaDAOException {
		String sql = "INSERT INTO tab_funcionario VALUES (?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, funcionario.getSalario());
		stmt.setString(2, funcionario.getFuncao());
		stmt.setString(3, funcionario.getDataAdmissao());
		stmt.setString(4, funcionario.getTurno());
		
		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}

	
	public boolean deleteFuncionario(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<Funcionarios> getFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void updateFuncionarios(Funcionarios funcionario) {
		// TODO Auto-generated method stub
		
	}

}
