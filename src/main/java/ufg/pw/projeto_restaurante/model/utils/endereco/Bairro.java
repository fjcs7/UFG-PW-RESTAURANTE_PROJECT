package ufg.pw.projeto_restaurante.model.utils.endereco;

public class Bairro {
	private Integer ID;
	private String nome;
	private Cidade cidade;
	
	public Bairro(String nome) {
		this.nome = nome;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	
	public String getNome() {
		return nome;
	}
}
