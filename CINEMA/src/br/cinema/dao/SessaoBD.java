package br.cinema.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Sessao;

public class SessaoBD {

	
	private Connection conn = null;
	
	public SessaoBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	
	public void saveSessao(Sessao sessao) throws CinemaDAOException {
		String sql = "INSERT INTO tab_sessao VALUES (?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, sessao.getData());
		stmt.setString(2, sessao.getHora());
		stmt.setString(3, sessao.getValor());
		stmt.setString(4, sessao.getTipo());

		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}

	
	public boolean deleteSessao(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<Sessao> getSessao() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void updateSessao(Sessao sessao) {
		// TODO Auto-generated method stub
		
	}
	

}
