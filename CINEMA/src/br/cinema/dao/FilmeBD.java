package br.cinema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Filme;

public class FilmeBD {
	
	private Connection conn = null;
	
	public FilmeBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	
	public void saveFilme(Filme filme) throws CinemaDAOException {
		String sql = "INSERT INTO tab_filme VALUES (?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setInt(1, filme.getId());
		stmt.setString(2, filme.getTitulo());
		stmt.setString(3, filme.getDuracao());
		stmt.setString(4, filme.getClassificacao());
		stmt.setString(5, filme.getGenero());
		stmt.setString(6, filme.getResumo());
		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}

	
	public boolean deleteMovie(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<Filme> getMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void updateMovie(Filme filme) {
		// TODO Auto-generated method stub
		
	}
	
	

}
