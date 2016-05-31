package br.com.mec.fies.presenter;

import java.io.Serializable;
import java.util.List;

public class ListaMensagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1501444594795357722L;
	
	private List<Mensagem> mensagem;

	public List<Mensagem> getMensagem() {
		return mensagem;
	}

	public void setMensagem(List<Mensagem> mensagem) {
		this.mensagem = mensagem;
	}

}
