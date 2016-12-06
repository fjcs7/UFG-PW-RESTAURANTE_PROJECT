package ufg.pw.projeto_restaurante.model.funcionario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ufg.pw.projeto_restaurante.model.utils.PessoaFisica;
import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;
import ufg.pw.projeto_restaurante.model.utils.telefone.Telefone;

@Entity
@Table(name = "funcionario")
public class Funcionario extends PessoaFisica	{
	
	@Column
	private String matricula;
	
	@Column
	private String senha;
	
	public Funcionario() {};
	
	public Funcionario(String nome, Telefone telefone, Endereco endereco, Long cpf, String matricula, String senha) {
		super(nome, telefone, endereco, cpf);
		this.matricula = matricula;
		this.senha     = senha;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
