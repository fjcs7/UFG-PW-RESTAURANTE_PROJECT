package ufg.pw.projeto_restaurante.model.utils.mesa.state;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class StatusDeMesa {
	@Id
	protected int valorStatus;
	public static StatusDeMesa utilizarMesa(){
		return new MesaOcupada();
	}
	
	public static StatusDeMesa desocuparMesa(){
		return new MesaLivre();
	}
	public int getValorStatus(){
		return this.valorStatus;
	}
}
