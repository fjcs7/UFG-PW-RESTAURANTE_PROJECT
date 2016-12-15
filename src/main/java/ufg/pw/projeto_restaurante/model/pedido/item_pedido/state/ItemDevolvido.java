package ufg.pw.projeto_restaurante.model.pedido.item_pedido.state;

import java.io.Serializable;

public class ItemDevolvido extends StatusDoItem implements Serializable {

	private static final long serialVersionUID = 2048225873632234612L;

	public ItemDevolvido(){
		this.valorStatus = EnumStatusItemPedido.DEVOLVIDO;
	}

}
