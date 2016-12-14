package ufg.pw.projeto_restaurante.model.item_de_venda;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ufg.pw.projeto_restaurante.model.item_de_venda.dao.ItemVendaDao;

@Path("/produtos")
public class ItemVendaNegocio {
	private ItemVendaDao itemDao;

	@GET
	@Path("/listar")
	@Produces("application/json")
	public List<ItemVenda> listarProdutos(){
		itemDao = new ItemVendaDao();
		return itemDao.obterLista();
	}
	
}
