package ufg.pw.projeto_restaurante.model.pedido.item_pedido.state;

import java.io.Serializable;

public class ItemPronto extends StatusDoItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2450786044556401557L;

	public ItemPronto(){
		this.valorStatus = EnumStatusItemPedido.PRONTO;
	}

}
