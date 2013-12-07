package sourceCodeReader;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GetSouceCode {
	
	private Document document;
	
	/*Armazenar todo conteúdo do HTML*/
	public void getHTML (String url) throws IOException {
		Document documento = Jsoup.connect(url).timeout(20000).get();
		this.setDocument(documento);
	}
	
	/*Getter Setters*/
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	/*Getter Setters*/
}