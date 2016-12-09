package ufg.pw.projeto_restaurante.model.pedido.dao;

import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Hibernate;

import ufg.pw.projeto_restaurante.model.pedido.PedidoLoja;
import ufg.pw.projeto_restaurante.model.pedido.state.EnumStatusDePedido;

public class PedidoLojaDao extends GenericDao<PedidoLoja, Long>{
	 public PedidoLojaDao() {
       super(PedidoLoja.class);
	 }
	 @SuppressWarnings("unchecked")
	public List<PedidoLoja> obterListaPorStatus(EnumStatusDePedido status){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		builder.createQuery(persistedClass);
		Query sqlQuery = entityManager.createNativeQuery("SELECT * FROM pedido_loja WHERE status = ?", persistedClass);
		return sqlQuery.setParameter(1, status.valor()).getResultList();
	 }
}
