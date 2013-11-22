package test;

import java.io.IOException;
import java.net.MalformedURLException;

import sourceCodeReader.Reader;

public class test {

	public static void main(String[] args) throws MalformedURLException, IOException {
		Reader reader = new Reader();
		System.out.println(reader.getHTML("http://portaldodog.com.br/cachorros/racas/affenpinscher/"));
		
	}
}
