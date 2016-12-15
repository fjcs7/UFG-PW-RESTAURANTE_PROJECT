package ufg.pw.projeto_restaurante.model.pedido.item_pedido.state;

import java.io.Serializable;

public class ItemSolicitado extends StatusDoItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4685745662552197932L;

	public ItemSolicitado(){
		this.valorStatus = EnumStatusItemPedido.SOLICITADO;
	}

}
