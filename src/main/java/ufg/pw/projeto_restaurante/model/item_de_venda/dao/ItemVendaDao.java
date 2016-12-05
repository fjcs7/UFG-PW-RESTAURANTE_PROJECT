package ufg.pw.projeto_restaurante.model.item_de_venda.dao;

import ufg.pw.projeto_restaurante.model.item_de_venda.ItemVenda;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class ItemVendaDao extends GenericDao<ItemVenda, Integer> {
	public ItemVendaDao() {
		 super(ItemVenda.class);
	}
}
