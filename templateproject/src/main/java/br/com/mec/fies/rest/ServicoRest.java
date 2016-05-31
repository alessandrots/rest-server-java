package br.com.mec.fies.rest;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.mec.fies.core.server.SpringManager;
import br.com.mec.fies.facade.FiesFacade;
import br.com.mec.fies.presenter.ConfirmaAbertura;
import br.com.mec.fies.presenter.Entrada;
import br.com.mec.fies.presenter.Retorno;
import br.com.mec.fies.presenter.RootJson;
import br.com.mec.fies.presenter.Sms;
import br.com.mec.fies.presenter.ValidaAditamento;
import br.com.mec.fies.util.EngineJson;

@Path("/servicos")

/**Classe para objetos do tipo Funcionários, onde serão contidos, valores e métodos para o mesmo.

 * @author MBAMobi

 * @version 1.00

 * @since Release 01 da aplicação

 */

@Component("serviceTest")
public class ServicoRest {
	
	@Autowired	 
	private FiesFacade fiesFacade;
	
	@Context
	HttpServletRequest request;
	
	/**
	 * <br><b>MÉTODO NÃO NEGOCIAL</b> - Somente para teste.<br>
	 * 
	 * @return String
	 */
	@GET
	@Path("/getMaxixe")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMaxixe(){
		String tmp  = "";
		
//		tmp = "{'balance':1000.21,'num':100,'nickname':null,'is_vip':true,'name':'foo'}";
		
		Retorno ret = new Retorno();
		ret.setMensagem("E aiiiiiiiii");
		RootJson root = new RootJson();
		root.setRetorno(ret);
		
		tmp = EngineJson.getInstancia().serializarObjeto(ret);
		
		System.out.println("Retorno Aditamento = " + tmp);
		
		return tmp;
	}
	
	/**
	 * <br><b>MÉTODO NÃO NEGOCIAL</b> - Somente para teste.<br>
	 * 
	 * @param nuCpf
	 * @return String
	 */
	@GET
	@Path("/aditamento/parte/get")
	@Produces("text/json;charset=UTF-8")
	public String recuperarAditamentoParteBancoGet(@QueryParam("nuCpf") String nuCpf){
		String tmp  = "";
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.recuperarAditamentoPorCpf(nuCpf);
		
		System.out.println("Retorno Aditamento = " + tmp);
		
		return tmp;
	}
	/**
	 * <br><b>MÉTODO NÃO NEGOCIAL</b> - Somente para teste.<br>
	 * 
	 * @param coAditamento
	 * @return String
	 */
	@GET
	@Path("/ies/parte/get")
	@Produces("text/json;charset=UTF-8")
	public String recuperarIesPartBancoGet(@QueryParam("coAditamento") Integer coAditamento){
		String tmp  = "";
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.recuperarIesPorAditamento(coAditamento);
		
		System.out.println("Retorno Ies = " + tmp);
		
		return tmp;
	}
	
	/**
	 * <br><b>MÉTODO NÃO NEGOCIAL</b> - Somente para teste.<br>
	 * 
	 * @param coAditamento
	 * @return String
	 */
	@GET
	@Path("/termo/parte/get")
	@Produces("text/json;charset=UTF-8")
	public String recuperarTermoPartBancoGet(@QueryParam("coAditamento") Integer coAditamento){
		String tmp  = "";
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.recuperarTermoPorAditamento(coAditamento);
		
		System.out.println("Retorno Ies = " + tmp);
		
		return tmp;
	}
	
