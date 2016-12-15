package ufg.pw.projeto_restaurante.model.pedido.item_pedido;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/itens")
public class ItemPedidoNegocio {
	@GET
	@Path("/novoItem")
	@Produces("application/json")
	public ItemPedido novoItemPedido(){
		return new ItemPedido();
	}
}
