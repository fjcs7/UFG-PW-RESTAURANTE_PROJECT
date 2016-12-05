package ufg.pw.projeto_restaurante.model.utils.mesa.state;


public abstract class StatusDeMesa {

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
