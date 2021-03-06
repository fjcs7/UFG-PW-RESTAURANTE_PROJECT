package ufg.pw.projeto_restaurante.model.funcionario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import ufg.pw.projeto_restaurante.model.utils.PessoaFisica;
import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;
import ufg.pw.projeto_restaurante.model.utils.telefone.Telefone;

@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Funcionario extends PessoaFisica	implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3111134482317536030L;

	@Column
	private String matricula;
	
	@Column
	private String senha;
	
	public Funcionario() {};
	
	public Funcionario(String nome, Telefone telefone, Endereco endereco, String cpf, String matricula, String senha) {
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
