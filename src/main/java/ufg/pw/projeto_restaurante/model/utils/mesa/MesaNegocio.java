package ufg.pw.projeto_restaurante.model.utils.mesa;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ufg.pw.projeto_restaurante.model.utils.mesa.dao.MesaDao;
import ufg.pw.projeto_restaurante.model.utils.mesa.state.EnumStatusDaMesa;

@Path("/mesas")
public class MesaNegocio {
	private static MesaNegocio instancia;
	private MesaDao mesaDao;
	
	private MesaNegocio(){}
	
	public static MesaNegocio getInstancia(){
		if (instancia == null){
			instancia = new MesaNegocio();
		}
		return instancia;
	}
	
	public Mesa ConsultarMesa(int idMesa){
		mesaDao = new MesaDao();
		return mesaDao.consultarPorId(idMesa);
	}
	
	@GET
	@Path("/disponiveis")
	@Produces("application/json")
	public List<Mesa> mesasDisponiveis(){
		mesaDao = new MesaDao();
		return mesaDao.obterListaPorStatus(EnumStatusDaMesa.LIVRE);
	}
}
