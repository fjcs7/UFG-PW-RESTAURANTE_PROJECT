package ufg.pw.projeto_restaurante.model.pedido;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.jboss.resteasy.annotations.Form;
import ufg.pw.projeto_restaurante.model.pedido.dao.PedidoLojaDao;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedido;
import ufg.pw.projeto_restaurante.model.pedido.state.EnumStatusDePedido;
import ufg.pw.projeto_restaurante.model.pedido.state.StatusPedido;
import ufg.pw.projeto_restaurante.model.utils.mesa.state.StatusDeMesa;

@Path("/pedidos")
public class PedidoNegocio {
	private PedidoLojaDao lojaDao;
	
	@GET
	@Path("/listar_pedidos_loja_abertos")
	@Produces("application/json")
	public List<PedidoLoja> listarPedidosLojaAbertos(){
		lojaDao = new PedidoLojaDao();
		List<PedidoLoja> pedidos = lojaDao.obterListaPorStatus(EnumStatusDePedido.ABERTO);
		return pedidos;
	}
	
	@GET
	@Path("/itens")
	@Produces("application/json")
	public List<ItemPedido> getItems(){
		List<ItemPedido> list = new LinkedList<ItemPedido>();
		
		list.add(new ItemPedido());
		
		return list;
	}
	
	@GET
	@Path("/novo_pedido_loja")
	@Produces("application/json")
	public Pedido novoPedidoLoja(){
		return new PedidoLoja();
	}
	
	@POST
	@Path("/salvar_pedido_loja")
	@Consumes(value="application/json")
	@Produces("application/json")
	public Pedido salvarPedidoLoja(PedidoLoja pedido){
		lojaDao = new PedidoLojaDao();
		System.out.println("======================================>>>>>>>>>" + pedido);
		pedido.mesa.setStatus(StatusDeMesa.utilizarMesa());
		pedido.setStatus(StatusPedido.abrirPedido());
		pedido.getHoraInicioAtendimento();

		try {
			pedido = lojaDao.salvar(pedido);
			System.out.println("======================================>>>>>>>>>" +pedido);
			return pedido;
		} catch (Exception e) {
			System.out.println(e);
			return pedido;
		}
	}
	
	@POST
	@Path("/alterar_pedido_loja")
	@Consumes("application/json")
	public long modificarPedidoLoja(@Form PedidoLoja pedido){
		lojaDao = new PedidoLojaDao();
		System.out.println(pedido.getData());
		pedido.mesa.setStatus(StatusDeMesa.utilizarMesa());
		pedido.setStatus(StatusPedido.abrirPedido());
		pedido.getHoraInicioAtendimento();
		try {
			pedido = lojaDao.atualizar(pedido);
			return pedido.getId();
		} catch (Exception e) {
			return 0;
		}
	}
	
	@POST
	@Path("/cancelar_pedido_loja")
	@Consumes("application/json")
	public long cancelarPedidoLoja(@Form PedidoLoja pedido){
		pedido.status = StatusPedido.CancelarPedido();
		lojaDao = new PedidoLojaDao();
		try {
			pedido = lojaDao.atualizar(pedido);
			return pedido.getId();
		} catch (Exception e) {
			return 0;
		}
	}
	
	@POST
	@Path("/finalizar_pedido_loja")
	@Consumes("application/json")
	public long finalizarPedidoLoja(@Form PedidoLoja pedido){
		pedido.status = StatusPedido.FinalizarPedido();
		lojaDao = new PedidoLojaDao();
		try {
			pedido = lojaDao.atualizar(pedido);
			return pedido.getId();
		} catch (Exception e) {
			return 0;
		}
	}
	
	@POST
	@Path("/excluir_pedido_loja/{idPedido}")
	@Consumes("application/json")
	public boolean excluirPedidoLoja(@FormParam("idPedido") long idPedido){
		lojaDao = new PedidoLojaDao();
		try {
			lojaDao.remover(idPedido); ;
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
