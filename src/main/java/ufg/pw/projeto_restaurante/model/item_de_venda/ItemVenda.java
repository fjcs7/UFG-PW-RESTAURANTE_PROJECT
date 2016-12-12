package ufg.pw.projeto_restaurante.model.item_de_venda;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;

import org.jboss.resteasy.annotations.Form;

@Entity
@Table(name = "itemvenda")
public class ItemVenda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@FormParam("id")
	private Integer id;	
	
	@Column
	@FormParam("preco")
	private Double preco;
	
	@Column
	@FormParam("nome")
	private String nome;
	
	@Column
	@FormParam("descricao")
	private String descricao;
	
	@Enumerated(EnumType.ORDINAL)
	@FormParam("tipo")
	private TipoItemVenda tipo;
	
	public ItemVenda(String nome, String descricao, Double preco, TipoItemVenda tipo) {
			
			this.nome      = nome;
			this.descricao = descricao;
			this.preco     = preco;
			this.tipo      = tipo;
	}
	
	public ItemVenda() {};
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
