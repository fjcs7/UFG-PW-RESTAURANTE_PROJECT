package ufg.pw.projeto_restaurante.model.funcionario;

import ufg.pw.projeto_restaurante.model.utils.PessoaFisica;
import ufg.pw.projeto_restaurante.model.utils.Telefone;
import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;

public class Funcionario extends PessoaFisica	{
	
	private String matricula;
	private String senha;
	
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
