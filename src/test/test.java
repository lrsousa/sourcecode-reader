package test;

import java.io.IOException;
import java.net.MalformedURLException;

import sourceCodeReader.DadosCachorro;
import sourceCodeReader.GetSouceCode;

public class test {

	public static void main(String[] args) throws MalformedURLException, IOException {
		GetSouceCode reader = new GetSouceCode();
		DadosCachorro dadosCachorro = new DadosCachorro();
		
		reader.getHTML("http://portaldodog.com.br/cachorros/racas/akita/");
		dadosCachorro.separarConteudo(reader.getDocument(), "accordion-raca");
		
		System.out.println(dadosCachorro.getTamanhoMacho());
		
	}
}