	/**
	 * <br><b>MÉTODO NEGOCIAL</b>:<br>
	 * 
	 * <b>Parâmetro de entrada:</b><br>
	 *<pre>
	 *  JSON.stringify({'nuCpf': '51964149754'});
	 *</pre> 
	 *
	 *
	 *<br><b>Retorno:</b><br>
	 *<pre>
		{
		  "stSucesso": true,
		  "listaHistoricoAditamento": {
		    "aditamento": [
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 1,
		        "nuAno": 2013,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2013/02/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 2,
		        "nuAno": 2013,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2013/06/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 1,
		        "nuAno": 2014,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2014/02/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 2,
		        "nuAno": 2014,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2014/06/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 1,
		        "nuAno": 2015,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2015/02/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 2,
		        "nuAno": 2015,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2015/06/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação19",
		        "nuSemestre": 1,
		        "nuAno": 2019,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2019/02/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação19",
		        "nuSemestre": 2,
		        "nuAno": 2019,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2019/07/03"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação20",
		        "nuSemestre": 1,
		        "nuAno": 2020,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2020/02/03"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação20",
		        "nuSemestre": 2,
		        "nuAno": 2020,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2020/07/05"
		      }
		    ]
		  }
		}
	 *</pre>
	 * 
	 * Formato URL:
	 * var url_ = "/mecfies/ns/rest/servicos/aditamento/disponivel";
	 * 
	 * http://localhost:8080/mecfies/ns/rest/servicos/aditamento/disponivel
	 * @param nuCpf
	 * @return String
	 */
	@Path("/aditamento/disponivel")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String recuperarAditamentoDisponivelGet(@RequestBody Entrada entrada){
		String tmp  = "";
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.recuperarAditamentoDisponivelPorCpf(entrada.getNuCpf());
		
		System.out.println("Retorno Aditamento e outros = " + tmp);
		
		return tmp;
	}
	
	
	/**
	 * <br><b>MÉTODO NEGOCIAL</b>:<br>
	 * 
	 *<b>Parâmetro de entrada:</b><br>
	 *<pre>  
	 *  JSON.stringify({
            	'nuCpf': '51964149754',
            	'senha': '111'
                });
	 * </pre>
	 *  
	 *<br><b>Retorno:</b><br> 
	 *<pre>
	 * {
		  "retorno": {
		    "stSucesso": true,
		    "usuario": {
		      "noUsuario": "Alessandro T. Santos",
		      "stAtivo": true,
		      "stPermiteAcesso": true,
		      "dsToken": "mi149j2e7lmv0pee0vr8j92f1o"
		    },
		    "listaMensagem": {
		      "mensagem": [
		        {
		          "coMensagem": "I001",
		          "tpMensagem": "SUCESSO",
		          "dsMensagem": "Operação realizada com sucesso"
		        }
		      ]
		    }
		  }
		}
	 * </pre>
	 * 
	 * http://<server>:<port>/<contexto>/ns/rest/servicos/seguranca/autenticar
	 * http://localhost:8080/mecfies/ns/rest/servicos/seguranca/autenticar
	 * @return String
	 */
	@POST
	@Path("/seguranca/autenticar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String autenticarUsuario(@RequestBody br.com.mec.fies.presenter.Usuario usuario){
		String tmp  = "";
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.autenticarUsuario(usuario.getNuCpf(), usuario.getSenha());
		
		System.out.println("Retorno autenticarUsuario = " + tmp);
		
		return tmp;
	}
	
	/**
	 * <br><b>MÉTODO NEGOCIAL</b>:<br>
	 * 
	 * <b>Parâmetro de entrada:</b><br>
	 * <pre>  
	 *  JSON.stringify({
    	'nuCpf': '519.641.497-54',
        'nuRic': '9838390202020298289202928288282828',
        'dsEmail': 'ats.xvy@mail.com',
        'coOcupacao': 1,
        'nuCep':'12.345-678',
        'dsEndereco': 'Avenida Flamengo, Rua Buarque de Macedo numero',
        'dsComplemento': 'outro complemento',
        'nuEndereco': 60,
        'nuTelefone': '(21)2772-7820',
        'nuCelular': '(21)99872-7820'
        });
	 * </pre>
	 * 
	 *<br><b>Retorno:</b><br> 
	 *<pre>
	 *{
		  "retorno": {
		    "stSucesso": true,
		    "sms": {
		      "coVerificacao": "2828",
		      "qtReenvioRestante": 2,
		      "dtExpiracao": "11/08/2015 09:41:57"
		    },
		    "listaMensagem": {
		      "mensagem": [
		        {
		          "coMensagem": "I001",
		          "tpMensagem": "SUCESSO",
		          "dsMensagem": "Operação realizada com sucesso"
		        }
		      ]
		    }
		  }
		}
	 *</pre>
	 *
	 * http://<server>:<port>/<contexto>/ns/rest/servicos/sms/enviar
	 * http://localhost:8080/mecfies/ns/rest/servicos/sms/enviar
	 * @param conteudo
	 * @return String
	 */
	@POST
	@Path("/sms/enviar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String enviarSMS(@RequestBody Sms sms) {
		String tmp  = "";
		
		System.out.println("enviarSMS conteudo = " + sms);
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.enviarSMS(sms);
		
		System.out.println("Retorno enviarSMS = " + tmp);
		
		return tmp;
	}
	
