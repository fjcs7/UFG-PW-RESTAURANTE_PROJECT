package ufg.pw.projeto_restaurante.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import ufg.pw.projeto_restaurante.model.cliente.ClienteNegocio;
import ufg.pw.projeto_restaurante.model.item_de_venda.ItemVendaNegocio;
import ufg.pw.projeto_restaurante.model.pedido.PedidoNegocio;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedidoNegocio;
import ufg.pw.projeto_restaurante.model.utils.mesa.MesaNegocio;

@ApplicationPath("/api")
public class ApplicationController extends Application {

	  private Set<Object> singletons = new HashSet<Object>();

	  @Override
	  public Set<Object> getSingletons() {
	    return singletons;
	  }
	  
	  public ApplicationController() {
	    singletons.add(new PedidoNegocio());
	    singletons.add(new ItemPedidoNegocio());
	    singletons.add(new ClienteNegocio());
	    singletons.add(MesaNegocio.getInstancia());
	    singletons.add(new ItemVendaNegocio());
	  }

}
