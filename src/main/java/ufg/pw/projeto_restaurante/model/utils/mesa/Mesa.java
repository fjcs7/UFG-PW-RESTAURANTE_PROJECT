package ufg.pw.projeto_restaurante.model.utils.mesa;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.AttributeAccessor;

import ufg.pw.projeto_restaurante.model.utils.mesa.state.StatusDeMesa;

@Entity
@Table(name = "mesa")
public class Mesa {
	
	@Id
	private int id;
	
	@Column(name="status")
	@JoinColumn(name="id")
	private StatusDeMesa status;
	public Mesa(){
		this.status = StatusDeMesa.desocuparMesa(); 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status.getValorStatus();
	}
	
}
