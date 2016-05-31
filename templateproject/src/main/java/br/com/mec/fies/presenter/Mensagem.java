package br.com.mec.fies.presenter;

public class Mensagem {
	private String coMensagem;//,Código da mensagem,AN(5)
	private String tpMensagem;//,Tipo da mensagem,AL(1)
	private String dsMensagem;//,Descrição da mensagem,AN(200)
	
	public String getCoMensagem() {
		return coMensagem;
	}
	public void setCoMensagem(String coMensagem) {
		this.coMensagem = coMensagem;
	}
	public String getTpMensagem() {
		return tpMensagem;
	}
	public void setTpMensagem(String tpMensagem) {
		this.tpMensagem = tpMensagem;
	}
	public String getDsMensagem() {
		return dsMensagem;
	}
	public void setDsMensagem(String dsMensagem) {
		this.dsMensagem = dsMensagem;
	}
	
	
}
