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
		
		for (String link : dadosGrupo.listaDeLinks()) {
			reader.getHTML(link);
			dadosCachorro.separarConteudo(reader.getDocument(), "accordion-raca");
			
			cachorro.setNome(dadosCachorro.getNome());
			
			cachorros.add(cachorro);
			
			System.out.println("Gravando: " + cachorro.getNome());
			cachorro = new Cachorro();
			
			
		}
	}
	
	
	public List<Cachorro> getCachorros() {
		return this.cachorros;
	}
	
	
}
