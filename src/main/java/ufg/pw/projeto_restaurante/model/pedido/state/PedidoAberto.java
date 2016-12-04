package ufg.pw.projeto_restaurante.model.pedido.state;

public class PedidoAberto extends StatusPedido{
	public PedidoAberto(){
		this.valorStatus = EnumStatusDePedido.ABERTO;
	}

}
