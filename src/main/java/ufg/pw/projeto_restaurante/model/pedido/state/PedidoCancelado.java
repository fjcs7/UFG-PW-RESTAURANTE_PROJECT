package ufg.pw.projeto_restaurante.model.pedido.state;

public class PedidoCancelado extends StatusPedido{
	public PedidoCancelado(){
		this.valorStatus = EnumStatusDePedido.CANCELADO;
	}

}
