package ufg.pw.projeto_restaurante.model.funcionario;

import ufg.pw.projeto_restaurante.model.funcionario.dao.FuncionarioDao;

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

}
