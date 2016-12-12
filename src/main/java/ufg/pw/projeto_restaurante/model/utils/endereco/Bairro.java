package ufg.pw.projeto_restaurante.model.utils.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.ws.rs.FormParam;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.jboss.resteasy.annotations.Form;

@Entity
public class Bairro {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@FormParam("id")
	private Long id;
	@Column
	@FormParam("nome")
	private String nome;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_cidade",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(value=CascadeType.PERSIST)
	@Form
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
