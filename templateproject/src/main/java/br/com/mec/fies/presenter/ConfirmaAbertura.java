package br.com.mec.fies.presenter;

import java.io.Serializable;

public class ConfirmaAbertura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6733288316877782601L;
	
	private String nuCpf;
    private String nuRic;
    private String dsEmail;
    private String coOcupacao;
    private String nuCep;
    private String dsEndereco;
    private String dsComplemento;
    private String nuEndereco;
    private String nuTelefone;
    private String nuCelular;
    private Integer coAditamento;
    
	public String getNuCpf() {
		return nuCpf;
	}
	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}
	public String getNuRic() {
		return nuRic;
	}
	public void setNuRic(String nuRic) {
		this.nuRic = nuRic;
	}
	public String getDsEmail() {
		return dsEmail;
	}
	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}
	public String getCoOcupacao() {
		return coOcupacao;
	}
	public void setCoOcupacao(String coOcupacao) {
		this.coOcupacao = coOcupacao;
	}
	public String getNuCep() {
		return nuCep;
	}
	public void setNuCep(String nuCep) {
		this.nuCep = nuCep;
	}
	public String getDsEndereco() {
		return dsEndereco;
	}
	public void setDsEndereco(String dsEndereco) {
		this.dsEndereco = dsEndereco;
	}
	public String getDsComplemento() {
		return dsComplemento;
	}
	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}
	public String getNuEndereco() {
		return nuEndereco;
	}
	public void setNuEndereco(String nuEndereco) {
		this.nuEndereco = nuEndereco;
	}
	public String getNuTelefone() {
		return nuTelefone;
	}
	public void setNuTelefone(String nuTelefone) {
		this.nuTelefone = nuTelefone;
	}
	public String getNuCelular() {
		return nuCelular;
	}
	public void setNuCelular(String nuCelular) {
		this.nuCelular = nuCelular;
	}
	public Integer getCoAditamento() {
		return coAditamento;
	}
	public void setCoAditamento(Integer coAditamento) {
		this.coAditamento = coAditamento;
	}
	
}
