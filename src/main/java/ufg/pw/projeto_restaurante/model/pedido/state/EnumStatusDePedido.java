package ufg.pw.projeto_restaurante.model.pedido.state;

public enum EnumStatusDePedido {
	ABERTO("Aberto", 0),
	PRONTO("Pronto",1),
	ENTREGUE("Entregue",2),
	PAGO("Pago",3),
	CANCELADO("Cancelado",4),
	FINALIZADO("Finalizado",5);
	
	EnumStatusDePedido(String nome, int valor){
		this.nome = nome;
		this.valor = valor;
	}
	private String nome;
	private int valor;
	
	public String nome() {
		return nome;
	}
	public int valor() {
		return valor;
	}
}
