package ufg.pw.projeto_restaurante.model.utils.mesa.state;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public abstract class StatusDeMesa {
	
	@Column(name="status")
	@Enumerated(EnumType.ORDINAL)
	protected EnumStatusDaMesa valorStatus;
	
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
