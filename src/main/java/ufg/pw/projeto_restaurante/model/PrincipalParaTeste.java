package ufg.pw.projeto_restaurante.model;

import java.util.List;

public class PrincipalParaTeste {

	public static void main(String[] args) {
		List<ItemVenda> list;
		ItemVenda itemA = new ItemVenda("Produto", "Um produto ai", 15.55, TipoItemVenda.PRATO);
		ItemVendaDAO persist = ItemVendaDAO.getInstance();
		persist.merge(itemA);
		list = persist.findAll();
		itemA = list.get(list.size()-1);
		System.out.println(itemA.getId() + " - "+ itemA.getDescricao());
	}

}
