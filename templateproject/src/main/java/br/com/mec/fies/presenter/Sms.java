package br.com.mec.fies.presenter;

import java.io.Serializable;
import java.util.Date;

public class Sms implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5006726980328251751L;
	
	private String coVerificacao;
	private Integer qtReenvioRestante;
	private Date dtExpiracao;
	
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
    private String tpAditamento;
    private Integer nuSemestre;
    private Integer nuAno;
	
	public String getCoVerificacao() {
		return coVerificacao;
	}
	public void setCoVerificacao(String coVerificacao) {
		this.coVerificacao = coVerificacao;
	}
	public Integer getQtReenvioRestante() {
		return qtReenvioRestante;
	}
	public void setQtReenvioRestante(Integer qtReenvioRestante) {
		this.qtReenvioRestante = qtReenvioRestante;
	}
	public Date getDtExpiracao() {
		return dtExpiracao;
	}
	public void setDtExpiracao(Date dtExpiracao) {
		this.dtExpiracao = dtExpiracao;
	}
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
	
}
