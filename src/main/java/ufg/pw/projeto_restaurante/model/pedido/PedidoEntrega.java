package ufg.pw.projeto_restaurante.model.pedido;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class PedidoEntrega extends Pedido {
	
	@Column
	private String observacaoEntrega;
	
	public PedidoEntrega() {};
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
