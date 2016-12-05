package ufg.pw.projeto_restaurante.model.utils.mesa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import ufg.pw.projeto_restaurante.model.utils.mesa.state.StatusDeMesa;

@Entity
@Table(name = "mesa")
public class Mesa {
	
	@Id
	private int id;
	
	@Column(name="status")
	private int status;
	
	@Transient
	private StatusDeMesa state;
	
	public Mesa(){
		this.setState(StatusDeMesa.desocuparMesa());
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public StatusDeMesa getState() {
		return state;
	}

	public void setState(StatusDeMesa state) {
		this.state = state;
		status = state.getValorStatus();
	}
	
}
