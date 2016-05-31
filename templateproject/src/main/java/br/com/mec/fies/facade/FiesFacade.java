package br.com.mec.fies.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.mec.fies.dao.AditamentoDAO;
import br.com.mec.fies.dao.DadoCadastralDAO;
import br.com.mec.fies.dao.EscolaDAO;
import br.com.mec.fies.dao.FiadorDAO;
import br.com.mec.fies.dao.HistoricoAditamentoDAO;
import br.com.mec.fies.dao.IesDAO;
import br.com.mec.fies.dao.ObraDAO;
import br.com.mec.fies.dao.TermoFinanciamentoDAO;
import br.com.mec.fies.dao.UsuarioDAO;
import br.com.mec.fies.dao.ValidaAditamentoDAO;
import br.com.mec.fies.domain.Aditamento;
import br.com.mec.fies.domain.DadoCadastral;
import br.com.mec.fies.domain.Escola;
import br.com.mec.fies.domain.Fiador;
import br.com.mec.fies.domain.HistoricoAditamento;
import br.com.mec.fies.domain.Ies;
import br.com.mec.fies.domain.Obra;
import br.com.mec.fies.domain.TermoFinanciamento;
import br.com.mec.fies.domain.Usuario;
import br.com.mec.fies.domain.ValidaAditamento;
import br.com.mec.fies.presenter.ConfirmaAbertura;
import br.com.mec.fies.presenter.CursoFinanciamento;
import br.com.mec.fies.presenter.ListaFiador;
import br.com.mec.fies.presenter.ListaMensagem;
import br.com.mec.fies.presenter.Mensagem;
import br.com.mec.fies.presenter.Retorno;
import br.com.mec.fies.presenter.RootJson;
import br.com.mec.fies.presenter.Sms;
import br.com.mec.fies.util.EngineJson;
import br.com.mec.fies.util.SessionIdentifierGenerator;
import br.com.mec.fies.util.Utils;

/**
 * @author alessandrots
 */
@Component("fiesFacade")
public class FiesFacade {

	@Autowired
	private AditamentoDAO aditamentoDAO;
	
	@Autowired
	private IesDAO iesDAO;
	
	@Autowired
	private TermoFinanciamentoDAO tFinanciamentoDAO;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private HistoricoAditamentoDAO historicoAditamentoDAO;
	
	@Autowired
	private ValidaAditamentoDAO validaAditamentoDAO;
	
	@Autowired
	private DadoCadastralDAO dadoCadastralDAO;
	
	@Autowired
	private FiadorDAO fiadorDAO;
	
	@Autowired
	private EscolaDAO escolaDAO;
	
	@Autowired
	private ObraDAO obraDAO;

	private Usuario autenticado;
	
	public FiesFacade() {
		super();
	}	
	
	@Transactional
	public String recuperarAditamentoPorCpf(String nuCpf){
		String tmp  = "";
		
		tmp = this.validarCPF(nuCpf); 
		if (tmp != null){
			return tmp;
		}
		
		nuCpf = Utils.getInstance().retirarCaracterEspecialCPF(nuCpf);
		Aditamento adt 	= this.aditamentoDAO.getAditamentoPorCpf(nuCpf);
		Retorno ret = new Retorno();
		
		br.com.mec.fies.presenter.Aditamento aditamento = new br.com.mec.fies.presenter.Aditamento();
		BeanUtils.copyProperties(adt, aditamento);
		ret.setAditamento(aditamento);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}
	
	@Transactional
	public String recuperarIesPorAditamento(Integer coAditamento){
		String tmp  = "";
		
		Ies adt 	= this.iesDAO.getIesPorAditamento(coAditamento);
		br.com.mec.fies.presenter.Ies ies = new br.com.mec.fies.presenter.Ies();
		BeanUtils.copyProperties(adt, ies);
		
		Retorno ret = new Retorno();
		ret.setIes(ies);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}
	
