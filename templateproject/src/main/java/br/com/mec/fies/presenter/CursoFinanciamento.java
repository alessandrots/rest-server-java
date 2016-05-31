package br.com.mec.fies.presenter;

import java.io.Serializable;

public class CursoFinanciamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2498478916904231947L;

	private Integer coIes;
	private String noIes;
	private Integer coLocalOferta;
	private String noLocalOferta;
	private Integer coCurso;
	private String noCurso;
	private String dsGrau;
	private String dsTurno;
	private Integer coAditamento;
    private Integer nuSemestre;//,Semestre do aditamento;//,NU(1)
    private Integer nuAno;//,Ano do aditamento;//,NU(4)
    private String nuMatricula;//,Número da matrícula do estudante;//,NA(20)
    private Integer qtDuracaoRegular;//,Duração regular do curso em semestres;//,NU(2)
    private Integer qtSemestresConcluidos;//,Quantidade de semestres já concluídos;//,NU(2)
    private Integer qtSemestresDilatados;//,Total de semestres dilatados;//,NU(1)
    private Integer qtSemestresSuspensos;//,Quantidade de semestres suspensos;//,NU(1)
    private Integer qtSemestresFinanciados;//,Quantidade de semestres financiados;//,NU(1)
    private Integer qtSemestresTotal;//,Quantidade total de semestres do financiamento;//,NU(1)
    private Double vlSemestralidadeSem;//,Valor da semestralidade sem desconto;//,NU(7;//,2)
    private Double vlSemestralidadeCom;//,Valor da semestralidade com desconto;//,NU(7;//,2)
    private Double vlSemestralidadeAtual;//,Valor da semestralidade atual;//,NU(7;//,2)
    private Double nuPercentualFinanc;//,Percentual de financiamento solicitado;//,NU(3)
    private Double vlSemestreAtualEstudante;//,Valor a ser pago no semestre atual com recursos do estudante;//,NU(7;//,2)
    private Double vlMensalidadeAtualFies;//,Valor da mensalidade a ser financiado no semestre atual com recursos do FIES;//,NU(7;//,2)
    private Double vlTotalFinanciamento;//,Valor total do financiamento;//,NU(7;//,2)
    private Double vlLimiteCreditoGlobal;//,Valor do limite de crédito global;//,NU(7;//,2)
    private Double nuPercentualProuni;//,Percentual de financiamento do ProUNI;//,NU(3)
    private Double vlFinancProuni;//,Valor de financiamento pelo ProUni;//,NU(7;//,2)
    private Double vlSemestreAtualFies;
    
	public Integer getCoIes() {
		return coIes;
	}
	public void setCoIes(Integer coIes) {
		this.coIes = coIes;
	}
	public String getNoIes() {
		return noIes;
	}
	public void setNoIes(String noIes) {
		this.noIes = noIes;
	}
	public Integer getCoLocalOferta() {
		return coLocalOferta;
	}
	public void setCoLocalOferta(Integer coLocalOferta) {
		this.coLocalOferta = coLocalOferta;
	}
	public String getNoLocalOferta() {
		return noLocalOferta;
	}
	public void setNoLocalOferta(String noLocalOferta) {
		this.noLocalOferta = noLocalOferta;
	}
	public Integer getCoCurso() {
		return coCurso;
	}
	public void setCoCurso(Integer coCurso) {
		this.coCurso = coCurso;
	}
	public String getNoCurso() {
		return noCurso;
	}
	public void setNoCurso(String noCurso) {
		this.noCurso = noCurso;
	}
	public String getDsGrau() {
		return dsGrau;
	}
	public void setDsGrau(String dsGrau) {
		this.dsGrau = dsGrau;
	}
	public String getDsTurno() {
		return dsTurno;
	}
	public void setDsTurno(String dsTurno) {
		this.dsTurno = dsTurno;
	}
	public Integer getCoAditamento() {
		return coAditamento;
	}
	public void setCoAditamento(Integer coAditamento) {
		this.coAditamento = coAditamento;
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
	public String getNuMatricula() {
		return nuMatricula;
	}
	public void setNuMatricula(String nuMatricula) {
		this.nuMatricula = nuMatricula;
	}
	public Integer getQtDuracaoRegular() {
		return qtDuracaoRegular;
	}
	public void setQtDuracaoRegular(Integer qtDuracaoRegular) {
		this.qtDuracaoRegular = qtDuracaoRegular;
	}
	public Integer getQtSemestresConcluidos() {
		return qtSemestresConcluidos;
	}
	public void setQtSemestresConcluidos(Integer qtSemestresConcluidos) {
		this.qtSemestresConcluidos = qtSemestresConcluidos;
	}
	public Integer getQtSemestresDilatados() {
		return qtSemestresDilatados;
	}
	public void setQtSemestresDilatados(Integer qtSemestresDilatados) {
		this.qtSemestresDilatados = qtSemestresDilatados;
	}
	public Integer getQtSemestresSuspensos() {
		return qtSemestresSuspensos;
	}
	public void setQtSemestresSuspensos(Integer qtSemestresSuspensos) {
		this.qtSemestresSuspensos = qtSemestresSuspensos;
	}
	public Integer getQtSemestresFinanciados() {
		return qtSemestresFinanciados;
	}
	public void setQtSemestresFinanciados(Integer qtSemestresFinanciados) {
		this.qtSemestresFinanciados = qtSemestresFinanciados;
	}
	public Integer getQtSemestresTotal() {
		return qtSemestresTotal;
	}
	public void setQtSemestresTotal(Integer qtSemestresTotal) {
		this.qtSemestresTotal = qtSemestresTotal;
	}
	public Double getVlSemestralidadeSem() {
		return vlSemestralidadeSem;
	}
	public void setVlSemestralidadeSem(Double vlSemestralidadeSem) {
		this.vlSemestralidadeSem = vlSemestralidadeSem;
	}
	public Double getVlSemestralidadeCom() {
		return vlSemestralidadeCom;
	}
	public void setVlSemestralidadeCom(Double vlSemestralidadeCom) {
		this.vlSemestralidadeCom = vlSemestralidadeCom;
	}
	public Double getVlSemestralidadeAtual() {
		return vlSemestralidadeAtual;
	}
	public void setVlSemestralidadeAtual(Double vlSemestralidadeAtual) {
		this.vlSemestralidadeAtual = vlSemestralidadeAtual;
	}
	public Double getNuPercentualFinanc() {
		return nuPercentualFinanc;
	}
	public void setNuPercentualFinanc(Double nuPercentualFinanc) {
		this.nuPercentualFinanc = nuPercentualFinanc;
	}
	public Double getVlSemestreAtualEstudante() {
		return vlSemestreAtualEstudante;
	}
	public void setVlSemestreAtualEstudante(Double vlSemestreAtualEstudante) {
		this.vlSemestreAtualEstudante = vlSemestreAtualEstudante;
	}
	public Double getVlMensalidadeAtualFies() {
		return vlMensalidadeAtualFies;
	}
	public void setVlMensalidadeAtualFies(Double vlMensalidadeAtualFies) {
		this.vlMensalidadeAtualFies = vlMensalidadeAtualFies;
	}
	public Double getVlTotalFinanciamento() {
		return vlTotalFinanciamento;
	}
	public void setVlTotalFinanciamento(Double vlTotalFinanciamento) {
		this.vlTotalFinanciamento = vlTotalFinanciamento;
	}
	public Double getVlLimiteCreditoGlobal() {
		return vlLimiteCreditoGlobal;
	}
	public void setVlLimiteCreditoGlobal(Double vlLimiteCreditoGlobal) {
		this.vlLimiteCreditoGlobal = vlLimiteCreditoGlobal;
	}
	public Double getNuPercentualProuni() {
		return nuPercentualProuni;
	}
	public void setNuPercentualProuni(Double nuPercentualProuni) {
		this.nuPercentualProuni = nuPercentualProuni;
	}
	public Double getVlFinancProuni() {
		return vlFinancProuni;
	}
	public void setVlFinancProuni(Double vlFinancProuni) {
		this.vlFinancProuni = vlFinancProuni;
	}
	public Double getVlSemestreAtualFies() {
		return vlSemestreAtualFies;
	}
	public void setVlSemestreAtualFies(Double vlSemestreAtualFies) {
		this.vlSemestreAtualFies = vlSemestreAtualFies;
	}
    
    
}
