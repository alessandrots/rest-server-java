package br.com.mec.fies.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.mec.fies.core.db.HibernateDAOImpl;
import br.com.mec.fies.domain.Aditamento;

@Repository
public class AditamentoDAO extends HibernateDAOImpl<Aditamento> {

	@Override
	protected Class<Aditamento> getEntityClass() {
		return Aditamento.class;
	}
	
	public Aditamento getAditamentoPorCpf(String nuCpf) {
		Query query = getSession().createQuery("from Aditamento usr where usr.nuCpf = ? ");
		query.setString(0, nuCpf);
		return (Aditamento) query.uniqueResult();				   
	}

	public Aditamento getAditamentoPorPk(Integer coAditamento) {
		Query query = getSession().createQuery("from Aditamento usr where usr.coAditamento = ?");
		query.setInteger(0, coAditamento);
		return (Aditamento) query.uniqueResult();
	}

}
