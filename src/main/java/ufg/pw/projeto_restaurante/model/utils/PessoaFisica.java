package ufg.pw.projeto_restaurante.model.utils;

import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;
import ufg.pw.projeto_restaurante.model.utils.telefone.Telefone;

public class PessoaFisica {
	
	private String nome;
	private Telefone telefone;
	private Endereco endereco;
	private Long cpf;
	private Long id;

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
