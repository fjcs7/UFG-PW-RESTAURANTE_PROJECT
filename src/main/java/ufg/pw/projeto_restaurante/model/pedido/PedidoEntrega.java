package ufg.pw.projeto_restaurante.model.pedido;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;

@Entity
@AssociationOverride(name="itens",
				     joinColumns = @JoinColumn(name="id_item_entrega"))
public class PedidoEntrega extends Pedido implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 311386992287005190L;

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
