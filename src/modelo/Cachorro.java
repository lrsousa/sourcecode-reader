package modelo;


public class Cachorro {
	
//	Informações Gerais
	private int id;
	private String nome;
	private String infoGeral;
	private String nomeCientifico;
	private String perfil;
	private String temperamento;
	private String tamanhoMacho;
	private String tamanhoFemea;
	private String pesoMacho;
	private String pesoFemea;
	
//	Caracteristicas
	private String nivelEnergia;
	private String exercicio;
	private String brincalhao;
	private String nivelAfeicao;
	private String amigavelCachorros;
	private String amigavelAnimais;
	private String amigavelEstranhos;
	private String facilTreinar;
	private String guarda;
	private String habilidadeProtecao;
	private String cuidadosAparencia;
	private String toleranciaFrio;
	private String toleranciaCalor;

	private String saude;

	private String origem;
	
	private String grupo;
	private String link;

//	Construtor
	public Cachorro() {}
	public Cachorro(String nome, String infoGeral, String perfil, String temperamento, Integer minTamanhoMacho,
			Integer maxTamanhoMacho, Integer minTamanhoFemea, Integer maxTamanhoFemea, Integer minPesoMacho,
			Integer maxPesoMacho, Integer minPesoFemea, Integer maxPesoFemea, String nivelEnergia,
			String exercicio, String brincalhao, String nivelAfeicao, String amigavelCachorros, String amigavelAnimais,
			String amigavelEstranhos, String facilTreinar, String guarda, String habilidadeProtecao,
			String cuidadosAparencia, String toleranciaFrio, String toleranciaCalor, String saude, String origem) {
		
	}
	
	
//	Getters Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInfoGeral() {
		return infoGeral;
	}
	public void setInfoGeral(String infoGeral) {
		this.infoGeral = infoGeral;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	public String getTamanhoMacho() {
		return tamanhoMacho;
	}
	public void setTamanhoMacho(String tamanhoMacho) {
		this.tamanhoMacho = tamanhoMacho;
	}
	public String getTamanhoFemea() {
		return tamanhoFemea;
	}
	public void setTamanhoFemea(String tamanhoFemea) {
		this.tamanhoFemea = tamanhoFemea;
	}
	public String getPesoMacho() {
		return pesoMacho;
	}
	public void setPesoMacho(String pesoMacho) {
		this.pesoMacho = pesoMacho;
	}
	public String getPesoFemea() {
		return pesoFemea;
	}
	public void setPesoFemea(String pesoFemea) {
		this.pesoFemea = pesoFemea;
	}
	public String getNivelEnergia() {
		return nivelEnergia;
	}
	public void setNivelEnergia(String nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}
	public String getExercicio() {
		return exercicio;
	}
	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}
	public String getBrincalhao() {
		return brincalhao;
	}
	public void setBrincalhao(String brincalhao) {
		this.brincalhao = brincalhao;
	}
	public String getNivelAfeicao() {
		return nivelAfeicao;
	}
	public void setNivelAfeicao(String nivelAfeicao) {
		this.nivelAfeicao = nivelAfeicao;
	}
	public String getAmigavelCachorros() {
		return amigavelCachorros;
	}
	public void setAmigavelCachorros(String amigavelCachorros) {
		this.amigavelCachorros = amigavelCachorros;
	}
	public String getAmigavelAnimais() {
		return amigavelAnimais;
	}
	public void setAmigavelAnimais(String amigavelAnimais) {
		this.amigavelAnimais = amigavelAnimais;
	}
	public String getAmigavelEstranhos() {
		return amigavelEstranhos;
	}
	public void setAmigavelEstranhos(String amigavelEstranhos) {
		this.amigavelEstranhos = amigavelEstranhos;
	}
	public String getFacilTreinar() {
		return facilTreinar;
	}
	public void setFacilTreinar(String facilTreinar) {
		this.facilTreinar = facilTreinar;
	}
	public String getGuarda() {
		return guarda;
	}
	public void setGuarda(String guarda) {
		this.guarda = guarda;
	}
	public String getHabilidadeProtecao() {
		return habilidadeProtecao;
	}
	public void setHabilidadeProtecao(String habilidadeProtecao) {
		this.habilidadeProtecao = habilidadeProtecao;
	}
	public String getCuidadosAparencia() {
		return cuidadosAparencia;
	}
	public void setCuidadosAparencia(String cuidadosAparencia) {
		this.cuidadosAparencia = cuidadosAparencia;
	}
	public String getToleranciaFrio() {
		return toleranciaFrio;
	}
	public void setToleranciaFrio(String toleranciaFrio) {
		this.toleranciaFrio = toleranciaFrio;
	}
	public String getToleranciaCalor() {
		return toleranciaCalor;
	}
	public void setToleranciaCalor(String toleranciaCalor) {
		this.toleranciaCalor = toleranciaCalor;
	}
	public String getSaude() {
		return saude;
	}
	public void setSaude(String saude) {
		this.saude = saude;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
