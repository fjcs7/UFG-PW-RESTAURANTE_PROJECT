package ufg.pw.projeto_restaurante.model.pedido;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ufg.pw.projeto_restaurante.model.pedido.dao.PedidoLojaDao;
import ufg.pw.projeto_restaurante.model.pedido.state.EnumStatusDePedido;

@Path("/pedidos")
public class PedidoNegocio {
	private PedidoLojaDao lojaDao;
	
	@GET
	@Path("/listar_pedidos_loja_abertos")
	@Produces("application/json")
	public List<PedidoLoja> ListarPedidosLojaAbertos(){
		lojaDao = new PedidoLojaDao();
		return lojaDao.obterListaPorStatus(EnumStatusDePedido.ABERTO);
	}
	
	public boolean SalvarPedidoLoja(){
		PedidoLoja pl = new PedidoLoja();
		
		lojaDao = new PedidoLojaDao();
		
		try {
			
			
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

}
