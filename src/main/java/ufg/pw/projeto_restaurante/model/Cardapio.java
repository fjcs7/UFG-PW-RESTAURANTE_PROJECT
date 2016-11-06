package ufg.pw.projeto_restaurante.model;

public class Cardapio {
	
	private DiaSemana dia;
	private ItemVenda item;
	
	public DiaSemana getDia() {
		return dia;
	}
	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}
	public ItemVenda getItem() {
		return item;
	}
	public void setItem(ItemVenda item) {
		this.item = item;
	}	
	
}
