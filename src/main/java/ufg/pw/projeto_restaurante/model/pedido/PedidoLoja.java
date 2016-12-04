package ufg.pw.projeto_restaurante.model.pedido;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.utils.mesa.Mesa;

public class PedidoLoja extends Pedido{
	protected Mesa mesa;
	public PedidoLoja(Funcionario atendente, Cliente cliente, Mesa mesa) {
		super(atendente, cliente);
		this.mesa = mesa;
	}
	public Mesa getMesa() {
		return mesa;
	}
}
