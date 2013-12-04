package sourceCodeReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cachorro;

public class EscreveCachorro {
	
	GetSouceCode reader = new GetSouceCode();
	
	private List<Cachorro> cachorros = new ArrayList<Cachorro>();
	private Cachorro cachorro = new Cachorro();
	private DadosCachorro dadosCachorro;
	private DadosGrupo dadosGrupo;
	
	/* Contrutor para instanciar o DadosGrupo */
	public EscreveCachorro() throws IOException {
		DadosGrupo grupo = new DadosGrupo();
		DadosCachorro cachorro = new DadosCachorro();
		
		this.dadosGrupo = grupo;
		this.dadosCachorro = cachorro;
	}
	
	public void comecaEscrever() throws IOException {
		
		for (String url : dadosGrupo.listaDeLinks()) {
			System.out.println("Iniciando busca...");
			dadosCachorro.separarConteudo(url);
			
			System.out.println("Escrevendo: " + dadosCachorro.getNome());
			
			cachorro.setNome(dadosCachorro.getNome());
			cachorro.setInfoGeral(dadosCachorro.getInformacaoGeral());
			cachorro.setNomeCientifico(dadosCachorro.getNomeCientifico());
			cachorro.setPerfil(dadosCachorro.getPerfil());
			cachorro.setTemperamento(dadosCachorro.getTemperamento());
			cachorro.setTamanhoMacho(dadosCachorro.getTamanhoMacho());
			cachorro.setTamanhoFemea(dadosCachorro.getTamanhoFemea());
			cachorro.setPesoMacho(dadosCachorro.getPesoMacho());
			cachorro.setPesoFemea(dadosCachorro.getPesoFemea());
			cachorro.setNivelEnergia(dadosCachorro.getNivelEnergia());
			cachorro.setExercicio(dadosCachorro.getExercicio());
			cachorro.setBrincalhao(dadosCachorro.getBrincalhao());
			cachorro.setNivelAfeicao(dadosCachorro.getNivelAfeicao());
			cachorro.setAmigavelCachorros(dadosCachorro.getAmigavelComCachorros());
			cachorro.setAmigavelAnimais(dadosCachorro.getAmigavelAnimais());
			cachorro.setAmigavelEstranhos(dadosCachorro.getAmigavelEstranhos());
			cachorro.setFacilTreinar(dadosCachorro.getFacilTreinar());
			cachorro.setGuarda(dadosCachorro.getGuarda());
			cachorro.setHabilidadeProtecao(dadosCachorro.getHabilidadeProtecao());
			cachorro.setCuidadosAparencia(dadosCachorro.getCuidadosAparencia());
			cachorro.setToleranciaFrio(dadosCachorro.getToleranciaFrio());
			cachorro.setToleranciaCalor(dadosCachorro.getToleranciaCalor());
			cachorro.setSaude(dadosCachorro.getSaude());
			cachorro.setOrigem(dadosCachorro.getOrigem());
			cachorro.setGrupo(cachorro.getNome());
			cachorro.setLink(cachorro.getNome());
			
			cachorros.add(cachorro);
			
			System.out.println("Gravando: " + cachorro.getNome());
			cachorro = new Cachorro();
			
			System.out.println("Gravado com sucesso.");
			System.out.println("=============================");
		}
		System.out.println("Feito");
	}
	
	
	public List<Cachorro> getCachorros() {
		return this.cachorros;
	}
	
	
}
