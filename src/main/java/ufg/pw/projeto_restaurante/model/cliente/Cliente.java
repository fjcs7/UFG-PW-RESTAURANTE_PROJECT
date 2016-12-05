package ufg.pw.projeto_restaurante.model.cliente;

import ufg.pw.projeto_restaurante.model.utils.PessoaFisica;
import ufg.pw.projeto_restaurante.model.utils.telefone.Telefone;
import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;

public class Cliente extends PessoaFisica {

	private Boolean possuiVeiculo;
	private Veiculo veiculo;

	public Cliente(String nome, Telefone telefone, Endereco endereco, Long cpf) {
		super(nome, telefone, endereco, cpf);
		this.possuiVeiculo = false;
	}

	public Cliente(String nome, Telefone telefone, Endereco endereco, Long cpf, String matricula, String senha,
			Veiculo veiculo) {
		super(nome, telefone, endereco, cpf);
		this.veiculo = veiculo;
		this.possuiVeiculo = true;
	}

	public Boolean getPossuiVeiculo() {
		return possuiVeiculo;
	}

	public void setPossuiVeiculo(Boolean possuiVeiculo) {
		this.possuiVeiculo = possuiVeiculo;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
