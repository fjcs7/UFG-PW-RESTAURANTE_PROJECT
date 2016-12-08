package ufg.pw.projeto_restaurante.model.pedido.state;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class StatusPedido {
	@Column(name="status")
	@Enumerated(EnumType.ORDINAL)
	protected EnumStatusDePedido valorStatus;
	
	public int getValorStatus() {
		return valorStatus.valor();
	}
	public String getDescricaoStatus() {
		return valorStatus.nome();
	}
	public static PedidoAberto abrirPedido(){
		return new PedidoAberto();
	}
}
