package ufg.pw.projeto_restaurante.model.funcionario;

import java.util.LinkedList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ufg.pw.projeto_restaurante.model.funcionario.dao.FuncionarioDao;

@Path("/funcionario")
public class FuncionarioNegocio {
	private FuncionarioDao funcDao;
	private static FuncionarioNegocio instancia;
	
	private FuncionarioNegocio(){}
	
	public static FuncionarioNegocio getInstancia(){
		if (instancia == null){
			instancia = new FuncionarioNegocio();
		}
		return instancia;
	}
	
	public Funcionario ConsutarFuncionario(int idFuncionario){
		funcDao = new FuncionarioDao();
		return funcDao.consultarPorId(idFuncionario);
	}
	
	@GET
	@Path("/funcionario")
	@Produces("application/json")
	public Funcionario obtenhaUmFuncionario(){
		funcDao = new FuncionarioDao();
		LinkedList<Funcionario> funcs = (LinkedList<Funcionario>) funcDao.obterLista();
		return funcs.getFirst();
	}

}
