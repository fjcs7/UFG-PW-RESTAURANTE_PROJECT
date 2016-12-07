package ufg.pw.projeto_restaurante.model.item_de_venda;

public enum TipoItemVenda {
	
	PRATO("Prato", 0), 
	BEBIDA("Bebida",1);
	
	private String nome;
	private int valor;
	
	TipoItemVenda(String nome, int valor){
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public int getValor() {
		return valor;
	}

}
