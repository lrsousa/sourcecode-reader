package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import modelo.Cachorro;


import sourceCodeReader.EscreveCachorro;

public class test {

	public static void main(String[] args) throws MalformedURLException, IOException, SQLException {

		EscreveCachorro escrever = new EscreveCachorro();
		escrever.comecaEscrever();
		
		int maiorNome = 0;
		int maiorInfo = 0;
		int maiorNomeCientifico = 0;
		int maiorPerfil = 0;
		int maiorSaude = 0;
		int maiorOrigem = 0;
		int maiorTemperamento = 0;
		int maiorTamanhoMacho = 0;
		int maiorTamanhoFemea = 0;
		int maiorPesoMacho = 0;
		int maiorPesoFemea = 0;
		
		
		for (Cachorro cachorro : escrever.getCachorros()) {
			System.out.println("====================================");
			System.out.println(cachorro.getNome());
			if(cachorro.getNome().length() >= maiorNome) {
				maiorNome = cachorro.getNome().length();
			}
			System.out.println(cachorro.getInfoGeral());
			if(cachorro.getInfoGeral().length() >= maiorInfo) {
				maiorInfo = cachorro.getInfoGeral().length();
			}
			System.out.println(cachorro.getNomeCientifico());
			if(cachorro.getNomeCientifico().length() >= maiorNomeCientifico) {
				maiorNomeCientifico = cachorro.getNomeCientifico().length();
			}
			System.out.println(cachorro.getPerfil());
			if(cachorro.getPerfil().length() >= maiorPerfil) {
				maiorPerfil = cachorro.getPerfil().length();
			}
			System.out.println(cachorro.getTemperamento());
			if(cachorro.getTemperamento().length() >= maiorTemperamento) {
				maiorTemperamento = cachorro.getTemperamento().length();
			}
			System.out.println(cachorro.getTamanhoMacho());
			if(cachorro.getTamanhoMacho().length() >= maiorTamanhoMacho) {
				maiorTamanhoMacho = cachorro.getTamanhoMacho().length();
			}
			System.out.println(cachorro.getTamanhoFemea());
			if(cachorro.getTamanhoFemea().length() >= maiorTamanhoFemea) {
				maiorTamanhoFemea = cachorro.getTamanhoFemea().length();
			}
			System.out.println(cachorro.getPesoMacho());
			if(cachorro.getPesoMacho().length() >= maiorPesoMacho) {
				maiorPesoMacho = cachorro.getPesoMacho().length();
			}
			System.out.println(cachorro.getPesoFemea());
			if(cachorro.getPesoFemea().length() >= maiorPesoFemea) {
				maiorPesoFemea = cachorro.getPesoFemea().length();
			}
			System.out.println(cachorro.getNivelEnergia());
			System.out.println(cachorro.getExercicio());
			System.out.println(cachorro.getBrincalhao());
			System.out.println(cachorro.getNivelAfeicao());
			System.out.println(cachorro.getAmigavelCachorros());
			System.out.println(cachorro.getAmigavelAnimais());
			System.out.println(cachorro.getAmigavelEstranhos());
			System.out.println(cachorro.getFacilTreinar());
			System.out.println(cachorro.getGuarda());
			System.out.println(cachorro.getHabilidadeProtecao());
			System.out.println(cachorro.getCuidadosAparencia());
			System.out.println(cachorro.getToleranciaFrio());
			System.out.println(cachorro.getToleranciaCalor());
			System.out.println(cachorro.getSaude());
			if(cachorro.getSaude().length() >= maiorSaude) {
				maiorSaude = cachorro.getSaude().length();
			}
			System.out.println(cachorro.getOrigem());
			if(cachorro.getOrigem().length() >= maiorOrigem) {
				maiorOrigem = cachorro.getOrigem().length();
			}
			System.out.println(cachorro.getGrupo());
			System.out.println(cachorro.getLink());
			System.out.println("====================================");
		}
		System.out.println(maiorNome);
		System.out.println(maiorInfo);
		System.out.println(maiorNomeCientifico);
		System.out.println(maiorPerfil);
		System.out.println(maiorSaude);
		System.out.println(maiorOrigem);
	}
}
