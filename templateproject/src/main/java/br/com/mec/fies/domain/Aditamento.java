package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="aditamento")
public class Aditamento {

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="coAditamento", nullable=false) 
	private Integer coAditamento;
	
	@NotNull
	@Column(name="tpAditamento", nullable=false, length=40)
	private String tpAditamento;
	
	@NotNull
	@Column(name="nuSemestre", nullable=false)
	private Integer nuSemestre;
	
	@NotNull
	@Column(name="nuAno", nullable=false)
	private Integer nuAno;

	@NotNull
	@Column(name="dtInicio", nullable=false, length=10)
	private String dtInicio;	

	@NotNull
	@Column(name="dtFim", nullable=false, length=10)
	private String dtFim;

	@NotNull
	@Column(name="coSituacaoAditamento", nullable=false)
	private Integer coSituacaoAditamento;

	@NotNull
	@Column(name="nuCpf", nullable=false, length=11)
	private String nuCpf;
	
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
	
}
