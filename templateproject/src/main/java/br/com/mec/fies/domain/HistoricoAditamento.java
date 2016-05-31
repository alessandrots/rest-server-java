package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="historicoaditamento")
public class HistoricoAditamento implements Domain {

	/**
	 * 
	 */
	private static final long serialVersionUID = -29752216167653418L;
	
	@Id @Generated(GenerationTime.INSERT) 
	@Column(name="cohistoricoaditamento", nullable=false) 
	private Integer coHistoricoAditamento;
	
	@NotNull
	@Column(name="nuCpf", nullable=false, length=11)
	private String nuCpf;
	
	@NotNull
	@Column(name="tpAditamento", nullable=false, length=40)
	private String tpAditamento;
	
	@NotNull
	@Column(name="nuAno", nullable=false)
	private Integer nuAno;
	
	@NotNull
	@Column(name="nuSemestre", nullable=false)
	private Integer nuSemestre;
	
	@NotNull
	@Column(name="dtContratacao", nullable=false, length=11)
	private String dtContratacao;

	public Integer getCoHistoricoAditamento() {
		return coHistoricoAditamento;
	}

	public void setCoHistoricoAditamento(Integer coHistoricoAditamento) {
		this.coHistoricoAditamento = coHistoricoAditamento;
	}

	public String getNuCpf() {
		return nuCpf;
	}

	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}

	public String getTpAditamento() {
		return tpAditamento;
	}

	public void setTpAditamento(String tpAditamento) {
		this.tpAditamento = tpAditamento;
	}

	public Integer getNuAno() {
		return nuAno;
	}

	public void setNuAno(Integer nuAno) {
		this.nuAno = nuAno;
	}

	public Integer getNuSemestre() {
		return nuSemestre;
	}

	public void setNuSemestre(Integer nuSemestre) {
		this.nuSemestre = nuSemestre;
	}

	public String getDtContratacao() {
		return dtContratacao;
	}

	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}

}
