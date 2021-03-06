package ufg.pw.projeto_restaurante.model.pedido;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.jboss.resteasy.annotations.Form;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedido;
import ufg.pw.projeto_restaurante.model.pedido.state.StatusPedido;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Pedido implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2198220753333852106L;

	@TableGenerator(name = "pedidos_gen", 
					table = "id_gen", 
					pkColumnName = "gen_name", 
					valueColumnName = "gen_val", 
					allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "pedidos_gen")
	@FormParam("id")
	protected Long id;
	
	@Column
	@FormParam("data")
	protected Long data;
	
	@Column
	@FormParam("horaInicioAtendimento")
	protected Long horaInicioAtendimento;
	
	@Column
	@FormParam("horaFimAtendimento")
	protected Long horaFimAtendimento;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_cliente",
				insertable=true, updatable=true
				)
	@Fetch(FetchMode.SELECT)
	@Cascade(value=CascadeType.PERSIST)
	@Form(prefix = "cliente")
	protected Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_funcionario",
				insertable=true, updatable=true)
	@Fetch(FetchMode.SELECT)
	@Cascade(value=CascadeType.PERSIST)
	@Form(prefix = "atendente")
	protected Funcionario atendente;
	
	@OneToMany
	@Id
	@JoinColumn(name="id_pedido", referencedColumnName="id")
	@Form(prefix = "itens")
	@Cascade(value=CascadeType.PERSIST)
	protected List<ItemPedido> itens;
	
	@Column
	@FormParam("totalPedido")
	protected Double totalPedido;
	
	@Column
	@FormParam("motivoCancelamento")
	protected String motivoCancelamento;	
	
	@Embedded
	@Form(prefix = "status")
	protected StatusPedido status;
	
	public Pedido() {
	    this.status = StatusPedido.abrirPedido();
	    this.data = obtenhaDataCompleta();
	    this.horaInicioAtendimento = obtenhaHoraCompleta();
	}
	
	public Pedido(Funcionario atendente, Cliente cliente){
		this();
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
	public Long getId() {
		return id;
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
	
	public boolean adicionarItem(ItemPedido item){
		return this.itens.add(item);
	}
	
	public void adicionarItems(List<ItemPedido> itens){
		for (ItemPedido itemPedido : itens) {
			this.itens.add(itemPedido);
		}
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setData(Long data) {
		this.data = data;
	}

	public void setHoraInicioAtendimento(Long horaInicioAtendimento) {
		this.horaInicioAtendimento = horaInicioAtendimento;
	}

	public void setHoraFimAtendimento(Long horaFimAtendimento) {
		this.horaFimAtendimento = horaFimAtendimento;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public void setTotalPedido(Double totalPedido) {
		this.totalPedido = totalPedido;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public StatusPedido getStatus() {
		return status;
	}

}
