package ufg.pw.projeto_restaurante.model.utils.endereco.dao;

import ufg.pw.projeto_restaurante.model.utils.endereco.Logradouro;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class LogradouroDao extends GenericDao<Logradouro, Integer> {
	public LogradouroDao() {
		super(Logradouro.class);
	}
}
