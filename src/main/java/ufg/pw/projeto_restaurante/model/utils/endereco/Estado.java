package ufg.pw.projeto_restaurante.model.utils.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column
	private String nome;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_pais",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(value=CascadeType.MERGE)
	private Pais pais;
	
	public Estado(){}
	
	public Estado(String nome, Pais pais) {
		this();
		this.nome = nome;
		this.pais = pais;
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
