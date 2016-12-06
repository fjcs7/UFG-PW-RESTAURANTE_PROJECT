package ufg.pw.projeto_restaurante.model.pedido.dao;

import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedido;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class ItemPedidoDao extends GenericDao<ItemPedido, Integer>{
	public ItemPedidoDao() {
		super(ItemPedido.class);
	}

}
