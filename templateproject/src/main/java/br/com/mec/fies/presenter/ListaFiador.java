package br.com.mec.fies.presenter;

import java.io.Serializable;
import java.util.List;

public class ListaFiador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5262757017782945659L;
	
	private List<Fiador> fiador;

	public List<Fiador> getFiador() {
		return fiador;
	}

	public void setFiador(List<Fiador> fiador) {
		this.fiador = fiador;
	}
	
	

}