	@Transactional
	public String recuperarTermoPorAditamento(Integer coAditamento){
		String tmp  = "";
		
		TermoFinanciamento adt 	= this.tFinanciamentoDAO.getTermoPorAditamento(coAditamento);
		br.com.mec.fies.presenter.TermoFinanciamento termoFinanciamento = new br.com.mec.fies.presenter.TermoFinanciamento();
		BeanUtils.copyProperties(adt, termoFinanciamento);
		
		Retorno ret = new Retorno();
		ret.setTermoFinanciamento(termoFinanciamento);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}
	
	@Transactional
	public String recuperarAditamentoDisponivelPorCpf(String nuCpf){
		String tmp  = "";
		
		tmp = this.validarCPF(nuCpf); 
		if (tmp != null){
			return tmp;
		}
		
		Ies iesDomain 	= null;
		TermoFinanciamento termoDomain = null;
		Aditamento adtDomain = null;
		Retorno ret = new Retorno();
		
		br.com.mec.fies.presenter.Aditamento aditamento = null;
		br.com.mec.fies.presenter.Ies ies = null;
		br.com.mec.fies.presenter.TermoFinanciamento termo = null;
		
		nuCpf = Utils.getInstance().retirarCaracterEspecialCPF(nuCpf);
		
		adtDomain 	= this.aditamentoDAO.getAditamentoPorCpf(nuCpf);
		aditamento = new br.com.mec.fies.presenter.Aditamento();
		BeanUtils.copyProperties(adtDomain, aditamento);
		
		if (adtDomain != null && adtDomain.getCoAditamento() != null) {
			iesDomain = this.iesDAO.getIesPorAditamento(adtDomain.getCoAditamento());
			ies = new br.com.mec.fies.presenter.Ies();
			BeanUtils.copyProperties(iesDomain, ies);
		}
		
		if (adtDomain != null && adtDomain.getCoAditamento() != null) {
			termoDomain = this.tFinanciamentoDAO.getTermoPorAditamento(adtDomain.getCoAditamento());
			termo = new br.com.mec.fies.presenter.TermoFinanciamento();
			BeanUtils.copyProperties(termoDomain, termo);
		}
		
		ret.setTermoFinanciamento(termo);
		ret.setIes(ies);
		ret.setAditamento(aditamento);
		ret.setStSucesso(Boolean.TRUE);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}
	
	@Transactional
	public String autenticarUsuario(String nuCpf, String pwd){
		String tmp  = "";
		
		tmp = this.validarCPF(nuCpf); 
		
		if (tmp != null){
			return tmp;
		}
		
		Retorno ret = new Retorno();
		Mensagem m 	= new Mensagem();
		
		
		nuCpf = Utils.getInstance().retirarCaracterEspecialCPF(nuCpf);
		Usuario usuario = getUsuarioDAO().getUsuarioPorCpf(nuCpf, pwd);
		
		if (usuario == null){
			ret.setStSucesso(Boolean.FALSE);
			m.setCoMensagem("I002");
			m.setDsMensagem("Usuário e/ou senha incorretas.");
			m.setTpMensagem("FALHA");
		} else {
			br.com.mec.fies.presenter.Usuario usuarioPresenter = new br.com.mec.fies.presenter.Usuario();
			usuarioPresenter.setStAtivo(true);
			usuarioPresenter.setStPermiteAcesso(true);
			usuarioPresenter.setNoUsuario(usuario.getNome());
			usuarioPresenter.setDsToken(new SessionIdentifierGenerator().nextSessionId());
			
			ret.setStSucesso(Boolean.TRUE);
			ret.setUsuario(usuarioPresenter);
			m.setCoMensagem("I001");
			m.setDsMensagem("Operação realizada com sucesso");
			m.setTpMensagem("SUCESSO");
		}
		
//		Mensagem[] arr = new Mensagem[1];
//		arr[0]= m;
//		ret.setListaMensagem(arr);
		List<Mensagem> mensagens = new ArrayList<Mensagem>();
		mensagens.add(m);
		ListaMensagem listaMensagem = new ListaMensagem();
		listaMensagem.setMensagem(mensagens);
		ret.setListaMensagem(listaMensagem);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}
	
