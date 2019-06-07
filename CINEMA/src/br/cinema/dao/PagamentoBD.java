package br.cinema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Pagamento;

public class PagamentoBD implements PagamentoDAO {

	private Connection conn = null;
	
	public PagamentoBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	@Override
	public void savePagamento(Pagamento pagamento) throws CinemaDAOException {
		String sql = "INSERT INTO tab_filme VALUES (?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, pagamento.getForma());
		
		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}

	@Override
	public boolean deletePagamento(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pagamento> getPagamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePagamento(Pagamento pagamento) {
		// TODO Auto-generated method stub
		
	}

}
