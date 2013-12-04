package dao;

import java.sql.Connection;
import java.sql.SQLException;

import modelo.Cachorro;

public class CachorroDao {
	
	private Connection connection;
	
	/* Construtor */
	public CachorroDao() throws SQLException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionaCachorro(Cachorro cachorro) {
		
	}
		
}