	@Transactional
	public String enviarSMS(Sms sms) {
		String tmp  = "";
		Retorno ret = new Retorno();
		Mensagem m 	= new Mensagem();
		br.com.mec.fies.presenter.Sms smsPresenter = null;
		
		if (sms == null){
			ret.setStSucesso(Boolean.FALSE);
			m.setCoMensagem("I002");
			m.setDsMensagem("Erro no processamento da operação.");
			m.setTpMensagem("FALHA");
		} else {
			smsPresenter = new br.com.mec.fies.presenter.Sms();
			smsPresenter.setCoVerificacao("2828");
			smsPresenter.setQtReenvioRestante(2);
			smsPresenter.setDtExpiracao(new Date());
			
			ret.setStSucesso(Boolean.TRUE);
			ret.setSms(smsPresenter);
			m.setCoMensagem("I001");
			m.setDsMensagem("Operação realizada com sucesso");
			m.setTpMensagem("SUCESSO");
		}
		
//		Mensagem[] arr = new Mensagem[1];
//		arr[0]= m;
//		ret.setListaMensagem(arr);
		
		List<Mensagem> mensagens = new ArrayList<Mensagem>();
		mensagens.add(m);
		ListaMensagem listaMensagem = new ListaMensagem();
		listaMensagem.setMensagem(mensagens);
		ret.setListaMensagem(listaMensagem);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}

	@Transactional
	public String recuperarHistoricoAditamento(String nuCpf) {
		String tmp  = "";
		
		tmp = this.validarCPF(nuCpf); 
		if (tmp != null){
			return tmp;
		}
		
		Retorno ret = new Retorno();
		nuCpf = Utils.getInstance().retirarCaracterEspecialCPF(nuCpf);
		List<br.com.mec.fies.presenter.Aditamento> listaAditamento 	= null;
		br.com.mec.fies.presenter.HistoricoAditamento historicoAditamentoPres = null;
		
		List<HistoricoAditamento> listaHistoricoAditamento 	= this.historicoAditamentoDAO.getListaHistoricoAditamentoPorCpf(nuCpf);
		
		if (listaHistoricoAditamento != null && listaHistoricoAditamento.size() > 0){
			listaAditamento = new ArrayList<br.com.mec.fies.presenter.Aditamento>();
			
			for (HistoricoAditamento historicoAditamento : listaHistoricoAditamento) {
				br.com.mec.fies.presenter.Aditamento aditamento = new br.com.mec.fies.presenter.Aditamento();
				BeanUtils.copyProperties(historicoAditamento, aditamento);
				listaAditamento.add(aditamento);
			}
			
			historicoAditamentoPres = new  br.com.mec.fies.presenter.HistoricoAditamento();
			historicoAditamentoPres.setAditamento(listaAditamento);
		}
		
		ret.setListaHistoricoAditamento(historicoAditamentoPres);
		ret.setStSucesso(Boolean.TRUE);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(ret);
		
		return tmp;
	}
	
	@Transactional
	public String confirmarReabertura(ConfirmaAbertura confirmaAbertura) {
		String tmp  = "";
		Retorno ret = new Retorno();
		Mensagem m 	= new Mensagem();
		
		if (confirmaAbertura == null){
			ret.setStSucesso(Boolean.FALSE);
			m.setCoMensagem("I002");
			m.setDsMensagem("Erro no processamento da operação.");
			m.setTpMensagem("FALHA");
		} else {
			ret.setStSucesso(Boolean.TRUE);
			m.setCoMensagem("I001");
			m.setDsMensagem("Operação realizada com sucesso");
			m.setTpMensagem("SUCESSO");
		}
		
//		Mensagem[] arr = new Mensagem[1];
//		arr[0]= m;
//		ret.setListaMensagem(arr);
		List<Mensagem> mensagens = new ArrayList<Mensagem>();
		mensagens.add(m);
		ListaMensagem listaMensagem = new ListaMensagem();
		listaMensagem.setMensagem(mensagens);
		ret.setListaMensagem(listaMensagem);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}
	
