package ufg.pw.projeto_restaurante.model.pedido.state;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.codehaus.jackson.annotate.JsonIgnore;

@Embeddable
public class StatusPedido {
	@Column(name="status")
	@Enumerated(EnumType.ORDINAL)
	protected EnumStatusDePedido valorStatus;
	
	public StatusPedido(){}
	
	public int getValorStatus() {
		return valorStatus.valor();
	}
	
	@JsonIgnore
	public String getDescricaoStatus() {
		return valorStatus.nome();
	}
	public static PedidoAberto abrirPedido(){
		return new PedidoAberto();
	}
	
	public static PedidoCancelado CancelarPedido(){
		return new PedidoCancelado();
	}

	public static PedidoFinalizado FinalizarPedido(){
		return new PedidoFinalizado();
	}
	
	public void setValorStatus(EnumStatusDePedido valorStatus) {
		this.valorStatus = valorStatus;
	}
}
