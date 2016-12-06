package ufg.pw.projeto_restaurante.model.utils.mesa.state;

public enum EnumStatusDaMesa {

		LIVRE("Livre", 0),
		OCUPADA("Ocupada",1),
		RESERVADA("Reservada",2);
		
		EnumStatusDaMesa(String nome, int valor){
			this.nome = nome;
			this.valor = valor;
		}
		private String nome;
		private int valor;
		
		public String nome() {
			return nome;
		}
		public int valor() {
			return valor;
		}
}
