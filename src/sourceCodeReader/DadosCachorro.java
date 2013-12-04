package sourceCodeReader;

import java.io.IOException;
import java.util.ArrayList;

import modelo.Cachorro;
import modelo.Grupo;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DadosCachorro {

	private Element elemento;
	private ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();
	
	public DadosCachorro() throws IOException {
		GetSouceCode reader = new GetSouceCode();
		DadosGrupo dadosGrupo = new DadosGrupo();
		
		Cachorro cachorro = new Cachorro();
		reader.getHTML(dadosGrupo.getLinksRacas().get(0));
		this.elemento = reader.getDocument();
		
		
		
//		for (String url : dadosGrupo.getLinksRacas()) {
//			reader.getHTML(url);
//			this.elemento = reader.getDocument();
//			
//			
//		}
		
	}
	
	public String getNome() {
		String nome;
		Element temp = this.elemento.getElementById("raca_titulo2");
		nome = temp.text();
		return nome;
	}
	
	public String getInformacaoGeral() {
		String informacaoGeral;
		Element temp = this.elemento.getElementById("descricao_raca");
		informacaoGeral = temp.text();
		return informacaoGeral;
	}
	
	public String getNomeCientifico() {
		String nomeCientifico;
		Elements temp = this.elemento.getElementsByClass("nome_cientifico");
		nomeCientifico = temp.text();
		return nomeCientifico;
	}

	public String getPerfil() {
		String perfil;
		Elements temp = this.elemento.getElementsByClass("dado");
		perfil = temp.eq(4).text();
		return perfil;
	}

	public String getTemperamento() {
		String perfil;
		Elements temp = this.elemento.getElementsByClass("dado");
		perfil = temp.eq(5).text();
		return perfil;
	}
	
	public String getTamanhoMacho() {
		String tamanho;
		Elements temp = this.elemento.getElementsByClass("dado");
		tamanho = temp.eq(0).text();
		if(tamanho.length() < 7) {
			return null;
		}
		tamanho = temp.eq(0).text().substring(7);
		return tamanho;
	}

	public String getTamanhoFemea() {
		String tamanho;
		Elements temp = this.elemento.getElementsByClass("dado");
		tamanho = temp.eq(1).text();
		if(tamanho.length() < 7) {
			return null;
		}
		tamanho = temp.eq(1).text().substring(7);
		return tamanho;
	}
	
	public String getPesoMacho() {
		String peso;
		Elements temp = this.elemento.getElementsByClass("dado");
		peso = temp.eq(2).text();
		if(peso.length() < 7) {
			return null;
		}
		peso = temp.eq(2).text().substring(7);
		return peso;
	}

	public String getPesoFemea() {
		String peso;
		Elements temp = this.elemento.getElementsByClass("dado");
		peso = temp.eq(3).text();
		if(peso.length() < 7) {
			return null;
		}
		peso = temp.eq(3).text().substring(7);
		return peso;
	}
	
	public String getNivelEnergia() {
		String nivelEnergia;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		nivelEnergia = temp.eq(0).text();
		if(nivelEnergia.length() < 19) {
			return null;
		}
		nivelEnergia = temp.eq(0).text().substring(19);
		return nivelEnergia;
	}
	
	public String getExercicio() {
		String exercicio;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		exercicio = temp.eq(1).text();
		if(exercicio.length() < 12) {
			return null;
		}
		exercicio = temp.eq(1).text().substring(12);
		return exercicio;
	}
	
	public String getBrincalhao() {
		String brincalhao;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		brincalhao = temp.eq(2).text();
		if(brincalhao.length() < 13) {
			return null;
		}
		brincalhao = temp.eq(2).text().substring(13);
		return brincalhao;
	}
	
	public String getNivelAfeicao() {
		String nivelAfeicao;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		nivelAfeicao = temp.eq(3).text();
		if(nivelAfeicao.length() < 19) {
			return null;
		}
		nivelAfeicao = temp.eq(3).text().substring(19);
		return nivelAfeicao;
	}
	
	public String getAmigavelComCachorros() {
		String amigavelComCachorros;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		amigavelComCachorros = temp.eq(4).text();
		if(amigavelComCachorros.length() < 32) {
			return null;
		}
		amigavelComCachorros = temp.eq(4).text().substring(32);
		return amigavelComCachorros;
	}

	public String getAmigavelAnimais() {
		String amigavelAnimais;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		amigavelAnimais = temp.eq(5).text();
		if(amigavelAnimais.length() < 43) {
			return null;
		}
		amigavelAnimais = temp.eq(5).text().substring(43);
		return amigavelAnimais;
	}
	
	public String getAmigavelEstranhos() {
		String amigavelEstranhos;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		amigavelEstranhos = temp.eq(6).text();
		if(amigavelEstranhos.length() < 25) {
			return null;
		}
		amigavelEstranhos = temp.eq(6).text().substring(25);
		return amigavelEstranhos;
	}
	
	public String getFacilTreinar() {
		String facilTreinar;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		facilTreinar = temp.eq(7).text();
		if(facilTreinar.length() < 19) {
			return null;
		}
		facilTreinar = temp.eq(7).text().substring(19);
		return facilTreinar;
	}
	
	public String getGuarda() {
		String guarda;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		guarda = temp.eq(8).text();
		if(guarda.length() < 16) {
			return null;
		}
		guarda = temp.eq(8).text().substring(16);
		return guarda;
	}
	
	public String getHabilidadeProtecao() {
		String habilidadeProtecao;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		habilidadeProtecao = temp.eq(9).text();
		if(habilidadeProtecao.length() < 25) {
			return null;
		}
		habilidadeProtecao = temp.eq(9).text().substring(25);
		return habilidadeProtecao;
	}
	
	public String getCuidadosAparencia() {
		String cuidadosAparencia;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		cuidadosAparencia = temp.eq(10).text();
		if(cuidadosAparencia.length() < 27) {
			return null;
		}
		cuidadosAparencia = temp.eq(10).text().substring(27);
		return cuidadosAparencia;
	}
	
	public String getToleranciaFrio() {
		String toleranciaFrio;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		toleranciaFrio = temp.eq(11).text();
		if(toleranciaFrio.length() < 21) {
			return null;
		}
		toleranciaFrio = temp.eq(11).text().substring(21);
		return toleranciaFrio;
	}
	
	public String getToleranciaCalor() {
		String toleranciaCalor;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		toleranciaCalor = temp.eq(12).text();
		if(toleranciaCalor.length() < 22) {
			return null;
		}
		toleranciaCalor = temp.eq(12).text().substring(22);
		return toleranciaCalor;
	}
	
	public String getSaude() {
		String saude;
		Elements temp = this.elemento.getElementsByClass("text");
		saude = temp.eq(0).text();
		return saude;
	}
	
	public String getOrigem() {
		String origem;
		Elements temp = this.elemento.getElementsByClass("text");
		origem = temp.eq(1).text();
		return origem;
	}
	
	public String getGrupo(String nome) throws IOException {
		DadosGrupo dados = new DadosGrupo();
		for (Grupo grupo : dados.getGrupos()) {
			if(grupo.getListaRacas().contains(nome)) {
				return grupo.getNome();
			}
		}
		return null;
	}
	
	public String getLink(String nome) throws IOException {
		DadosGrupo dados = new DadosGrupo();
		for (Grupo grupo : dados.getGrupos()) {
			if(grupo.getListaRacas().contains(nome)) {
				return grupo.getLinksRacas().get(grupo.getListaRacas().indexOf(nome));
			}
		}
		return null;
	}
}