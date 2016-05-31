package br.com.mec.fies.presenter;


public class Aditamento {

	private Integer coAditamento;
	
	private String tpAditamento;
	
	private Integer nuSemestre;
	
	private Integer nuAno;

	private String dtInicio;	

	private String dtFim;

	private Integer coSituacaoAditamento;

	private String nuCpf;
	
	private String dtContratacao;
	
	private DadoCadastral dadosCadastrais;
	private CursoFinanciamento cursoFinanciamento;
	private ListaFiador listaFiador;
	
	public Integer getCoAditamento() {
		return coAditamento;
	}
	public void setCoAditamento(Integer coAditamento) {
		this.coAditamento = coAditamento;
	}
	public String getTpAditamento() {
		return tpAditamento;
	}
	public void setTpAditamento(String tpAditamento) {
		this.tpAditamento = tpAditamento;
	}
	public Integer getNuSemestre() {
		return nuSemestre;
	}
	public void setNuSemestre(Integer nuSemestre) {
		this.nuSemestre = nuSemestre;
	}
	public Integer getNuAno() {
		return nuAno;
	}
	public void setNuAno(Integer nuAno) {
		this.nuAno = nuAno;
	}
	public String getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}
	public String getDtFim() {
		return dtFim;
	}
	public void setDtFim(String dtFim) {
		this.dtFim = dtFim;
	}
	public Integer getCoSituacaoAditamento() {
		return coSituacaoAditamento;
	}
	public void setCoSituacaoAditamento(Integer coSituacaoAditamento) {
		this.coSituacaoAditamento = coSituacaoAditamento;
	}
	public String getNuCpf() {
		return nuCpf;
	}
	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}
	public DadoCadastral getDadosCadastrais() {
		return dadosCadastrais;
	}
	public void setDadosCadastrais(DadoCadastral dadoCadastral) {
		this.dadosCadastrais = dadoCadastral;
	}
	public CursoFinanciamento getCursoFinanciamento() {
		return cursoFinanciamento;
	}
	public void setCursoFinanciamento(CursoFinanciamento cursoFinanciamento) {
		this.cursoFinanciamento = cursoFinanciamento;
	}
	public String getDtContratacao() {
		return dtContratacao;
	}
	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	public ListaFiador getListaFiador() {
		return listaFiador;
	}
	public void setListaFiador(ListaFiador listaFiador) {
		this.listaFiador = listaFiador;
	}
	
}
