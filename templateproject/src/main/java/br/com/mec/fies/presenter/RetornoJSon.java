package br.com.mec.fies.presenter;

import java.io.Serializable;

public class RetornoJSon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1977240627128664528L;
	
	private Integer id;
	private Integer codigoRetorno;
	private String mensagemRetorno;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(Integer codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	
}