	@Transactional
	public String validarAditamento(br.com.mec.fies.presenter.ValidaAditamento validaAditamentoPresenter){
		String tmp  = "";
		Retorno ret = new Retorno();
		Mensagem m 	= new Mensagem();
		br.com.mec.fies.presenter.ValidaAditamento valPresenter = null;
		
		String nuCpf = validaAditamentoPresenter.getNuCpf();
		nuCpf = Utils.getInstance().retirarCaracterEspecialCPF(nuCpf);
		Integer coAditamento = validaAditamentoPresenter.getCoAditamento();
		
		Aditamento aditamento = new Aditamento();
		aditamento.setCoAditamento(validaAditamentoPresenter.getCoAditamento());
		aditamento = this.aditamentoDAO.getAditamentoPorPk(coAditamento);
		aditamento.setCoSituacaoAditamento(validaAditamentoPresenter.getTpValidacao());
		this.aditamentoDAO.update(aditamento);;
		
		List<ValidaAditamento> listaValida 	= this.validaAditamentoDAO.getListaValidaPorCpfEAditamento(nuCpf.trim(), coAditamento);
		
		if (listaValida == null || listaValida.size() == 0){
			ret.setStSucesso(Boolean.FALSE);
			m.setCoMensagem("I002");
			m.setDsMensagem("Erro no processamento da operação.");
			m.setTpMensagem("FALHA");
		} else {
			for (ValidaAditamento valAditamentoDomain : listaValida) {
				if (valAditamentoDomain.getTpValidacao() == validaAditamentoPresenter.getTpValidacao()){
					valPresenter = new br.com.mec.fies.presenter.ValidaAditamento();
					BeanUtils.copyProperties(valAditamentoDomain, valPresenter);
					break;
				}
			}
			
			ret.setStSucesso(Boolean.TRUE);
			m.setCoMensagem("I001");
			m.setDsMensagem("Operação realizada com sucesso");
			m.setTpMensagem("SUCESSO");
		}
		
		ret.setValidaAditamento(valPresenter);
//		Mensagem[] arr = new Mensagem[1];
//		arr[0]= m;
//		ret.setListaMensagem(arr);
		List<Mensagem> mensagens = new ArrayList<Mensagem>();
		mensagens.add(m);
		ListaMensagem listaMensagem = new ListaMensagem();
		listaMensagem.setMensagem(mensagens);
		ret.setListaMensagem(listaMensagem);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}

	
	
