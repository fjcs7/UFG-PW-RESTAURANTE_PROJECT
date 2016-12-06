package ufg.pw.projeto_restaurante.model.pedido.item_pedido.state;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public abstract class StatusDoItem {
	@Column(name="status")
	@Enumerated(EnumType.ORDINAL)
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
