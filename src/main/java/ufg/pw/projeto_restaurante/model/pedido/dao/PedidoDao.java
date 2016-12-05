package ufg.pw.projeto_restaurante.model.pedido.dao;

import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;
import ufg.pw.projeto_restaurante.model.pedido.Pedido;

public class PedidoDao extends GenericDao<Pedido, Integer>{
	 public PedidoDao() {
	       super(Pedido.class);
	    }   
}
