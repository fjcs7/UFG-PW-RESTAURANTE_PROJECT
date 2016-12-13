package ufg.pw.projeto_restaurante.model.pedido.state;

public class PedidoFinalizado extends StatusPedido{
	public PedidoFinalizado(){
		this.valorStatus = EnumStatusDePedido.FINALIZADO;
	}

}
