package br.cinema.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Cliente;


public class ClienteBD implements ClienteDAO {
	
	
	private Connection conn = null;
	
	public ClienteBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	@Override
	public void saveCliente(Cliente cliente) throws CinemaDAOException {
		String sql = "INSERT INTO tab_cliente VALUES (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, cliente.getTipoCliente());
		stmt.setBoolean(2, cliente.isEstudante());
		stmt.setDate(3, (Date) cliente.getValidade());
		
		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}


	@Override
	public boolean deleteCliente(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cliente> getCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
