package ufg.pw.projeto_restaurante.model.pedido.dao;

import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

import ufg.pw.projeto_restaurante.model.pedido.PedidoLoja;

public class PedidoLojaDao extends GenericDao<PedidoLoja, Long>{
	 public PedidoLojaDao() {
       super(PedidoLoja.class);
	 }
}
