package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="termofinanciamento")
public class TermoFinanciamento {


	@Id @Generated(GenerationTime.INSERT) 
	@Column(name="coAditamento", nullable=false) 
	private Integer coAditamento;
	
	@NotNull
	@Column(name="nuSemestre", nullable=false)
    private Integer nuSemestre;//,Semestre do aditamento;//,NU(1)
	
	@NotNull
	@Column(name="nuAno", nullable=false)
    private Integer nuAno;//,Ano do aditamento;//,NU(4)
	
	@NotNull
	@Column(name="nuMatricula", nullable=false, length=11)
    private String nuMatricula;//,Número da matrícula do estudante;//,NA(20)
	
	@NotNull
	@Column(name="qtDuracaoRegular", nullable=false)
    private Integer qtDuracaoRegular;//,Duração regular do curso em semestres;//,NU(2)
	
	@NotNull
	@Column(name="qtSemestresConcluidos", nullable=false)
    private Integer qtSemestresConcluidos;//,Quantidade de semestres já concluídos;//,NU(2)
	
	@NotNull
	@Column(name="qtSemestresDilatados", nullable=false)
    private Integer qtSemestresDilatados;//,Total de semestres dilatados;//,NU(1)
	
	@NotNull
	@Column(name="qtSemestresSuspensos", nullable=false)
    private Integer qtSemestresSuspensos;//,Quantidade de semestres suspensos;//,NU(1)
	
	@NotNull
	@Column(name="qtSemestresFinanciados", nullable=false)
    private Integer qtSemestresFinanciados;//,Quantidade de semestres financiados;//,NU(1)
	
	@NotNull
	@Column(name="qtSemestresTotal", nullable=false)
    private Integer qtSemestresTotal;//,Quantidade total de semestres do financiamento;//,NU(1)
	
	@NotNull
	@Column(name="vlSemestralidadeSem", nullable=false)
    private Double vlSemestralidadeSem;//,Valor da semestralidade sem desconto;//,NU(7;//,2)
	
	@NotNull
	@Column(name="vlSemestralidadeCom", nullable=false)
    private Double vlSemestralidadeCom;//,Valor da semestralidade com desconto;//,NU(7;//,2)
	
	@NotNull
	@Column(name="vlSemestralidadeAtual", nullable=false)
    private Double vlSemestralidadeAtual;//,Valor da semestralidade atual;//,NU(7;//,2)
	
	@NotNull
	@Column(name="nuPercentualFinanc", nullable=false)
    private Double nuPercentualFinanc;//,Percentual de financiamento solicitado;//,NU(3)
	
	@NotNull
	@Column(name="vlSemestreAtualEstudante", nullable=false)
    private Double vlSemestreAtualEstudante;//,Valor a ser pago no semestre atual com recursos do estudante;//,NU(7;//,2)
	
	@NotNull
	@Column(name="vlMensalidadeAtualFies", nullable=false)
    private Double vlMensalidadeAtualFies;//,Valor da mensalidade a ser financiado no semestre atual com recursos do FIES;//,NU(7;//,2)
	
	@NotNull
	@Column(name="vlTotalFinanciamento", nullable=false)
    private Double vlTotalFinanciamento;//,Valor total do financiamento;//,NU(7;//,2)
	
	@NotNull
	@Column(name="vlLimiteCreditoGlobal", nullable=false)
    private Double vlLimiteCreditoGlobal;//,Valor do limite de crédito global;//,NU(7;//,2)
	
	@NotNull
	@Column(name="nuPercentualProuni", nullable=false)
    private Double nuPercentualProuni;//,Percentual de financiamento do ProUNI;//,NU(3)
	
	@NotNull
	@Column(name="vlFinancProuni", nullable=false)
    private Double vlFinancProuni;//,Valor de financiamento pelo ProUni;//,NU(7;//,2)
	
	@NotNull
	@Column(name="vlSemestreAtualFies", nullable=false)
    private Double vlSemestreAtualFies;
    
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
	public Integer getCoAditamento() {
		return coAditamento;
	}
	public void setCoAditamento(Integer coAditamento) {
		this.coAditamento = coAditamento;
	}
	public Double getVlSemestreAtualFies() {
		return vlSemestreAtualFies;
	}
	public void setVlSemestreAtualFies(Double vlSemestreAtualFies) {
		this.vlSemestreAtualFies = vlSemestreAtualFies;
	}
    
}
