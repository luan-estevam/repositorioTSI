package br.cinema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Login;

public class LoginBD implements LoginDAO {

	private Connection conn = null;
	
	public LoginBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	@Override
	public void saveLogin(Login login) throws CinemaDAOException {
		String sql = "INSERT INTO tab_filme VALUES (?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, login.getUsuario());
		stmt.setString(2, login.getSenha());
		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}
	
	
	@Override
	public boolean deleteLogin(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Login> getLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLogin(Login login) {
		// TODO Auto-generated method stub
		
	}

}
