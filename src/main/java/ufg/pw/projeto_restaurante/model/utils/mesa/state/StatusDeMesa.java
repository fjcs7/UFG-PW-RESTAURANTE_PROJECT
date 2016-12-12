package ufg.pw.projeto_restaurante.model.utils.mesa.state;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;

@Embeddable
public class StatusDeMesa {
	
	@Column(name="status")
	@Enumerated(EnumType.ORDINAL)
	@FormParam("valorStatus")
	protected EnumStatusDaMesa valorStatus;
	
	@SuppressWarnings("static-access")
	public StatusDeMesa(){}
	
	public static StatusDeMesa utilizarMesa(){
		return new MesaOcupada();
	}
	
	public static StatusDeMesa desocuparMesa(){
		return new MesaLivre();
	}
	public int getValorStatus(){
		return this.valorStatus.valor();
	}
}
