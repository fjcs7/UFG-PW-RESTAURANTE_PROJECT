package ufg.pw.projeto_restaurante.model.utils.endereco;

public enum EnumTipoLogradouro {
	AVENIDA("Avenida", 0),
	RUA("Rua",1),
	RODOVIA("Rodovia",2),
	PRACA("Praca",3);
	
	private String nome;
	private int valor;
	
	EnumTipoLogradouro(String nome, int valor){
		this.nome = nome;
		this.valor = valor;
	}

	public String nome() {
		return nome;
	}
	public int valor() {
		return valor;
	}

}
