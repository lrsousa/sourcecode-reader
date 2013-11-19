package modelo;

public class Cachorro {
	
//	Informações Gerais
	String nome;
	String infoGeral;
	String perfil;
	String temperamento;
	Integer minTamanhoMacho;
	Integer maxTamanhoMacho;
	Integer minTamanhoFemea;
	Integer maxTamanhoFemea;
	Integer minPesoMacho;
	Integer maxPesoMacho;
	Integer minPesoFemea;
	Integer maxPesoFemea;
	
//	Caracteristicas
	String nivelEnergia;
	String exercicio;
	String brincalhao;
	String nivelAfeicao;
	String amigavelCachorros;
	String amigavelAnimais;
	String amigavelEstranhos;
	String facilTreinar;
	String guarda;
	String habilidadeProtecao;
	String cuidadosAparencia;
	String toleranciaFrio;
	String toleranciaCalor;
	
//	Saude
	String saude;
	
//	Origem
	String origem;

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
	public String getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	public Integer getMinTamanhoMacho() {
		return minTamanhoMacho;
	}
	public void setMinTamanhoMacho(Integer minTamanhoMacho) {
		this.minTamanhoMacho = minTamanhoMacho;
	}
	public Integer getMaxTamanhoMacho() {
		return maxTamanhoMacho;
	}
	public void setMaxTamanhoMacho(Integer maxTamanhoMacho) {
		this.maxTamanhoMacho = maxTamanhoMacho;
	}
	public Integer getMinTamanhoFemea() {
		return minTamanhoFemea;
	}
	public void setMinTamanhoFemea(Integer minTamanhoFemea) {
		this.minTamanhoFemea = minTamanhoFemea;
	}
	public Integer getMaxTamanhoFemea() {
		return maxTamanhoFemea;
	}
	public void setMaxTamanhoFemea(Integer maxTamanhoFemea) {
		this.maxTamanhoFemea = maxTamanhoFemea;
	}
	public Integer getMinPesoMacho() {
		return minPesoMacho;
	}
	public void setMinPesoMacho(Integer minPesoMacho) {
		this.minPesoMacho = minPesoMacho;
	}
	public Integer getMaxPesoMacho() {
		return maxPesoMacho;
	}
	public void setMaxPesoMacho(Integer maxPesoMacho) {
		this.maxPesoMacho = maxPesoMacho;
	}
	public Integer getMinPesoFemea() {
		return minPesoFemea;
	}
	public void setMinPesoFemea(Integer minPesoFemea) {
		this.minPesoFemea = minPesoFemea;
	}
	public Integer getMaxPesoFemea() {
		return maxPesoFemea;
	}
	public void setMaxPesoFemea(Integer maxPesoFemea) {
		this.maxPesoFemea = maxPesoFemea;
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
}
