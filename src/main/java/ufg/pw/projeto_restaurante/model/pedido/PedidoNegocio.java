package ufg.pw.projeto_restaurante.model.pedido;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.jboss.logging.annotations.Param;
import org.jboss.resteasy.annotations.Form;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.funcionario.FuncionarioNegocio;
import ufg.pw.projeto_restaurante.model.item_de_venda.ItemVenda;
import ufg.pw.projeto_restaurante.model.item_de_venda.TipoItemVenda;
import ufg.pw.projeto_restaurante.model.pedido.dao.PedidoLojaDao;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedido;
import ufg.pw.projeto_restaurante.model.pedido.state.EnumStatusDePedido;
import ufg.pw.projeto_restaurante.model.utils.mesa.Mesa;
import ufg.pw.projeto_restaurante.model.utils.mesa.MesaNegocio;

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
	public Pedido NovoPedidoLoja(){
		return new PedidoLoja();
	}
	
	@POST
	@Path("/salvar_pedido_loja")
	@Consumes("application/json")
	public long SalvarPedidoLoja(@Form PedidoLoja pedido){
		lojaDao = new PedidoLojaDao();
		try {
			pedido = lojaDao.salvar(pedido);
			return pedido.getId();
		} catch (Exception e) {
			return 0;
		}
	}
	


}
