package ufg.pw.projeto_restaurante.model.utils.mesa.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

import ufg.pw.projeto_restaurante.model.pedido.PedidoLoja;
import ufg.pw.projeto_restaurante.model.pedido.state.EnumStatusDePedido;
import ufg.pw.projeto_restaurante.model.utils.mesa.Mesa;
import ufg.pw.projeto_restaurante.model.utils.mesa.state.EnumStatusDaMesa;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class MesaDao extends GenericDao<Mesa, Integer> {
    public MesaDao() {
       super(Mesa.class);
    }   
    
	 @SuppressWarnings("unchecked")
	public List<Mesa> obterListaPorStatus(EnumStatusDaMesa status){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		builder.createQuery(persistedClass);
		Query sqlQuery = entityManager.createNativeQuery("SELECT * FROM " + persistedClass.getSimpleName() + " WHERE status = ?", persistedClass);
		return sqlQuery.setParameter(1, status.valor()).getResultList();
	 }
}
