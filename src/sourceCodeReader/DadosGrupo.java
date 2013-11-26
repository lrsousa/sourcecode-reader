package sourceCodeReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Grupo;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class DadosGrupo {
	
	private Element elemento;
	
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();

	public DadosGrupo() throws IOException {
		List<String> urls = new ArrayList<String>();

		urls.add("http://portaldodog.com.br/cachorros/category/racas/trabalho/");
		urls.add("http://portaldodog.com.br/cachorros/category/racas/toy/");
		urls.add("http://portaldodog.com.br/cachorros/category/racas/naodesportivos/");
		urls.add("http://portaldodog.com.br/cachorros/category/racas/pastoreio/");
		urls.add("http://portaldodog.com.br/cachorros/category/racas/terrier/");
		urls.add("http://portaldodog.com.br/cachorros/category/racas/esportistas/");
		urls.add("http://portaldodog.com.br/cachorros/category/racas/hound/");
		
		GetSouceCode reader = new GetSouceCode();
		Grupo grupo = new Grupo();
		
		for (String url : urls) {
			reader.getHTML(url);
			separarConteudo(reader.getDocument(), "conteudo");
			
			grupo.setNome(getNomeGrupo());
			grupo.setDescricao(getDescricaoGrupo());
			grupo.setListaRacas(getNomesRacas());
			grupo.setLinksRacas(getLinksRacas());
			
			this.grupos.add(grupo);
			grupo = new Grupo();
		}
	}

	public void separarConteudo(Document html, String id) {
		Element elemento = html.getElementById(id);
		this.setElemento(elemento);
	}

	public String getNomeGrupo() {
		Element texto = this.elemento.getElementById("categoria_titulo");
		String nome = texto.getElementsByTag("h1").text();
		return nome;
	}
	
	public String getDescricaoGrupo() {
		Element texto = this.elemento.getElementById("categoria_titulo");
		String descricao = texto.getElementsByTag("p").text();
		return descricao;
	}
	
	public List<String> getNomesRacas() {
		Element texto = this.elemento.getElementById("categoria_2");
		List<String> listaRacas = new ArrayList<String>();
		
		for (Element item : texto.getElementsByTag("li")) {
			listaRacas.add(item.getElementsByTag("a").attr("title"));
		}
		return listaRacas;
	}
	
	public List<String> getLinksRacas() {
		Element texto = this.elemento.getElementById("categoria_2");
		List<String> listaLinks = new ArrayList<String>();
		
		for (Element item : texto.getElementsByTag("li")) {
			listaLinks.add(item.getElementsByTag("a").attr("href"));
		}
		return listaLinks;
	}
	
	
	/* Getter Setters */
	public Element getElemento() {
		return elemento;
	}
	public void setElemento(Element elemento) {
		this.elemento = elemento;
	}
	
	/* Retorna lista com todos os grupos */
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	
	public ArrayList<String> listaDeLinks() {
		ArrayList<String> lista = new ArrayList<String>();
		for (Grupo grupo : getGrupos()) {
			for (String link : grupo.getLinksRacas()) {
				lista.add(link);
			}
		}
		return lista;
	}
}

