package br.cinema.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Cliente;


public class ClienteBD {
	
	
	private Connection conn = null;
	
	public ClienteBD() {
		
			try {
				this.conn = FabricaConexao.getConnection();
			} catch (CinemaDAOException e) {
				
				e.printStackTrace();
			}
			
	}

	
	public void saveCliente(Cliente cliente) throws CinemaDAOException {
		String sql = "INSERT INTO tab_cliente VALUES (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			
		stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, cliente.getTipoCliente());
		stmt.setString(2, cliente.Estudante());
		stmt.setString(3, cliente.getValidade());
		
		
		stmt.execute();
	}catch(SQLException e ) {
		
		e.printStackTrace();
	}finally {
		FabricaConexao.closeConnection(conn, stmt);
		
		
	}
		
	}


	
	public boolean deleteCliente(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<Cliente> getCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
