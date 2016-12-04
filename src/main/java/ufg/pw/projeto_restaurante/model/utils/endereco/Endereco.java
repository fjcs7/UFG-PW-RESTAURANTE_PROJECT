package ufg.pw.projeto_restaurante.model.utils.endereco;

public class Endereco {
	
	private Long numero;	
	private Integer quadra;
	private Integer lote;
	private Logradouro logradouro;
	
	public Endereco(Long numero, Integer quadra, Integer lote, Logradouro logradouro) {
		this.numero     = numero;
		this.quadra     = quadra;
		this.lote       = lote;
		this.logradouro = logradouro;
	}
	
	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Integer getQuadra() {
		return quadra;
	}

	public void setQuadra(Integer quadra) {
		this.quadra = quadra;
	}

	public Integer getLote() {
		return lote;
	}

	public void setLote(Integer lote) {
		this.lote = lote;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

}
