package ufg.pw.projeto_restaurante.model.utils.endereco;

public class Estado {
	private Integer ID;
	private String nome;
	private Pais pais;
	
	public Estado(String nome) {
		this.nome = nome;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public Pais getPais() {
		return pais;
	}

	
	public String getNome() {
		return nome;
	}
}
