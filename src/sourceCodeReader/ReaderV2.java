package sourceCodeReader;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ReaderV2 {
	
	public static void main(String[] args) throws ParseException, IOException {
		HttpClient httpClient = HttpClientBuilder.create().build();

		try {
			HttpGet httpGet = new HttpGet("http://portaldodog.com.br/cachorros/racas/affenpinscher/");
//			criando uma conexao HTTP
			HttpResponse response = httpClient.execute(httpGet);
			
//			A resposta vem em formato Entity
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String conteudo = EntityUtils.toString(entity);
				System.out.println(conteudo);
			}
			
		} finally {
			
		}
	}
}
