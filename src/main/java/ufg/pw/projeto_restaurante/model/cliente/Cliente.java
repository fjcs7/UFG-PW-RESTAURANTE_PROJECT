package ufg.pw.projeto_restaurante.model.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import ufg.pw.projeto_restaurante.model.utils.PessoaFisica;
import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;
import ufg.pw.projeto_restaurante.model.utils.telefone.Telefone;

@Entity
@Table(name = "cliente")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cliente extends PessoaFisica {
	
	@Column
	private Boolean possuiVeiculo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_veiculo",
				insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Veiculo veiculo;
	
	public Cliente() {};

	public Cliente(String nome, Telefone telefone, Endereco endereco, String cpf) {
		super(nome, telefone, endereco, cpf);
		this.possuiVeiculo = false;
	}

	public Cliente(String nome, Telefone telefone, Endereco endereco, String cpf, Veiculo veiculo) {
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
		this.possuiVeiculo = true;
		this.veiculo = veiculo;
	}

}
