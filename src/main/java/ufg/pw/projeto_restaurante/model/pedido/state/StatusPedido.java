package ufg.pw.projeto_restaurante.model.pedido.state;

public abstract class StatusPedido {
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
