package ufg.pw.projeto_restaurante.model.utils.mesa;

import ufg.pw.projeto_restaurante.model.utils.mesa.state.StatusDeMesa;

public class Mesa {
	private int numero;
	private StatusDeMesa status;
	public Mesa(){
		this.status = StatusDeMesa.desocuparMesa(); 
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getStatus() {
		return status.toString();
	}
	
}
