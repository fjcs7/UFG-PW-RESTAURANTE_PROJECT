package ufg.pw.projeto_restaurante.model.cliente;

public class Veiculo {
	private Long id;
	private String placa;
	private String cor;
	private String modelo;
	
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
