package ufg.pw.projeto_restaurante.model.pedido;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.utils.mesa.Mesa;

@Entity
@Table(name="pedido_loja")
public class PedidoLoja extends Pedido{
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_mesa",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	protected Mesa mesa;
	
	public PedidoLoja() {};
	
	public PedidoLoja(Funcionario atendente, Cliente cliente, Mesa mesa) {
		super(atendente, cliente);
		this.mesa = mesa;
	}
	public Mesa getMesa() {
		return mesa;
	}
}
