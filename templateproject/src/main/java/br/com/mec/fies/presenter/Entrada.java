package br.com.mec.fies.presenter;

import java.io.Serializable;

public class Entrada implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2460478338327394940L;
	
	private String nuCpf;
	private String coAditamento;
	private String senha;
	
	private Double latitude;
	private Double longitude;
	
	public String getNuCpf() {
		return nuCpf;
	}
	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}
	public String getCoAditamento() {
		return coAditamento;
	}
	public void setCoAditamento(String coAditamento) {
		this.coAditamento = coAditamento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
	
	
}
