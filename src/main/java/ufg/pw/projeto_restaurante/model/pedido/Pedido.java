package ufg.pw.projeto_restaurante.model.pedido;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedido;
import ufg.pw.projeto_restaurante.model.pedido.state.StatusPedido;

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
	
	public Pedido(Funcionario atendente, Cliente cliente){
		this.data = obtenhaDataCompleta();
		this.horaInicioAtendimento = obtenhaHoraCompleta();
		this.atendente = atendente;
		this.cliente = cliente;
		this.status = StatusPedido.abrirPedido();
		this.itens = new LinkedList<ItemPedido>();
	}
	
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
	public String getStatus() {
		return status.toString();
	}
	
	public boolean adicionarItem(ItemPedido item){
		return this.itens.add(item);
	}
	
	public boolean removerItem(ItemPedido item){
		return this.itens.remove(item);
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
		this.horaFimAtendimento = obtenhaHoraCompleta();
	}
	
	public boolean cancelarPedido(String motivo){
		try{
			this.motivoCancelamento = motivo;
			return true;
		}catch (Exception e) {
			return false;
		}	
	}
	
	private Long obtenhaDataCompleta(){
		GregorianCalendar gc = new GregorianCalendar();
		NumberFormat formatador = new DecimalFormat("00");
		NumberFormat formatadorAno = new DecimalFormat("0000");
		String dataAtual = formatador.format(gc.get(Calendar.DATE)) +
						   formatador.format(gc.get(Calendar.MONTH))+
						   formatadorAno.format(gc.get(Calendar.YEAR));
		return Long.parseLong(dataAtual);
	}
	
	private Long obtenhaHoraCompleta(){
		GregorianCalendar gc = new GregorianCalendar();
		NumberFormat formatador = new DecimalFormat("00");
		String horaCompleta = formatador.format(gc.get(Calendar.HOUR_OF_DAY)) +
							  formatador.format(gc.get(Calendar.MINUTE))+
							  formatador.format(gc.get(Calendar.SECOND));
		
		return Long.parseLong(horaCompleta);
		
	}

}
