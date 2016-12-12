package ufg.pw.projeto_restaurante.model.pedido;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.jboss.resteasy.annotations.Form;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.utils.mesa.Mesa;

@Entity
@AssociationOverride(name="itens",
        			 joinColumns = @JoinColumn(name="id_item_loja"))
public class PedidoLoja extends Pedido implements Serializable {
	
	private static final long serialVersionUID = 2603445969674186466L;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_mesa",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(value=CascadeType.PERSIST)
	@Form(prefix="mesa")
	protected Mesa mesa;
	
	public PedidoLoja() {};
	
	public PedidoLoja(Funcionario atendente, Cliente cliente, Mesa mesa) {
		super(atendente, cliente);
		this.mesa = mesa;
	}
	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
	public String toString(){
		return "Pedido de Numero: " + this.id + " Da mesa: " + this.mesa.getId();
	}
}
