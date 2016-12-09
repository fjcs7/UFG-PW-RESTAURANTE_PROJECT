package ufg.pw.projeto_restaurante.model.pedido;

import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedido;
import ufg.pw.projeto_restaurante.model.utils.mesa.Mesa;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class PedidoLoja extends Pedido{
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_mesa",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(value=CascadeType.PERSIST)
	protected Mesa mesa;
	
	@AssociationOverride(name = "")
	@OneToMany(mappedBy ="pedido_id",targetEntity = ItemPedido.class,  fetch=FetchType.EAGER)
	protected List<ItemPedido> itens;
	
	public PedidoLoja() {};
	
	public PedidoLoja(Funcionario atendente, Cliente cliente, Mesa mesa) {
		super(atendente, cliente);
		this.mesa = mesa;
	}
	public Mesa getMesa() {
		return mesa;
	}
}
