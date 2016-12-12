package ufg.pw.projeto_restaurante.model.utils.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ws.rs.FormParam;

@Entity
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@FormParam("id")
	private Integer id;
	@Column
	@FormParam("nome")
	private String nome;
	
	public Pais(){}
	
	public Pais(String nome) {
		this.nome = nome;
	}
	
	public Integer getID() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
