package ufg.pw.projeto_restaurante.model.utils.endereco;

public class Cidade {
	
	private Integer ID;
	private String nome;
	private Estado estado;
	
	public Cidade(String nome) {
		this.nome = nome;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public Estado getEstado() {
		return estado;
	}

	
	public String getNome() {
		return nome;
	}

}
