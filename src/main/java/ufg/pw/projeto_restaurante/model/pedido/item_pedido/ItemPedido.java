package ufg.pw.projeto_restaurante.model.pedido.item_pedido;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.Fetch;	
import org.hibernate.annotations.FetchMode;
import org.jboss.resteasy.annotations.Form;

import ufg.pw.projeto_restaurante.model.item_de_venda.ItemVenda;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.state.StatusDoItem;

@Entity
@JsonSerialize
public class ItemPedido  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1310920981967100687L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@FormParam("id")
	private Integer id;

	@Column
	@FormParam("quantidade")
	private Integer quantidade;

	@Column
	@FormParam("valorTotal")
	private Double valorTotal;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_itemvenda", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	@Form(prefix="produto")
	private ItemVenda produto;

	@Column
	@FormParam("motivoDevolucao")
	private String motivoDevolucao;

	@Embedded
	@Form(prefix="status")
	private StatusDoItem status = StatusDoItem.solicitarItem();

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
