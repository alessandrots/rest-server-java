package br.com.mec.fies.presenter;

import java.io.Serializable;

public class Usuario implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 4297284428184766213L;
	
	private String noUsuario;
	private boolean stAtivo;
	private boolean stPermiteAcesso;
	private String dsToken;
	private String nuCpf;
	private String senha;
	
	public String getNoUsuario() {
		return noUsuario;
	}
	public void setNoUsuario(String noUsuario) {
		this.noUsuario = noUsuario;
	}
	public boolean isStAtivo() {
		return stAtivo;
	}
	public void setStAtivo(boolean stAtivo) {
		this.stAtivo = stAtivo;
	}
	public boolean isStPermiteAcesso() {
		return stPermiteAcesso;
	}
	public void setStPermiteAcesso(boolean stPermissao) {
		this.stPermiteAcesso = stPermissao;
	}
	public String getDsToken() {
		return dsToken;
	}
	public void setDsToken(String dsToken) {
		this.dsToken = dsToken;
	}
	public String getNuCpf() {
		return nuCpf;
	}
	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
