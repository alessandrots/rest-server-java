package br.com.mec.fies.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.mec.fies.core.db.HibernateDAOImpl;
import br.com.mec.fies.domain.HistoricoAditamento;

@Repository
public class HistoricoAditamentoDAO extends HibernateDAOImpl<HistoricoAditamento> {

	@Override
	protected Class<HistoricoAditamento> getEntityClass() {
		return HistoricoAditamento.class;
	}
	
	public List<HistoricoAditamento> getListaHistoricoAditamentoPorCpf(String nuCpf) {
		Query query = getSession().createQuery("from HistoricoAditamento usr where usr.nuCpf = ? ");
		query.setString(0, nuCpf);
		List<HistoricoAditamento> list = (List<HistoricoAditamento>) query.list();
		
		return list;				   
	}

	public HistoricoAditamento getHistoricoAditamentoPorPk(Integer coAditamento) {
		Query query = getSession().createQuery("from HistoricoAditamento usr where usr.coHistoricoAditamento = ?");
		query.setInteger(0, coAditamento);
		return (HistoricoAditamento) query.uniqueResult();
	}
}