	@Transactional
	public String recuperarDadosCadastrais(String nuCpf, Integer coAditamento) {
		String tmp  = "";
		Retorno ret = new Retorno();
		Mensagem m 	= new Mensagem();
		List<br.com.mec.fies.presenter.Fiador> listaFiador = null;
		ListaFiador listaF = null;
		
		tmp = this.validarCPF(nuCpf); 
		
		if (tmp != null){
			return tmp;
		}
		
		br.com.mec.fies.presenter.Aditamento aditamento = new br.com.mec.fies.presenter.Aditamento();
		nuCpf = Utils.getInstance().retirarCaracterEspecialCPF(nuCpf);
//        Mensagem[] arr = new Mensagem[1];
		
		//Recuperando informacoes do banco
        DadoCadastral dadoCadastralDomain = this.dadoCadastralDAO.getDadoCadastralPorCpf(nuCpf);
        
        if (dadoCadastralDomain != null){
        	
        	Ies ies = this.iesDAO.getIesPorAditamento(coAditamento);
        	
        	TermoFinanciamento termo = this.tFinanciamentoDAO.getTermoPorAditamento(coAditamento);
        	
        	List<Fiador> listaFiadorDomain = this.fiadorDAO.getListaFiadorPorCpfEstudante(nuCpf, coAditamento);
        	
        	//Populando a lista de fiadores
        	if (listaFiadorDomain != null && listaFiadorDomain.size() > 0){
        		listaFiador = new ArrayList<br.com.mec.fies.presenter.Fiador>();
        		
        		for (Fiador fiador : listaFiadorDomain) {
        			br.com.mec.fies.presenter.Fiador fiador1 = new br.com.mec.fies.presenter.Fiador();
        			BeanUtils.copyProperties(fiador, fiador1);
        			listaFiador.add(fiador1);
        		}
        		
        		listaF = new ListaFiador();
        		listaF.setFiador(listaFiador);
        	}
        	
        	//Populando os dados cadastrais
        	br.com.mec.fies.presenter.DadoCadastral dadoCadastral = new br.com.mec.fies.presenter.DadoCadastral();
        	BeanUtils.copyProperties(dadoCadastralDomain, dadoCadastral);
        	
        	//Populando o custo do financiamento
        	CursoFinanciamento cursoFinanciamento = new CursoFinanciamento();
        	BeanUtils.copyProperties(ies, cursoFinanciamento);
        	BeanUtils.copyProperties(termo, cursoFinanciamento);
        	
        	aditamento.setListaFiador(listaF);
        	aditamento.setDadosCadastrais(dadoCadastral);
        	aditamento.setCursoFinanciamento(cursoFinanciamento);
        	ret.setAditamento(aditamento);
        	
        	ret.setStSucesso(Boolean.TRUE);
        	m.setCoMensagem("I001");
        	m.setDsMensagem("Operação realizada com sucesso");
        	m.setTpMensagem("SUCESSO");
//        	arr[0]= m;
        } else {
        	ret.setStSucesso(Boolean.FALSE);
			m.setCoMensagem("I002");
			m.setDsMensagem("Erro no processamento da operação.");
			m.setTpMensagem("FALHA");
        }
		
//		ret.setListaMensagem(arr);
		List<Mensagem> mensagens = new ArrayList<Mensagem>();
		mensagens.add(m);
		ListaMensagem listaMensagem = new ListaMensagem();
		listaMensagem.setMensagem(mensagens);
		ret.setListaMensagem(listaMensagem);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}
	
	@Transactional
	public String getEscolaPorCoordenadas(Double latitude, Double longitude) {
		String tmp  = "";
		Retorno ret = new Retorno();
		Mensagem m 	= new Mensagem();
		
		Escola escolaDomain = this.escolaDAO.getEscolaPorCoordenadas(latitude, longitude);
		
		if (escolaDomain == null){
			ret.setStSucesso(Boolean.FALSE);
//			m.setCoMensagem("I002");
//			m.setDsMensagem("Coordenadas nao encontradas.");
//			m.setTpMensagem("FALHA");
		} else {
			br.com.mec.fies.presenter.Escola escolaPresenter = new br.com.mec.fies.presenter.Escola();
			BeanUtils.copyProperties(escolaDomain, escolaPresenter);
			ret.setEscola(escolaPresenter);
			
			ret.setStSucesso(Boolean.TRUE);
//        	m.setCoMensagem("I001");
//        	m.setDsMensagem("Operação realizada com sucesso");
//        	m.setTpMensagem("SUCESSO");
		}
		
//		List<Mensagem> mensagens = new ArrayList<Mensagem>();
//		mensagens.add(m);
//		
//		ListaMensagem listaMensagem = new ListaMensagem();
//		listaMensagem.setMensagem(mensagens);
//		ret.setListaMensagem(listaMensagem);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		return tmp;
	}
	
