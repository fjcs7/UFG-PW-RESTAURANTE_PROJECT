package ufg.pw.projeto_restaurante.model.pedido;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ufg.pw.projeto_restaurante.model.pedido.dao.PedidoLojaDao;

@Path("/pedidos")
public class PedidoNegocio {
	
	@GET
	@Path("/listar_pedidos_loja_abertos")
	@Produces("application/json")
	public List<PedidoLoja> ListarPedidosLojaAbertos(){
		PedidoLojaDao pedidoDao = new PedidoLojaDao();
		return pedidoDao.obterLista();
	}

}