	/**
	 * <br><b>MÉTODO NEGOCIAL</b>:<br>
	 * 
	 * <b>Parametro via Get</b> <br>
	 * <pre>
	 * nuCpf
	 * </pre>
	 * 
	 * <br><b>Retorno:</b><br>
	 * <pre>
	 * {
		  "stSucesso": true,
		  "listaHistoricoAditamento": {
		    "aditamento": [
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 1,
		        "nuAno": 2013,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2013/02/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 2,
		        "nuAno": 2013,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2013/06/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 1,
		        "nuAno": 2014,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2014/02/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 2,
		        "nuAno": 2014,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2014/06/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 1,
		        "nuAno": 2015,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2015/02/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação",
		        "nuSemestre": 2,
		        "nuAno": 2015,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2015/06/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação19",
		        "nuSemestre": 1,
		        "nuAno": 2019,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2019/02/01"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação19",
		        "nuSemestre": 2,
		        "nuAno": 2019,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2019/07/03"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação20",
		        "nuSemestre": 1,
		        "nuAno": 2020,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2020/02/03"
		      },
		      {
		        "tpAditamento": "Aditamento de Renovação20",
		        "nuSemestre": 2,
		        "nuAno": 2020,
		        "nuCpf": "51964149754",
		        "dtContratacao": "2020/07/05"
		      }
		    ]
		  }
		}
	 * </pre>
	 * 
	 * http://<server>:<port>/<contexto>/ns/rest/servicos/aditamento/historico?nuCpf=51964149754
	 * http://localhost:8080/mecfies/ns/rest/servicos/aditamento/historico?nuCpf=51964149754
	 * @param nuCpf
	 * @return String
	 */
	@GET
	@Path("/aditamento/historico")
	@Produces("text/json;charset=UTF-8")
	public String recuperarHistoricoAditamento(@QueryParam("nuCpf") String nuCpf){
		String tmp  = "";
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.recuperarHistoricoAditamento(nuCpf);
		
		System.out.println("Retorno Historico Aditamento = " + tmp);
		
		return tmp;
	}
	
	/**
	 * <br><b>MÉTODO NEGOCIAL</b>:<br>
	 * <b>Parâmetro de entrada</b>:<br>
	 *<pre>  
	 *  JSON.stringify({
            	'nuCpf': '519.641.497-54',
                'nuRic': '9838390202020298289202928288282828',
                'dsEmail': 'ats.xvy@mail.com',
                'coOcupacao': 1,
                'nuCep':'12.345-678',
                'dsEndereco': 'Avenida Flamengo, Rua Buarque de Macedo numero',
                'dsComplemento': 'outro complemento',
                'nuEndereco': 60,
                'nuTelefone': '(21)2772-7820',
                'nuCelular': '(21)99872-7820'
                });
	 * </pre>
	 * 
	 * <br><b>Retorno:</b><br>
	 * <pre>
	 * {
		  "retorno": {
		    "stSucesso": true,
		    "listaMensagem": {
		      "mensagem": [
		        {
		          "coMensagem": "I001",
		          "tpMensagem": "SUCESSO",
		          "dsMensagem": "Operação realizada com sucesso"
		        }
		      ]
		    }
		  }
		}
	 * </pre>
	 * 
	 * http://<server>:<port>/<contexto>/ns/rest/servicos/aditamento/confirmarreabertura
	 * http://localhost:8080/mecfies/ns/rest/servicos/aditamento/confirmarreabertura
	 * @param conteudo
	 * @return String
	 */
	@POST
	@Path("/aditamento/confirmarreabertura")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String confirmarReabertura(@RequestBody ConfirmaAbertura confirmaAbertura) { //String conteudo){
		String tmp  = "";
		
		System.out.println("confirmarReabertura conteudo = " + confirmaAbertura);
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.confirmarReabertura(confirmaAbertura);
		
		System.out.println("Retorno confirmarReabertura = " + tmp);
		
		return tmp;
	}
	
