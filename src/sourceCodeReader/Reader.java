package sourceCodeReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Reader {
	
	public String sugarHTML(String textoURL) throws MalformedURLException, IOException {
		URL url = new URL(textoURL);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		
		StringBuilder builder = new StringBuilder();
		String aux = "";
		while((aux = reader.readLine()) != null) {
			builder.append(aux);
		}
		String texto = builder.toString();
		reader.close();
		return texto;
	}
	
	public void escreverTxt (String texto) {
		
	}
}