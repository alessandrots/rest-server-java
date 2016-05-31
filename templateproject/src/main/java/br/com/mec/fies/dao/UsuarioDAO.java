package br.com.mec.fies.dao;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.mec.fies.core.db.HibernateDAOImpl;
import br.com.mec.fies.domain.Usuario;

@Repository
public class UsuarioDAO  extends HibernateDAOImpl<Usuario> {

	@Override
	protected Class<Usuario> getEntityClass() {
		return Usuario.class;
	}
	
	public Usuario getUsuario(String login, String senha) {
		Query query = getSession().createQuery("from Usuario usr where usr.login = ? and usr.hashSenha = ?");
		query.setString(0, login);
		query.setString(1, DigestUtils.sha256Hex(senha));
		return (Usuario) query.uniqueResult();				   
	}
	
	public Usuario getUsuarioPorCpf(String nuCpf, String senha) {
		Query query = getSession().createQuery("from Usuario usr where usr.nuCpf = ? and usr.hashSenha = ?");
		query.setString(0, nuCpf);
		query.setString(1, DigestUtils.sha256Hex(senha));
		return (Usuario) query.uniqueResult();				   
	}

	public Usuario getUsuario(String login) {
		Query query = getSession().createQuery("from Usuario usr where usr.login = ?");
		query.setString(0, login);
		return (Usuario) query.uniqueResult();
	}
}
