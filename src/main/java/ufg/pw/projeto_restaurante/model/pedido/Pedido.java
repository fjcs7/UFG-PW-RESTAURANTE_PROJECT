package ufg.pw.projeto_restaurante.model.pedido;

import java.util.GregorianCalendar;
import java.util.List;
import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedido;
import ufg.pw.projeto_restaurante.model.pedido.status.StatusPedido;

public abstract class Pedido {
	protected Long data;
	protected Long horaInicioAtendimento;
	protected Long horaFimAtendimento;
	protected Cliente cliente;
	protected Funcionario atendente;
	protected List<ItemPedido> itens;
	protected Double totalPedido;
	protected String motivoCancelamento;
	protected StatusPedido status;
	
	public Long getHoraFimAtendimento() {
		return horaFimAtendimento;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getAtendente() {
		return atendente;
	}
	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}
	public String getMotivoCancelamento() {
		return motivoCancelamento;
	}
	public void setMotivoCancelamento(String motivoCancelamento) {
		this.motivoCancelamento = motivoCancelamento;
	}
	public Long getData() {
		return data;
	}
	public Long getHoraInicioAtendimento() {
		return horaInicioAtendimento;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public Double getTotalPedido() {
		return totalPedido;
	}
	public StatusPedido getStatus() {
		return status;
	}
	
	public Long tempoDePermanencia(){
		Long horaRetorno;
		if (horaFimAtendimento > horaInicioAtendimento){
			horaRetorno = horaFimAtendimento - horaInicioAtendimento;
		} else {
			horaRetorno = horaInicioAtendimento - horaFimAtendimento;
		}
		return horaRetorno;
	}
	
	public void finalizarAtendimento(){
		GregorianCalendar gc = new GregorianCalendar();
		this.horaFimAtendimento = gc.getTimeInMillis();
	}
	
}
