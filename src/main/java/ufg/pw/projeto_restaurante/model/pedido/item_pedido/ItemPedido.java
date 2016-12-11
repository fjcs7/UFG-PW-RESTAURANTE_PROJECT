package ufg.pw.projeto_restaurante.model.pedido.item_pedido;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;	
import org.hibernate.annotations.FetchMode;
import ufg.pw.projeto_restaurante.model.item_de_venda.ItemVenda;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.state.StatusDoItem;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private Integer quantidade;

	@Column
	private Double valorTotal;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_itemvenda", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	private ItemVenda produto;

	@Column
	private String motivoDevolucao;

	@Embedded
	private StatusDoItem status;

	public ItemPedido() {
		this.status = StatusDoItem.solicitarItem();
	};

	public ItemPedido(Integer quantidade, ItemVenda produto) {
		this();
		this.quantidade = quantidade;
		this.produto = produto;
		this.calculaValorTotal();
	}

	public ItemPedido(Integer quantidade, ItemVenda produto, Integer valorStatus) {
		this();
		this.quantidade = quantidade;
		this.produto = produto;
		this.status = StatusDoItem.obterStatusDoItem(valorStatus);
		this.calculaValorTotal();
	}
	
	public ItemPedido(Integer idPedido, Integer quantidade) {
		this.quantidade = quantidade;
		this.calculaValorTotal();
	}

	private void calculaValorTotal() {
		this.valorTotal = this.quantidade * this.produto.getPreco();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
