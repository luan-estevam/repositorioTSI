package br.cinema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Assento;


public class AssentoBD {
	
	private Connection conn = null;
	
	public AssentoBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	
	public void saveAssento(Assento assento) throws CinemaDAOException {
		String sql = "INSERT INTO tab_assento VALUES (?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, assento.getTipo());
		stmt.setString(2, assento.getPoltrona());
		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}

	
	public boolean deleteAssento(int tipo) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<Assento> getAssento() {
		// TODO Auto-generated method stub
		return null;
	}


	public void updateMovie(Assento assento) {
		// TODO Auto-generated method stub
		

}

}
