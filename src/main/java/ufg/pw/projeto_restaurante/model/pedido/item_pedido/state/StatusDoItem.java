package ufg.pw.projeto_restaurante.model.pedido.item_pedido.state;

import ufg.pw.projeto_restaurante.model.item_de_venda.TipoItemVenda;

public abstract class StatusDoItem {
	protected EnumStatusItemPedido valorStatus;

	public int valorStatus() {
		return valorStatus.valor();
	}
	
	public String descricaoStatus() {
		return valorStatus.nome();
	}
	
	public static StatusDoItem obterStatusDoItem(int valorStatus){
		EnumStatusItemPedido status = EnumStatusItemPedido.obtenhaEnum(valorStatus);
		switch(status){
			case SOLICITADO:
				return solicitarItem();
			case DEVOLVIDO:
				return devolverItem();
			case ENTREGUE:
				return entregarItem();
			case PRONTO:
				return liberarItem();
			default:
				return solicitarItem();
		}

	}
	
	public static StatusDoItem solicitarItem(){
		return new ItemSolicitado();
	}
	
	public static StatusDoItem liberarItem(){
		return new ItemPronto();
	}
	
	public static StatusDoItem entregarItem(){
		return new ItemEntregue();
	}
	
	public static StatusDoItem devolverItem(){
		return new ItemDevolvido();
	}
	

}
