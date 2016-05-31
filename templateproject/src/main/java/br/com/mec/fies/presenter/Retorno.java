package br.com.mec.fies.presenter;

import java.io.Serializable;


/**
 * Exemplo da recuperacao do json q vai ser montado no caso do recuperar aditamento por cpf:
 * 
 * 
 * 
 * @author alessandrots
 *
 */

public class Retorno implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 142074606514607494L;
	
	private Boolean stSucesso;
	private Ies ies;
	private Aditamento aditamento;
	private TermoFinanciamento termoFinanciamento;
//	private Mensagem[] listaMensagem;
	private Usuario usuario;
	private Sms sms;
	private HistoricoAditamento listaHistoricoAditamento;
	private ValidaAditamento validaAditamento;
	private ListaMensagem listaMensagem;
	private String mensagem;
	private Escola escola;
	private Obra obra;
	
	public Boolean getStSucesso() {
		return stSucesso;
	}
	public void setStSucesso(Boolean stSucesso) {
		this.stSucesso = stSucesso;
	}
	public Ies getIes() {
		return ies;
	}
	public void setIes(Ies ies) {
		this.ies = ies;
	}
	public Aditamento getAditamento() {
		return aditamento;
	}
	public void setAditamento(Aditamento aditamento) {
		this.aditamento = aditamento;
	}
	public TermoFinanciamento getTermoFinanciamento() {
		return termoFinanciamento;
	}
	public void setTermoFinanciamento(TermoFinanciamento termoFinanciamento) {
		this.termoFinanciamento = termoFinanciamento;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Sms getSms() {
		return sms;
	}
	public void setSms(Sms sms) {
		this.sms = sms;
	}
	public HistoricoAditamento getListaHistoricoAditamento() {
		return listaHistoricoAditamento;
	}
	public void setListaHistoricoAditamento(HistoricoAditamento historicoAditamento) {
		this.listaHistoricoAditamento = historicoAditamento;
	}
	public ValidaAditamento getValidaAditamento() {
		return validaAditamento;
	}
	public void setValidaAditamento(ValidaAditamento validaAditamento) {
		this.validaAditamento = validaAditamento;
	}
	public ListaMensagem getListaMensagem() {
		return listaMensagem;
	}
	public void setListaMensagem(ListaMensagem listaMensagem) {
		this.listaMensagem = listaMensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Escola getEscola() {
		return escola;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	public Obra getObra() {
		return obra;
	}
	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
}
