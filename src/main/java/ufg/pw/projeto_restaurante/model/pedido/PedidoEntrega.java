package ufg.pw.projeto_restaurante.model.pedido;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;

public class PedidoEntrega extends Pedido {
	public String observacaoEntrega;
	public PedidoEntrega(Funcionario atendente, Cliente cliente, String observacaoEntrega) {
		super(atendente, cliente);
		this.observacaoEntrega = observacaoEntrega;
	}
	public String getObservacaoEntrega() {
		return observacaoEntrega;
	}
	public void setObservacaoEntrega(String observacaoEntrega) {
		this.observacaoEntrega = observacaoEntrega;
	}
}
