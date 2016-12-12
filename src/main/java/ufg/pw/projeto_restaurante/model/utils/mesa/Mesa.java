package ufg.pw.projeto_restaurante.model.utils.mesa;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.annotations.Form;

import ufg.pw.projeto_restaurante.model.utils.mesa.state.StatusDeMesa;

@Entity
@Table(name = "mesa")
public class Mesa {
	
	@Id
	@FormParam("id")
	private int id;
	
	@Embedded
	@Form
	private StatusDeMesa status;
	
	public Mesa(){this.status = StatusDeMesa.desocuparMesa();}
	public Mesa(int id){
		this();
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return this.status.getValorStatus();
	}
}
