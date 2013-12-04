package test;

import java.io.IOException;

import sourceCodeReader.DadosCachorro;
import sourceCodeReader.DadosGrupo;

public class testeCachorro {
	public static void main(String[] args) throws IOException {
		
		DadosCachorro ca = new DadosCachorro();
		
		System.out.println("Nome: " + ca.getNome());
		System.out.println("Informacao geral: " + ca.getInformacaoGeral());
		System.out.println("Nome cientifico: " + ca.getNomeCientifico());
		System.out.println("Perfil: " + ca.getPerfil());
		System.out.println("Temperamento: " + ca.getTemperamento());
		System.out.println("Tamanho macho: " + ca.getTamanhoMacho());
		System.out.println("Tamanho femea: " + ca.getTamanhoFemea());
		System.out.println("Peso macho: " + ca.getPesoMacho());
		System.out.println("Peso femea: " + ca.getPesoFemea());
		System.out.println("Nivel energia: " + ca.getNivelEnergia());
		System.out.println("Exercicio: " + ca.getExercicio());
		System.out.println("Brincalhao: " + ca.getBrincalhao());
		System.out.println("Nivel afeicao: " + ca.getNivelAfeicao());
		System.out.println("Amigavel com cachorros: " + ca.getAmigavelComCachorros());
		System.out.println("Amigavel com animais: " + ca.getAmigavelAnimais());
		System.out.println("Amigavel estranhos: " + ca.getAmigavelEstranhos());
		System.out.println("Facil treinar: " + ca.getFacilTreinar());
		System.out.println("Guarda: " + ca.getGuarda());
		System.out.println("Habilidade protecao: " + ca.getHabilidadeProtecao());
		System.out.println("Cuidados aparencia: " + ca.getCuidadosAparencia());
		System.out.println("Tolerancia frio: " + ca.getToleranciaFrio());
		System.out.println("Tolerancia calor: " + ca.getToleranciaCalor());
		System.out.println("Saude: " + ca.getSaude());
		System.out.println("Origem: " + ca.getOrigem());
		System.out.println("Grupo: " + ca.getGrupo(ca.getNome()));
		System.out.println("Link: " + ca.getLink(ca.getNome()));
		
	}
}
