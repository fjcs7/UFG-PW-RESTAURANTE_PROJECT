package ufg.pw.projeto_restaurante.model.funcionario.dao;

import ufg.pw.projeto_restaurante.model.funcionario.Funcionario;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class FuncionarioDao extends GenericDao<Funcionario, Integer> {
	public FuncionarioDao() {
	       super(Funcionario.class);
	 } 
}
