package br.com.mec.fies.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.codec.digest.DigestUtils;

public class EngineJDBC {
	
	private static Connection conn;
	private static EngineJDBC engineDB;
	
	//Parâmetros de Conexão
	private String url;
	private String user;
	private String pwd;
	private String driver;
	
	public static EngineJDBC getInstancia(){
		if (engineDB == null){
			engineDB = new EngineJDBC();
		}
		
		return engineDB;
	}

	/**
	 *
	 * driver  = "org.postgresql.Driver";
	 * url 	= "jdbc:postgresql://localhost:5432/outline";
	 * user 	= "postgres";
	 * pwd 	= "123456";
	 * 
	 * driver  = "org.postgresql.Driver";
	 * url 	= "jdbc:postgresql://localhost:5432/outline";
	 * user 	= "outline";
	 * pwd 	= "outline";
	 * 
	 * driver  = "com.mysql.jdbc.Driver";
	 * url = "jdbc:mysql://128.1.30.58/dbsroii";
	 * user 	= "root
	 * pwd 	= "";//ou jv121206
	 * 
	 */
	private EngineJDBC() {
//		this("jdbc:postgresql://127.0.0.1:5432/outline", "outline", "outline", "org.postgresql.Driver");
//		this("jdbc:postgresql://127.0.0.1:5432/fies", "postgres", "root", "org.postgresql.Driver");
		this("jdbc:postgresql://192.168.0.12:5432/fies", "postgres", "root", "org.postgresql.Driver");
	}

	private EngineJDBC(String url, String user, String pwd, String driver) {
		this.url = url;
		this.user = user;
		this.pwd = pwd;
		this.driver = driver;		
		gerarConexao();
	}

	protected void gerarConexao() {
		try {
			Class.forName(this.driver);
			conn = DriverManager.getConnection(this.url, this.user, this.pwd);
			conn.setAutoCommit(false);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		System.out.println(" conexao = "+conn);
	}

	public static Connection getConn() {
		return conn;
	}
	
	public static void recuperarTodasTarefas() {
		Connection conexao 		= getConn();
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append(" select icodigo, snome from negocio.tb_tarefa ");
			PreparedStatement ps = conexao.prepareStatement(sql.toString());			
			//setando filtros
			
			ResultSet rs = ps.executeQuery();
			
			//Montando a lista de objetos
			while (rs.next()){
				System.out.println(" CÓDIGO = " + rs.getInt("icodigo") + " - NOME = " + rs.getString("snome"));
//				t.setCodigo(rs.getInt("icodigo"));
//				t.setNome(rs.getString("snome"));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void recuperarAditamentos() {
		Connection conexao 		= getConn();
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append(" select * from aditamento ");
			PreparedStatement ps = conexao.prepareStatement(sql.toString());			
			//setando filtros
			
			ResultSet rs = ps.executeQuery();
			
			//Montando a lista de objetos
			while (rs.next()){
				System.out.println(" CÓDIGO = " + rs.getString("nucpf") + " - NOME = " + rs.getString("tpaditamento"));
//				t.setCodigo(rs.getInt("icodigo"));
//				t.setNome(rs.getString("snome"));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cadastrarUsuario() {
		Connection conexao 		= getConn();
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append(" Insert into negocio.tb_usuario (snome,susername, semail, spassword) VALUES ");
			sql.append(" (?,?, ?, ?) ");
			PreparedStatement ps = conexao.prepareStatement(sql.toString());
						
			//setando filtros
			ps.setString(1, "Alessandro T. Santos");
			ps.setString(2, "alessandrots");
			ps.setString(3, "alessandro.teixeira@gmail.com");
			ps.setString(4, DigestUtils.sha256Hex("123456"));
			
			//Adicionando linha
			int linha = ps.executeUpdate();

			conexao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		
		EngineJDBC e = EngineJDBC.getInstancia();
		
//		recuperarTodosTesteTmp();//OK
		
//		recuperarTodasTarefas();//OK
		recuperarAditamentos();
		
//		cadastrarUsuario();//OK
		
//		sincronizarTarefas();
	}

	
	
	/**
	SQLs importantes :
	select * from negocio.tb_usuario
	
	select * from negocio.tb_tipo_recurso
	
	select * from negocio.tb_recurso
	
	select * from negocio.tb_calendario
	
	select * from negocio.tb_tarefa
	
	--
	delete from negocio.tb_tarefa
	
	delete from negocio.tb_calendario
	
	insert into negocio.tb_calendario (dia_domingo, dia_segunda, dia_terca,dia_quarta,dia_quinta,dia_sexta,dia_sabado,irecurso)
	values (0,8,8,8,8,8,0, 1) 
	
	insert into negocio.tb_calendario (dia_domingo, dia_segunda, dia_terca,dia_quarta,dia_quinta,dia_sexta,dia_sabado,irecurso)
	values (0,8,0,0,0,0,0, 1)	
	--
	
	 select cal.*
	 from negocio.tb_calendario cal
	 inner join negocio.tb_recurso rec
	 on cal.irecurso = rec.icodigo
	 inner join negocio.tb_usuario usu
	 on rec.iusuario = usu.icodigo
	 where usu.susername = 'alessandrots' 
  
*/
	
}
