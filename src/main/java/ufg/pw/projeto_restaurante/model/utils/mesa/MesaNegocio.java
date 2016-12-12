package ufg.pw.projeto_restaurante.model.utils.mesa;

import ufg.pw.projeto_restaurante.model.utils.mesa.dao.MesaDao;

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
}
