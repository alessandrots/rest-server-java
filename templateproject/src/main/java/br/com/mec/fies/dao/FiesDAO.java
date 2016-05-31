package br.com.mec.fies.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.mec.fies.domain.Aditamento;
import br.com.mec.fies.domain.Ies;
import br.com.mec.fies.domain.TermoFinanciamento;
import br.com.mec.fies.presenter.ListaMensagem;
import br.com.mec.fies.presenter.Mensagem;
import br.com.mec.fies.presenter.Retorno;



public class FiesDAO {

	private static FiesDAO fiesDAO;
	
	protected Connection conn = null;
	
	protected String dbClass = "com.mysql.jdbc.Driver";
	
	private static int CONEXAO_MYSQL 	= 1;
	private static int CONEXAO_POSTGRES = 2;
	
	private FiesDAO(){
	}
	
	public static FiesDAO getInstancia(){
		if (fiesDAO == null) {
			fiesDAO = new FiesDAO();
		}
		
		return fiesDAO;
	}
	

	private void criarConexao(int tipo){
		switch (tipo) {
			case 1:
				criarConexaoMySql();
			break;
			case 2:
				criarConexaoPostgres();
			break;

			default:criarConexaoMySql();
			break;
		}
	}
	
	public Retorno consultarDadosAditamentoPorCpf(String nuCpf) {
		criarConexao(CONEXAO_MYSQL);
//		criarConexao(CONEXAO_POSTGRES);
		Boolean stSucesso = true;
		Retorno ret = new Retorno();
		
		Mensagem m = new Mensagem();
		m.setCoMensagem("I001");
		m.setDsMensagem("Operação realizada com sucesso");
		m.setTpMensagem("SUCESSO");
		
		Aditamento r = consultarAditamento(nuCpf);//"51387687000109");
		Ies i = consultarIes(r.getCoAditamento());
		TermoFinanciamento t = consultarTermoFinanciamento(r.getCoAditamento());
		
//		ret.setAditamento(r);
//		ret.setIes(i);
//		ret.setTermoFinanciamento(t);
		
//		Mensagem[] arr = new Mensagem[1];
//		arr[0]= m;
//		ret.setListaMensagem(arr);
		
		List<Mensagem> mensagens = new ArrayList<Mensagem>();
		mensagens.add(m);
		ListaMensagem listaMensagem = new ListaMensagem();
		listaMensagem.setMensagem(mensagens);
		ret.setListaMensagem(listaMensagem);
		
		ret.setStSucesso(stSucesso);
		
		return ret;
	}

	private void criarConexaoMySql() {
		String dbClass = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql:///fies";
		String user = "root"; 
		String password = "";
		
		getConexao(dbClass, dbUrl, user, password);
	}
	
//	<Resource name="jdbc/OutlineDS" auth="Container" type="javax.sql.DataSource"
//    maxActive="100" maxIdle="30" maxWait="100"
//        username="outline" password="outline" driverClassName="org.postgresql.Driver"
//        url="jdbc:postgresql://127.0.0.1:5432/outline"/>
	private void criarConexaoPostgres() {
		String dbClass = "org.postgresql.Driver";
		String dbUrl = "jdbc:postgresql://127.0.0.1:5432/outline";
		String user = "outline"; 
		String password = "outline";
		
		getConexao(dbClass, dbUrl, user, password);
	}
	
