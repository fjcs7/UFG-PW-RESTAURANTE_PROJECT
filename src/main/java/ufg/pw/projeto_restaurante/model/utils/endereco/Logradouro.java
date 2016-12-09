package ufg.pw.projeto_restaurante.model.utils.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Logradouro {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Enumerated(EnumType.ORDINAL)
	private EnumTipoLogradouro tipo;
	
	@Column
	private String complemento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_bairro",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(value=CascadeType.PERSIST)
	private Bairro bairro;
	
	public Logradouro(){}
	
	public Logradouro(EnumTipoLogradouro tipo, String complemento, Bairro bairro) {
		this.complemento = complemento;
		this.tipo        = tipo;
		this.bairro      = bairro;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setID(long id) {
		this.id = id;
	}
	public EnumTipoLogradouro getTipo() {
		return tipo;
	}
	public void setTipo(EnumTipoLogradouro tipo) {
		this.tipo = tipo;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
}
