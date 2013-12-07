package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Cachorro;

public class CachorroDao {
	
	private Connection connection;
	
	/* Construtor */
	public CachorroDao() throws SQLException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionaCachorro(Cachorro cachorro) {
		String sql = "insert into portaldodog " + 
				"(nome, infoGeral, nomeCientifico, perfil, temperamento, tamanhoMacho, tamanhoFemea, pesoMacho, pesoFemea, nivelEnergia, exercicio, brincalhao, nivelAfeicao, amigavelCachorros, amigavelAnimais, amigavelEstranhos, facilTreinar, guarda, habilidadeProtecao, cuidadosAparencia, toleranciaFrio, toleranciaCalor, saude, origem, grupo, link)" +
				" values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, cachorro.getNome());
			stmt.setString(2, cachorro.getInfoGeral());
			stmt.setString(3, cachorro.getNomeCientifico());
			stmt.setString(4, cachorro.getPerfil());
			stmt.setString(5, cachorro.getTemperamento());
			stmt.setString(6, cachorro.getTamanhoMacho());
			stmt.setString(7, cachorro.getTamanhoFemea());
			stmt.setString(8, cachorro.getPesoMacho());
			stmt.setString(9, cachorro.getPesoFemea());
			stmt.setString(10, cachorro.getNivelEnergia());
			stmt.setString(11, cachorro.getExercicio());
			stmt.setString(12, cachorro.getBrincalhao());
			stmt.setString(13, cachorro.getNivelAfeicao());
			stmt.setString(14, cachorro.getAmigavelCachorros());
			stmt.setString(15, cachorro.getAmigavelAnimais());
			stmt.setString(16, cachorro.getAmigavelEstranhos());
			stmt.setString(17, cachorro.getFacilTreinar());
			stmt.setString(18, cachorro.getGuarda());
			stmt.setString(19, cachorro.getHabilidadeProtecao());
			stmt.setString(20, cachorro.getCuidadosAparencia());
			stmt.setString(21, cachorro.getToleranciaFrio());
			stmt.setString(22, cachorro.getToleranciaCalor());
			stmt.setString(23, cachorro.getSaude());
			stmt.setString(24, cachorro.getOrigem());
			stmt.setString(25, cachorro.getGrupo());
			stmt.setString(26, cachorro.getLink());
			
			stmt.execute();
			System.out.println("Gravado " + cachorro.getNome() + " no banco.");
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
		
}
