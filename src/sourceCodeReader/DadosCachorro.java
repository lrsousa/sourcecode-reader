package sourceCodeReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DadosCachorro {
	
	private Element elemento;
	
	/*Separar Conteúdo*/
	public void separarConteudo(Document html, String id) {
		Element elemento = html.getElementById(id);
		this.elemento = elemento;
	}
	
	public String getNome() {
		String nome;
		Elements temp = this.elemento.getElementsByTag("h2");
		nome = temp.eq(0).text();
		nome = nome.substring(22);
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
		tamanho = temp.eq(0).text().substring(7);
		return tamanho;
	}

	public String getTamanhoFemea() {
		String tamanho;
		Elements temp = this.elemento.getElementsByClass("dado");
		tamanho = temp.eq(1).text().substring(7);
		return tamanho;
	}
	
	public String getPesoMacho() {
		String peso;
		Elements temp = this.elemento.getElementsByClass("dado");
		peso = temp.eq(2).text().substring(7);
		return peso;
	}

	public String getPesoFemea() {
		String peso;
		Elements temp = this.elemento.getElementsByClass("dado");
		peso = temp.eq(3).text().substring(7);
		return peso;
	}
	
	public String getNivelEnergia() {
		String nivelEnergia;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		nivelEnergia = temp.eq(0).text().substring(19);
		return nivelEnergia;
	}
	
	public String getExercicio() {
		String exercicio;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		exercicio = temp.eq(1).text().substring(12);
		return exercicio;
	}
	
	public String getBrincalhao() {
		String brincalhao;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		brincalhao = temp.eq(2).text().substring(13);
		return brincalhao;
	}
	
	public String getNivelAfeicao() {
		String nivelAfeicao;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		nivelAfeicao = temp.eq(3).text().substring(19);
		return nivelAfeicao;
	}
	
	public String getAmigavelComCachorros() {
		String amigavelComCachorros;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		amigavelComCachorros = temp.eq(4).text().substring(32);
		return amigavelComCachorros;
	}

	public String getAmigavelAnimais() {
		String amigavelAnimais;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		amigavelAnimais = temp.eq(5).text().substring(43);
		return amigavelAnimais;
	}
	
	public String getAmigavelEstranhos() {
		String amigavelEstranhos;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		amigavelEstranhos = temp.eq(6).text().substring(25);
		return amigavelEstranhos;
	}
	
	public String getFacilTreinar() {
		String facilTreinar;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		facilTreinar = temp.eq(7).text().substring(19);
		return facilTreinar;
	}
	
	public String getGuarda() {
		String guarda;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		guarda = temp.eq(8).text().substring(16);
		return guarda;
	}
	
	public String getHabilidadeProtecao() {
		String habilidadeProtecao;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		habilidadeProtecao = temp.eq(9).text().substring(25);
		return habilidadeProtecao;
	}
	
	public String getCuidadosAparencia() {
		String cuidadosAparencia;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		cuidadosAparencia = temp.eq(10).text().substring(27);
		return cuidadosAparencia;
	}
	
	public String getToleranciaFrio() {
		String toleranciaFrio;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		toleranciaFrio = temp.eq(11).text().substring(21);
		return toleranciaFrio;
	}
	
	public String getToleranciaCalor() {
		String toleranciaCalor;
		Elements temp = this.elemento.getElementById("caracteristicas_raca").getElementsByTag("li");
		toleranciaCalor = temp.eq(12).text().substring(22);
		return toleranciaCalor;
	}
	
	public String getSaude() {
		String saude;
		Elements temp = this.elemento.getElementsByClass("acc_pag");
		saude = temp.eq(2).text();
		return saude;
	}
	
	public String getOrigem() {
		String origem;
		Elements temp = this.elemento.getElementsByClass("acc_pag");
		origem = temp.eq(3).text();
		return origem;
	}
}