package test;

import java.io.IOException;
import java.net.MalformedURLException;

import modelo.Cachorro;

import sourceCodeReader.DadosCachorro;
import sourceCodeReader.DadosGrupo;
import sourceCodeReader.EscreveCachorro;
import sourceCodeReader.GetSouceCode;

public class test {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		EscreveCachorro escrever = new EscreveCachorro();
		
		escrever.comecaEscrever();
		
		for (Cachorro cachorro : escrever.getCachorros()) {
			System.out.println("Extraindo nome: " + cachorro.getNome());
		}
		
		/*
		GetSouceCode reader = new GetSouceCode();
		DadosCachorro dadosCachorro = new DadosCachorro();
		DadosGrupo dadosGrupo = new DadosGrupo();

		
		reader.getHTML("http://portaldodog.com.br/cachorros/racas/akita/");
		dadosCachorro.separarConteudo(reader.getDocument(), "accordion-raca");

		reader.getHTML("http://portaldodog.com.br/cachorros/category/racas/trabalho/");
		dadosGrupo.separarConteudo(reader.getDocument(), "conteudo");
		
		
		System.out.println(dadosGrupo.listaDeLinks());
		
		System.out.println(dadosCachorro.getLink("Cavalier King Charles"));
		System.out.println(dadosCachorro.getLink("Border Collie"));
		System.out.println(dadosCachorro.getLink("Akita"));
		System.out.println(dadosCachorro.getLink("American Staffordshire Terrier"));
		*/
	}
}
