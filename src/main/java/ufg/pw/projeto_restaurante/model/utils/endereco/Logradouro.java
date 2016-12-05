package ufg.pw.projeto_restaurante.model.utils.endereco;

public class Logradouro {
	private Integer ID;
	private EnumTipoLogradouro tipo;
	private String complemento;
	private String referencia;
	private Integer numero;
	private Integer quadra;
	private Integer lote;
	private Bairro bairro;
	
	public Logradouro(EnumTipoLogradouro tipo, String complemento, String referencia, Integer numero, Integer quadra, Integer lote, Bairro bairro) {
		this.complemento = complemento;
		this.tipo        = tipo;
		this.referencia  = referencia;
		this.bairro      = bairro;
		this.numero      = numero;
		this.quadra      = quadra;
		this.lote        = lote;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public EnumTipoLogradouro getTipo() {
		return tipo;
	}
	public void setTipo(EnumTipoLogradouro tipo) {
		this.tipo = tipo;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
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
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
}
