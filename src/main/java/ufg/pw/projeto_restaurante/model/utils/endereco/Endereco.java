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
public class Endereco {
	
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long id;
	@Column
	private Long numero;
	@Column
	private Integer quadra;
	@Column
	private Integer lote;
	@Column
	private String referencia;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_logradouro",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
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

}
