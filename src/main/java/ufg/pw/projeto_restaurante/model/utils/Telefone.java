package ufg.pw.projeto_restaurante.model.utils;

public class Telefone {
	
	private Long id;
	private Integer ddd;
	private Long numero;
	private String tipo;
	
	public Telefone(Integer ddd, Long numero, String tipo) {
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
