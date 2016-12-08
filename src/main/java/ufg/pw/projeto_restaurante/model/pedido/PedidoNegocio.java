package ufg.pw.projeto_restaurante.model.pedido;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ufg.pw.projeto_restaurante.model.pedido.dao.PedidoLojaDao;
import ufg.pw.projeto_restaurante.model.pedido.state.EnumStatusDePedido;

@Path("/pedidos")
public class PedidoNegocio {
	
	@GET
	@Path("/listar_pedidos_loja_abertos")
	@Produces("application/json")
	public List<PedidoLoja> ListarPedidosLojaAbertos(){
		PedidoLojaDao pedidoDao = new PedidoLojaDao();
		return pedidoDao.obterListaPorStatus(EnumStatusDePedido.ABERTO);
	}

}
