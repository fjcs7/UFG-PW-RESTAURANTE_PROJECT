package ufg.pw.projeto_restaurante.model.pedido.item_pedido;

import ufg.pw.projeto_restaurante.model.item_de_venda.ItemVenda;

public class ItemPedido {
	private Integer id;
	private Integer idPedido;
	private Integer quantidade;
	private Double valorTotal;
	private ItemVenda produto;
	private String motivoDevolucao;
	private StatusDoItem status;
	
	public ItemPedido(Integer idPedido, Integer quantidade, ItemVenda produto){
		this.quantidade = quantidade;
		this.idPedido = idPedido;
		this.produto = produto;
		this.calculaValorTotal();
	}
	
	private void calculaValorTotal(){
		this.valorTotal = this.quantidade * this.produto.getPreco();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public ItemVenda getProduto() {
		return produto;
	}
	public void setProduto(ItemVenda produto) {
		this.produto = produto;
	}
	public String getMotivoDevolucao() {
		return motivoDevolucao;
	}
	public void setMotivoDevolucao(String motivoDevolucao) {
		this.motivoDevolucao = motivoDevolucao;
	}
	public StatusDoItem getStatus() {
		return status;
	}
	public void setStatus(StatusDoItem status) {
		this.status = status;
	}
	
}
