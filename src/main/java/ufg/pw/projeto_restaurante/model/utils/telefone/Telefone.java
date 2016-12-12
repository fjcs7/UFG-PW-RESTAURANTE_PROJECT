package ufg.pw.projeto_restaurante.model.utils.telefone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ws.rs.FormParam;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@FormParam("id")
	private Long id;
	
	@Column
	@FormParam("ddd")
	private Integer ddd;
	
	@Column
	@FormParam("numero")
	private Long numero;
	
	@Column
	@FormParam("tipo")
	private String tipo;
	
	public Telefone() {};
	
	public Telefone(int ddd, long numero, String tipo) {
		this.ddd    = ddd;
		this.numero = numero;
		this.tipo   = tipo;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
