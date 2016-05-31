package br.com.mec.fies.presenter;

import java.io.Serializable;

public class ValidaAditamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2724837268155022820L;
	
	private String nuCpf;
	private Integer coAditamento;
	private Integer tpValidacao;
	
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
