package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="validaaditamento")
public class ValidaAditamento implements Domain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1997565425702881684L;
	
	@Id @Generated(GenerationTime.INSERT) 
	@Column(name="codigo", nullable=false) 
	private Integer codigo;
	
	@NotNull
	@Column(name="nuCpf", nullable=false)
	private String nuCpf;
	
	@NotNull
	@Column(name="coAditamento", nullable=false)
	private Integer coAditamento;
	
	@NotNull
	@Column(name="tpValidacao", nullable=false)
	private Integer tpValidacao;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNuCpf() {
		return nuCpf;
	}

	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}

	public Integer getCoAditamento() {
		return coAditamento;
	}

	public void setCoAditamento(Integer coAditamento) {
		this.coAditamento = coAditamento;
	}

	public Integer getTpValidacao() {
		return tpValidacao;
	}

	public void setTpValidacao(Integer tpValidacao) {
		this.tpValidacao = tpValidacao;
	}
	
	

}
