package ufg.pw.projeto_restaurante.model.pedido.item_pedido.state;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Embeddable
@JsonSerialize
public abstract class StatusDoItem  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 765337200708503075L;
	
	@Column(name="status")
	@Enumerated(EnumType.ORDINAL)
	protected EnumStatusItemPedido valorStatus = EnumStatusItemPedido.SOLICITADO;

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