	/**
	 * <br><b>MÉTODO NEGOCIAL</b>:<br>
	 * <b>Parâmetro de entrada</b>:<br>
	 *<pre>  
	 *  JSON.stringify({
            	'nuCpf': '519.641.497-54',
                'coAditamento': '1',
                'tpValidacao': '1'
                });
	 * </pre>
	 * 
	 * <br><b>Retorno:</b><br>
	 * <pre>
	 * {
		  "retorno": {
		    "stSucesso": true,
		    "validaAditamento": {
		      "nuCpf": "51964149754",
		      "coAditamento": 1,
		      "tpValidacao": 1
		    },
		    "listaMensagem": {
		      "mensagem": [
		        {
		          "coMensagem": "I001",
		          "tpMensagem": "SUCESSO",
		          "dsMensagem": "Operação realizada com sucesso"
		        }
		      ]
		    }
		  }
		}
	 * </pre>
	 * 
	 * http://<server>:<port>/<contexto>/ns/rest/servicos/aditamento/validar
	 * http://localhost:8080/mecfies/ns/rest/servicos/aditamento/validar
	 * @param conteudo
	 * @return String
	 */
	@POST
	@Path("/aditamento/validar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String validarAditamento(@RequestBody ValidaAditamento validaAditamento) {
		String tmp  = "";
		
		System.out.println("validarAditamento conteudo = " + validaAditamento);
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.validarAditamento(validaAditamento);
		
		System.out.println("Retorno Aditamento e outros = " + tmp);
		
		return tmp;
	}
	
