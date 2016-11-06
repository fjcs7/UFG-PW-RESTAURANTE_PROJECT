package ufg.pw.projeto_restaurante.model;

public class ItemVenda {
	
	private Double preco;
	private String nome;
	private String descricao;
	private TipoItemVenda tipo;
	
	public ItemVenda(String nome, String descricao, Double preco, TipoItemVenda tipo) {
		
		this.nome      = nome;
		this.descricao = descricao;
		this.preco     = preco;
		this.tipo      = tipo;
		
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoItemVenda getTipo() {
		return tipo;
	}
	public void setTipo(TipoItemVenda tipo) {
		this.tipo = tipo;
	}	
	
}
