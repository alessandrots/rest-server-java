package br.com.mec.fies.presenter;

import java.io.Serializable;

public class Fiador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8540379655735947554L;
	
	private String noFiador;
    private String nuCpf;
    private Double vlRenda;
    private String nuCpfEstudante;
    
	public String getNoFiador() {
		return noFiador;
	}
	public void setNoFiador(String noFiador) {
		this.noFiador = noFiador;
	}
	public String getNuCpf() {
		return nuCpf;
	}
	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}
	public Double getVlRenda() {
		return vlRenda;
	}
	public void setVlRenda(Double vlRenda) {
		this.vlRenda = vlRenda;
	}
	public String getNuCpfEstudante() {
		return nuCpfEstudante;
	}
	public void setNuCpfEstudante(String nuCpfEstudante) {
		this.nuCpfEstudante = nuCpfEstudante;
	}
    
}
