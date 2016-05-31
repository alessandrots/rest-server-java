package br.com.mec.fies.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.mec.fies.core.db.HibernateDAOImpl;
import br.com.mec.fies.domain.Escola;

@Repository
public class EscolaDAO extends HibernateDAOImpl<Escola> {

	@Override
	protected Class<Escola> getEntityClass() {
		return Escola.class;
	}
	
	public Escola getEscolaPorCoordenadas(Double latitude, Double longitude) {
		Query query = getSession().createQuery("from Escola usr where usr.numLatitude = ? and usr.numLongitude = ?");
		query.setDouble(0, latitude);
		query.setDouble(1, longitude);
		return (Escola) query.uniqueResult();				   
	}

	

}
