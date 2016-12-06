package ufg.pw.projeto_restaurante.model.utils;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;
import ufg.pw.projeto_restaurante.model.utils.telefone.Telefone;


@MappedSuperclass
public abstract class PessoaFisica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column
	private String nome;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_telefone",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Telefone telefone;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_endereco",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Endereco endereco;
	
	@Column
	private Long cpf;
	
	
	public PessoaFisica() {};
	public PessoaFisica(String nome, Telefone telefone, Endereco endereco, Long cpf) {
		this.nome     = nome;
		this.telefone =  telefone;
		this.endereco = endereco;
		this.cpf      = cpf;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}		

}
