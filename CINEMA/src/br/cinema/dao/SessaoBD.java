package br.cinema.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Sessao;

public class SessaoBD implements SessaoDAO {

	
	private Connection conn = null;
	
	public SessaoBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	@Override
	public void saveSessao(Sessao sessao) throws CinemaDAOException {
		String sql = "INSERT INTO tab_filme VALUES (?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setDate(1, (Date) sessao.getData());
		stmt.setString(2, sessao.getHora());
		stmt.setFloat(3, sessao.getValor());
		stmt.setString(4, sessao.getTipo());

		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}

	@Override
	public boolean deleteSessao(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Sessao> getSessao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSessao(Sessao sessao) {
		// TODO Auto-generated method stub
		
	}
	

}
