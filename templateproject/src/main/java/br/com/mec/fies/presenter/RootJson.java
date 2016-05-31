package br.com.mec.fies.presenter;

import java.io.Serializable;


public class RootJson implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4054511305147011588L;
	
	private Retorno retorno;
	
	private String sRetorno;

	public Retorno getRetorno() {
		return retorno;
	}
	
	public void setRetorno(Retorno retorno) {
		this.retorno = retorno;
	}

	public String getsRetorno() {
		return sRetorno;
	}

	public void setsRetorno(String sRetorno) {
		this.sRetorno = sRetorno;
	}
	
	
  
  
}
