package br.com.mec.fies.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.mec.fies.core.db.HibernateDAOImpl;
import br.com.mec.fies.domain.ValidaAditamento;

@Repository
public class ValidaAditamentoDAO extends HibernateDAOImpl<ValidaAditamento> {

	@Override
	protected Class<ValidaAditamento> getEntityClass() {
		return ValidaAditamento.class;
	}
	
//	public ValidaAditamento recuperarValidacaoPorCpfEAditamento(String nuCpf, Integer coAditamento) {
//		Query query = getSession().createQuery("from ValidaAditamento usr where usr.nuCpf = ? and usr.coAditamento = ? ");
//		query.setString(0, nuCpf);
//		query.setInteger(1, coAditamento);
//		return (ValidaAditamento) query.uniqueResult();				   
//	}
	
	public List<ValidaAditamento> getListaValidaPorCpfEAditamento(String nuCpfEstudante, Integer coAditamento) {
		Query query = getSession().createQuery("from ValidaAditamento usr where usr.nuCpf = ?  and usr.coAditamento = ?");
		query.setString(0, nuCpfEstudante);
		query.setInteger(1, coAditamento);
		List<ValidaAditamento> list = (List<ValidaAditamento>) query.list();
		
		return list;				   
	}

}
