package br.com.mec.fies.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.mec.fies.core.db.HibernateDAOImpl;
import br.com.mec.fies.domain.Ies;

@Repository
public class IesDAO extends HibernateDAOImpl<Ies> {

	@Override
	protected Class<Ies> getEntityClass() {
		return Ies.class;
	}
	
	public Ies getIesPorAditamento(Integer coAditamento) {
		Query query = getSession().createQuery("from Ies usr where usr.coAditamento = ? ");
		query.setInteger(0, coAditamento);
		return (Ies) query.uniqueResult();				   
	}

	public Ies getIesPorPk(Integer coIes) {
		Query query = getSession().createQuery("from Ies usr where usr.coIes = ?");
		query.setInteger(0, coIes);
		return (Ies) query.uniqueResult();
	}

}
