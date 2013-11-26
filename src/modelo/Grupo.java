package modelo;

import java.util.List;

public class Grupo {
	private String nome;
	private String descricao;
	private List<String> listaRacas;
	private List<String> linksRacas;
	
	/* Getter and Setters */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<String> getListaRacas() {
		return listaRacas;
	}
	public void setListaRacas(List<String> listaRacas) {
		this.listaRacas = listaRacas;
	}
	public List<String> getLinksRacas() {
		return linksRacas;
	}
	public void setLinksRacas(List<String> linksRacas) {
		this.linksRacas = linksRacas;
	}
}
