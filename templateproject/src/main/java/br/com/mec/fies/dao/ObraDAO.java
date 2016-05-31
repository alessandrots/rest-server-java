package br.com.mec.fies.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.mec.fies.core.db.HibernateDAOImpl;
import br.com.mec.fies.domain.Obra;

@Repository
public class ObraDAO extends HibernateDAOImpl<Obra> {

	@Override
	protected Class<Obra> getEntityClass() {
		return Obra.class;
	}
	
	public Obra getObraEscolaPorCoordenadas(Double latitude, Double longitude) {
		Query query = getSession().createQuery("from Obra usr where usr.latitude = ? and usr.longitude = ?");
		query.setDouble(0, latitude);
		query.setDouble(1, longitude);
		return (Obra) query.uniqueResult();				   
	}


}