	/**
	 * <br><b>MÉTODO NEGOCIAL</b>:<br>
	 * <b>Parâmetro de entrada</b>:<br>
	 *<pre>  
	 *  JSON.stringify({
            	'nuCpf': '519.641.497-54',
                'coAditamento': '1',
                'tpValidacao': '1'
                });
	 * </pre>
	 * 
	 * <br><b>Retorno:</b><br>
	 * <pre>
	 * {
		  "retorno": {
		    "stSucesso": true,
		    "aditamento": {
		      "dadosCadastrais": {
		        "codigo": 1,
		        "nuCpf": "51964149754",
		        "dsEmail": "ats.xvy@mail.com",
		        "coOcupacao": 20,
		        "nuCep": "12345678",
		        "dsEndereco": "Avenida Flamengo, Rua Buarque de Macedo numero",
		        "dsComplemento": "outro complemento",
		        "nuEndereco": 60,
		        "nuTelefone": "28277278",
		        "nuCelular": "992827727",
		        "noEstudate": "Juca da Silva Xavier Fernandes Fonseca",
		        "dtNascimento": "09/05/1989",
		        "nuRg": "1234567890",
		        "dtEmissao": "01/02/2004",
		        "dsOrgaoEmissor": "SSP",
		        "sgUfOrgaoEmissor": "DF",
		        "nuRic": "98383902020202982",
		        "stEstadoCivil": "CASADO",
		        "dsOcupacao": "Estudante",
		        "dsMunicipio": "Rio de Janeiro",
		        "sgUf": "RJ"
		      },
		      "cursoFinanciamento": {
		        "coIes": 2,
		        "noIes": "Centro Universitario Unieuro",
		        "coLocalOferta": 2,
		        "noLocalOferta": "UnB",
		        "coCurso": 3,
		        "noCurso": "Medicina",
		        "dsGrau": "Superior",
		        "dsTurno": "Integral",
		        "coAditamento": 1,
		        "nuSemestre": 2,
		        "nuAno": 2015,
		        "nuMatricula": "32829282",
		        "qtDuracaoRegular": 2,
		        "qtSemestresConcluidos": 1,
		        "qtSemestresDilatados": 1,
		        "qtSemestresSuspensos": 1,
		        "qtSemestresFinanciados": 4,
		        "qtSemestresTotal": 8,
		        "vlSemestralidadeSem": 1.5,
		        "vlSemestralidadeCom": 2.5,
		        "vlSemestralidadeAtual": 1.8,
		        "nuPercentualFinanc": 8,
		        "vlSemestreAtualEstudante": 1.55,
		        "vlMensalidadeAtualFies": 1,
		        "vlTotalFinanciamento": 1.7,
		        "vlLimiteCreditoGlobal": 1.75,
		        "nuPercentualProuni": 11,
		        "vlFinancProuni": 1.85,
		        "vlSemestreAtualFies": 1.6
		      },
		      "listaFiador": {
		        "fiador": [
		          {
		            "noFiador": "Lukas Skywalker",
		            "nuCpf": "93145627198",
		            "vlRenda": 2.55,
		            "nuCpfEstudante": "51964149754"
		          },
		          {
		            "noFiador": "Roberto da Silva",
		            "nuCpf": "111222333",
		            "vlRenda": 9.22,
		            "nuCpfEstudante": "51964149754"
		          }
		        ]
		      }
		    },
		    "listaMensagem": {
		      "mensagem": [
		        {
		          "coMensagem": "I001",
		          "tpMensagem": "SUCESSO",
		          "dsMensagem": "Operação realizada com sucesso"
		        }
		      ]
		    }
		  }
		}
	 * </pre>
	 * 
	 * http://<server>:<port>/<contexto>/ns/rest/servicos/aditamento/consultarreabertura?nuCpf=51964149754&coAditamento=1
	 * http://localhost:8080/mecfies/ns/rest/servicos/aditamento/consultarreabertura?nuCpf=51964149754&coAditamento=1
	 * @param nuCpf
	 * @return String
	 */
	@POST
	@Path("/aditamento/consultarreabertura")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String recuperarDadosCadastrais(@RequestBody ConfirmaAbertura confirmaAbertura){
		String tmp  = "";
		
		System.out.println("recuperarDadosCadastrais conteudo = " + confirmaAbertura);
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp 	= this.fiesFacade.recuperarDadosCadastrais(confirmaAbertura.getNuCpf(), confirmaAbertura.getCoAditamento());
		
		System.out.println("Retorno DadosCadastrais = " + tmp);
		
		return tmp;
	}
	
	@POST
	@Path("/fndeobras/getescolaporcoordenadas")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getEscolaPorCoordenadas(@RequestBody Entrada entrada){
		String tmp  = "";
		
		System.out.println("getEscolaPorCoordenadas conteudo = " + entrada);
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp = this.fiesFacade.getEscolaPorCoordenadas(entrada.getLatitude(), entrada.getLongitude());
		
		System.out.println("Retorno Dados Escola = " + tmp);
		
		return tmp;
	}
	
	@POST
	@Path("/fndeobras/getdadosobraescolaporcoordenadas")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getDadosObraEscolaPorCoordenadas(@RequestBody Entrada entrada){
		String tmp  = "";
		
		System.out.println("getEscolaPorCoordenadas conteudo = " + entrada);
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp = this.fiesFacade.getObraEscolaPorCoordenadas(entrada.getLatitude(), entrada.getLongitude());
		
		System.out.println("Retorno Dados Obra Escola = " + tmp);
		
		return tmp;
	}
	
