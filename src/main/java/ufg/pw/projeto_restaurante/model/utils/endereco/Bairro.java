package ufg.pw.projeto_restaurante.model.utils.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Bairro {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private String nome;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_cidade",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Cidade cidade;
	
	public Bairro(){}

	public Bairro(String nome, Cidade cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}
	
	public Long getID() {
		return id;
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	
	public String getNome() {
		return nome;
	}
}
