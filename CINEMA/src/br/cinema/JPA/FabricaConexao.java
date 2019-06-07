package br.cinema.JPA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FabricaConexao {

	public static Connection getConnection() throws CinemaDAOException {// se conectar e lançar uma excessao

		try {
			Class.forName("org.mariadb.jdbc.Driver"); // procura o driver
			String user = "root";
			String senha = "";
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", user, senha);
		} catch (Exception ex) {// manda uma mensagem customizada mais comum: nao foi possivel encontrar tal
								// coisa
			throw new CinemaDAOException(ex.getMessage());
		}

	}

	public static void closeConnection(Connection conn, Statement stmt) throws CinemaDAOException {
		close(conn, stmt, null);
	}

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws CinemaDAOException {
		close(conn, stmt, null);
	}

	private static void close(Connection conn, Statement stmt, ResultSet rs) throws CinemaDAOException {

		try {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
		} catch (Exception ex) {
			throw new CinemaDAOException(ex.getMessage());
		}
	}

}
