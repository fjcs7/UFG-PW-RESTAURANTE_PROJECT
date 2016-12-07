package ufg.pw.projeto_restaurante.model.pedido.dao;

import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

import ufg.pw.projeto_restaurante.model.pedido.PedidoEntrega;

public class PedidoEntregaDao extends GenericDao<PedidoEntrega, Long>{
	 public PedidoEntregaDao() {
       super(PedidoEntrega.class);
	 }
}
