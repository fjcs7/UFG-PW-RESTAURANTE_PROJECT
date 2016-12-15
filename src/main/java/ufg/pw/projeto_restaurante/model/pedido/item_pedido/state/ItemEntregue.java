package ufg.pw.projeto_restaurante.model.pedido.item_pedido.state;

import java.io.Serializable;

public class ItemEntregue extends StatusDoItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2965300014923448121L;

	public ItemEntregue(){
		this.valorStatus = EnumStatusItemPedido.ENTREGUE;
	}

}
