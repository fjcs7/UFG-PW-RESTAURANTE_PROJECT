package ufg.pw.projeto_restaurante.model.cliente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Veiculo implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2513054072294627875L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String placa;
	
	@Column
	private String cor;
	
	@Column
	private String modelo;
	
	public Veiculo() {};
	
	public Veiculo(String placa, String cor, String modelo) {
		this.placa  = placa;
		this.cor    = cor;
		this.modelo = modelo;		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}	
	
}