	private Connection getConexao(String className, String url, String user, String password) {
		try {
			Class.forName(className);
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(this.conn);
		return this.conn;
	}
	
	public void consultar(){
		StringBuffer stb = new StringBuffer();
		stb.append("SELECT * FROM pma__userconfig");
		PreparedStatement ps = null;
		
		try {
			ps = this.conn.prepareStatement(stb.toString());
			
			ResultSet rs = ps.executeQuery();
			String resposta = "";
			
			while (rs.next()){
				resposta = rs.getString("username");
				resposta += rs.getString("timevalue");
				resposta += rs.getString("config_data");
				
				System.out.println(" resposta = " + resposta);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected Aditamento consultarAditamento(String nuCpf){
		Aditamento adt = null;
		
		StringBuffer stb = new StringBuffer();
		stb.append(" SELECT adt.coAditamento, adt.tpAditamento, adt.nuSemestre, adt.nuAno, adt.dtInicio, adt.dtFim, adt.coSituacaoAditamento, adt.nuCpf");
		stb.append(" FROM aditamento adt ");
		stb.append(" WHERE nuCpf = ? ");
		
		PreparedStatement ps = null;
		
		try {
			ps = this.conn.prepareStatement(stb.toString());
			ps.setString(1, nuCpf);
			
			ResultSet rs = ps.executeQuery();
			adt = new Aditamento();
		
			while (rs.next()){
				adt.setCoAditamento( rs.getInt("coAditamento"));
				adt.setTpAditamento( rs.getString("tpAditamento"));
				adt.setNuSemestre( rs.getInt("nuSemestre"));
				adt.setNuAno( rs.getInt("nuAno"));
				adt.setDtInicio( rs.getString("dtInicio"));
				adt.setDtFim( rs.getString("dtFim"));
				adt.setCoSituacaoAditamento( rs.getInt("coSituacaoAditamento"));
				adt.setNuCpf( rs.getString("nuCpf"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return adt;
	}
	
	protected Ies consultarIes(int coAditamento){
		Ies adt = null;
		
		StringBuffer stb = new StringBuffer();
		stb.append(" SELECT i.coIes, i.noIes, i.coLocalOferta, i.noLocalOferta, i.coCurso, i.noCurso, i.dsGrau, i.dsTurno, i.coAditamento ");
		stb.append(" FROM ies i ");
		stb.append(" WHERE coAditamento = ? ");
		
		PreparedStatement ps = null;
		
		try {
			ps = this.conn.prepareStatement(stb.toString());
			ps.setInt(1, coAditamento);
			
			ResultSet rs = ps.executeQuery();
			adt = new Ies();
		
			while (rs.next()){
				adt.setCoIes( rs.getInt("coIes"));
				adt.setNoIes( rs.getString("noIes"));
				adt.setCoLocalOferta( rs.getInt("coLocalOferta"));
				adt.setNoLocalOferta( rs.getString("noLocalOferta"));
				adt.setCoCurso( rs.getInt("coCurso"));
				adt.setNoCurso( rs.getString("noCurso"));
				adt.setDsGrau( rs.getString("dsGrau"));
				adt.setDsTurno( rs.getString("dsTurno"));
				adt.setCoAditamento( rs.getInt("coAditamento"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return adt;
	}
	
	protected TermoFinanciamento consultarTermoFinanciamento(int coAditamento){
		TermoFinanciamento adt = null;
		
		StringBuffer stb = new StringBuffer();
		stb.append(" SELECT tf.coAditamento, tf.nuSemestre, tf.nuAno, tf.nuMatricula, tf.qtDuracaoRegular, tf.qtSemestresConcluidos, tf.qtSemestresDilatados, "); 
		stb.append(" tf.qtSemestresSuspensos, tf.qtSemestresFinanciados, tf.qtSemestresTotal, tf.vlSemestralidadeSem,  ");
		stb.append(" tf.vlSemestralidadeCom, tf.vlSemestralidadeAtual, tf.nuPercentualFinanc, tf.vlSemestreAtualEstudante, tf.vlSemestreAtualFies, "); 
		stb.append(" tf.vlTotalFinanciamento, tf.vlLimiteCreditoGlobal, tf.nuPercentualProuni, tf.vlFinancProuni ");
		stb.append(" FROM TermoFinanciamento tf  ");
		stb.append(" WHERE coAditamento = ? ");
		
		PreparedStatement ps = null;
		
		try {
			ps = this.conn.prepareStatement(stb.toString());
			ps.setInt(1, coAditamento);
			
			ResultSet rs = ps.executeQuery();
			adt = new TermoFinanciamento();
		
			while (rs.next()){
				adt.setCoAditamento( rs.getInt("coAditamento"));
				adt.setNuSemestre( rs.getInt("nuSemestre"));
				adt.setNuAno( rs.getInt("nuAno"));
				adt.setNuMatricula( rs.getString("nuMatricula"));
				adt.setQtDuracaoRegular( rs.getInt("qtDuracaoRegular"));
				adt.setQtSemestresConcluidos( rs.getInt("qtSemestresConcluidos"));
				adt.setQtSemestresDilatados( rs.getInt("qtSemestresDilatados"));
				adt.setQtSemestresSuspensos( rs.getInt("qtSemestresSuspensos"));
				adt.setQtSemestresFinanciados( rs.getInt("qtSemestresFinanciados"));
				adt.setQtSemestresTotal( rs.getInt("qtSemestresTotal"));
				adt.setVlSemestralidadeSem( rs.getDouble("vlSemestralidadeSem"));
				adt.setVlSemestralidadeCom( rs.getDouble("vlSemestralidadeCom"));
				adt.setVlSemestralidadeAtual( rs.getDouble("vlSemestralidadeAtual"));
				adt.setNuPercentualFinanc( rs.getDouble("nuPercentualFinanc"));
				adt.setVlSemestreAtualEstudante( rs.getDouble("vlSemestreAtualEstudante"));
				adt.setVlSemestreAtualFies( rs.getDouble("vlSemestreAtualFies"));
				adt.setVlTotalFinanciamento( rs.getDouble("vlTotalFinanciamento"));
				adt.setVlLimiteCreditoGlobal( rs.getDouble("vlLimiteCreditoGlobal"));
				adt.setNuPercentualProuni( rs.getDouble("nuPercentualProuni"));
				adt.setVlFinancProuni( rs.getDouble("vlFinancProuni"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return adt;
	}
}
