package ufg.pw.projeto_restaurante.model.pedido.item_pedido.state;

import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

public enum EnumStatusItemPedido {
	SOLICITADO("Solicitado", 0),
	PRONTO("Pronto",1),
	ENTREGUE("Entregue",2),
	DEVOLVIDO("Devolvido",3);
	
	EnumStatusItemPedido(String nome, int valor){
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
	
	public static EnumStatusItemPedido obtenhaEnum(int valor){
		switch (valor){
			case 0:
				return SOLICITADO;
			case 1:
				return PRONTO;
			case 2:
				return ENTREGUE;
			case 3:
				return DEVOLVIDO;
			default:
				return SOLICITADO;
		}
	}
}
