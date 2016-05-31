package br.com.mec.fies.service;

import br.com.mec.fies.domain.Usuario;
import br.com.mec.fies.security.AuthenticationOutline;

public interface IService {

	public void execute(String acao);
	
	public void setParametros(Object[] params);
	
	public Object[] getParametros();
	
	public void setJSon(String json);
	
	public String getJSon();
	
	public String getResposta();
	
	public void setResposta(String resposta);
	
	public void setUsuarioAutenticado(AuthenticationOutline auth);
	
	public Usuario getUsuarioAutenticado();
}
