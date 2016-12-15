package ufg.pw.projeto_restaurante.model.cliente;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ufg.pw.projeto_restaurante.model.cliente.dao.ClienteDao;


@Path("/clientes")
public class ClienteNegocio {
	@GET
	@Path("/listar")
	@Produces("application/json")
	public List<Cliente> listarClientes(){
		ClienteDao clienteDao = new ClienteDao();
		return clienteDao.obterLista();
	}
	
	@GET
	@Path("/cliente")
	@Produces("application/json")
	public Cliente obterCliente(){
		ClienteDao clienteDao = new ClienteDao();
		LinkedList<Cliente> clis = (LinkedList<Cliente>) clienteDao.obterLista();
		return clis.getFirst();
	}
	
	public void adicionarCliente(Cliente cliente) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.salvar(cliente);
	}

}