	@Transactional
	public String getObraEscolaPorCoordenadas(Double latitude, Double longitude) {
		String tmp  = "";
		Retorno ret = new Retorno();
		Mensagem m 	= new Mensagem();
		br.com.mec.fies.presenter.Obra obraPresenter  = null;
		
		Obra domain = this.obraDAO.getObraEscolaPorCoordenadas(latitude, longitude);
		
		if (domain == null){
			ret.setStSucesso(Boolean.FALSE);
//			m.setCoMensagem("I002");
//			m.setDsMensagem("Coordenadas nao encontradas.");
//			m.setTpMensagem("FALHA");
		} else {
			obraPresenter = new br.com.mec.fies.presenter.Obra();
			obraPresenter.setNome(domain.getNomeObra());
			obraPresenter.setEndereco(domain.getDesEndereco());
			obraPresenter.setCustoEstimado(domain.getValorPrevisto());
			obraPresenter.setCustoAtual(domain.getValorPago());
			obraPresenter.setPrevisaoEntrega(domain.getDataPrevisaoConclusao());
			obraPresenter.setProgresso(domain.getPercentual());
			obraPresenter.setStatus(domain.getSituacao());
			obraPresenter.setLatitude(domain.getLatitude());
			obraPresenter.setLongitude(domain.getLongitude());
			obraPresenter.setUf(domain.getUf());
			obraPresenter.setBairro(domain.getNomeBairro());
//			obraPresenter.set
			
//			BeanUtils.copyProperties(obraDomain, obraPresenter);
			ret.setObra(obraPresenter);
			
			ret.setStSucesso(Boolean.TRUE);
//        	m.setCoMensagem("I001");
//        	m.setDsMensagem("Operação realizada com sucesso");
//        	m.setTpMensagem("SUCESSO");
		}
		
//		List<Mensagem> mensagens = new ArrayList<Mensagem>();
//		mensagens.add(m);
//		
//		ListaMensagem listaMensagem = new ListaMensagem();
//		listaMensagem.setMensagem(mensagens);
//		ret.setListaMensagem(listaMensagem);
		
		RootJson root = new RootJson();
		root.setRetorno(ret);
//		tmp = EngineJson.getInstancia().serializarObjeto(root);
		
		tmp = EngineJson.getInstancia().serializarObjeto(obraPresenter);
		
		return tmp;
	}
	
	private String validarCPF(String nuCpf){
		String tmp  = null;
		Retorno ret = null;
		
		if (nuCpf == null){
			ret = new Retorno();
			ret.setStSucesso(Boolean.FALSE);
			
			Mensagem m 	= new Mensagem();
			m.setCoMensagem("I002");
			m.setDsMensagem("CPF Invalido ou Nulo.");
			m.setTpMensagem("FALHA");
			
//			Mensagem[] arr = new Mensagem[1];
//			arr[0]= m;
//			ret.setListaMensagem(arr);
			
			List<Mensagem> mensagens = new ArrayList<Mensagem>();
			mensagens.add(m);
			ListaMensagem listaMensagem = new ListaMensagem();
			listaMensagem.setMensagem(mensagens);
			ret.setListaMensagem(listaMensagem);
			
			tmp = EngineJson.getInstancia().serializarObjeto(ret);
		}
		
		
		
		return tmp;
	}
	
	public void setAditamentoDAO(AditamentoDAO aditamentoDAO) {
		this.aditamentoDAO = aditamentoDAO;
	}

	public void setIesDAO(IesDAO iesDAO) {
		this.iesDAO = iesDAO;
	}

	/**
	 * @param autenticado the autenticado to set
	 */
	public void setAutenticado(Usuario autenticado) {
		this.autenticado = autenticado;
	}

	/**
	 * @return the usuarioDAO
	 */
	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	/**
	 * @param usuarioDAO the usuarioDAO to set
	 */
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}


	
	
}