	@GET
	@Path("/fndeobras/getdadosobraescolaporcoordenadas2")
	@Produces("text/json;charset=UTF-8")
	public String getDadosObraEscolaPorCoordenadas2(@QueryParam("latitude") double latitude, @QueryParam("longitude") double longitude){
		String tmp  = "";
		
//		System.out.println("getEscolaPorCoordenadas conteudo = " + entrada);
		
		init();
		
		this.fiesFacade = getFiesFacade();
		
		tmp = this.fiesFacade.getObraEscolaPorCoordenadas(latitude, longitude);
		
		System.out.println("Retorno Dados Obra Escola = " + tmp);
		
		return tmp;
	}
	
	@GET
	@Path("/fndeobras/getdadosobraescolaporcoordenadas3")
	@Produces("text/json;charset=UTF-8")
	public String getDadosObraEscolaPorCoordenadas3(@QueryParam("latitude") double latitude, @QueryParam("longitude") double longitude){
		StringBuffer stb = new StringBuffer();
		
		stb.append("\"obras\": [");
		stb.append("{");
		stb.append("\"id\": 1,");
		stb.append("\"nome\": \"Escola de Educação Infantil\",");
		stb.append("\"endereco\": \"Rua Pedro Inácio de Sousa, n.14\",");
		stb.append("\"custoEstimado\": 950000,");
		stb.append("\"previsaoEntrega\": \"Fri Feb 22 2019 00:00:00 GMT-0300 (BRT)\",");
		stb.append("\"progresso\": 78,");
		stb.append("\"status\": \"Paralisada\",");
		stb.append("\"custoAtual\": 1210000,");
		stb.append("\"empresaContratada\": \"JPL Engenharia\",");
		stb.append("\"coordenadas\": {");
		stb.append("\"lat\": -15.870002,");
		stb.append("\"long\": -47.970909");
		stb.append("},");
		stb.append("\"uf\": \"DF\",");
		stb.append("\"bairro\": \"Águas Claras\",");
		stb.append("\"capa\": \"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725342&_sisarquivo=obras2\",");
		stb.append("\"imagens\": [");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725342&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725343&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725344&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725347&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725348&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725349&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725352&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725359&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725368&_sisarquivo=obras2\"");
		stb.append("],");
		stb.append("\"favorito\": true");
		stb.append("},");
		stb.append("{");
		stb.append("\"id\": 2,");
		stb.append("\"nome\": \"Escola de Educação Adulta\",");
		stb.append("\"endereco\": \"Rua Pedro Inácio de Sousa, n.15\",");
		stb.append("\"custoEstimado\": 950001,");
		stb.append("\"previsaoEntrega\": \"Fri Feb 22 2019 00:00:00 GMT-0300 (BRT)\",");
		stb.append("\"progresso\": 45,");
		stb.append("\"status\": \"Execução\",");
		stb.append("\"custoAtual\": 1210000,");
		stb.append("\"empresaContratada\": \"JPL Engenharia\",");
		stb.append("\"coordenadas\": {");
		stb.append("\"lat\": -15.870002,");
		stb.append("\"long\": -47.970909");
		stb.append("},");
		stb.append("\"uf\": \"DF\",");
		stb.append("\"bairro\": \"Águas Claras\",");
		stb.append("\"capa\": \"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725342&_sisarquivo=obras2\",");
		stb.append("\"imagens\": [");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725342&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725343&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725344&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725347&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725348&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725349&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725352&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725359&_sisarquivo=obras2\",");
		stb.append("\"http://simec.mec.gov.br/slideshow/slideshow/verimagem.php?arqid=9725368&_sisarquivo=obras2\"");
		stb.append("],");
		stb.append("\"favorito\": false");
		stb.append("}");
		stb.append("]");
		         
		return stb.toString();       
	}

	public void init() {
		SpringManager.getInstancia().setServletContext(request.getSession().getServletContext());
	}

	public FiesFacade getFiesFacade() {
		return SpringManager.getInstancia().getBean("fiesFacade");
	}

}
