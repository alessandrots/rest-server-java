package br.com.mec.fies.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.mec.fies.core.db.HibernateDAOImpl;
import br.com.mec.fies.domain.Fiador;

@Repository
public class FiadorDAO extends HibernateDAOImpl<Fiador> {

	@Override
	protected Class<Fiador> getEntityClass() {
		return Fiador.class;
	}
	
	public Fiador getFiadorPorCpf(String nuCpf) {
		Query query = getSession().createQuery("from Fiador usr where usr.nuCpf = ? ");
		query.setString(0, nuCpf);
		return (Fiador) query.uniqueResult();				   
	}

	public Fiador getFiadorPorPk(Integer codigo) {
		Query query = getSession().createQuery("from Fiador usr where usr.codigo = ?");
		query.setInteger(0, codigo);
		return (Fiador) query.uniqueResult();
	}
	
	public List<Fiador> getListaFiadorPorCpfEstudante(String nuCpfEstudante, Integer coAditamento) {
		Query query = getSession().createQuery("from Fiador usr where usr.nuCpfEstudante = ?  and coAditamento = ?");
		query.setString(0, nuCpfEstudante);
		query.setInteger(1, coAditamento);
		List<Fiador> list = (List<Fiador>) query.list();
		
		return list;				   
	}


}
