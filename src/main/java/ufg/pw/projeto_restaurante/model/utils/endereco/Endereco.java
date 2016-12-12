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
public class Endereco {
	
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	@FormParam("id")
	private Long id;
	@Column
	@FormParam("numero")
	private Long numero;
	@Column
	@FormParam("quadra")
	private Integer quadra;
	@Column
	@FormParam("lote")
	private Integer lote;
	@Column
	@FormParam("referencia")
	private String referencia;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_logradouro",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(value=CascadeType.PERSIST)
	@Form
	private Logradouro logradouro;
	
	public Endereco(){}
	
	public Endereco(long numero, Integer quadra, Integer lote, Logradouro logradouro) {
		this.numero     = numero;
		this.quadra     = quadra;
		this.lote       = lote;
		this.logradouro = logradouro;
	}
	
	public Long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Integer getQuadra() {
		return quadra;
	}

	public void setQuadra(Integer quadra) {
		this.quadra = quadra;
	}

	public Integer getLote() {
		return lote;
	}

	public void setLote(Integer lote) {
		this.lote = lote;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

}
