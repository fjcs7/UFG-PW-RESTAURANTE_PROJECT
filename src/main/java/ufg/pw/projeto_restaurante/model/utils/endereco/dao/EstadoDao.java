package ufg.pw.projeto_restaurante.model.utils.endereco.dao;

import ufg.pw.projeto_restaurante.model.utils.endereco.Estado;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class EstadoDao extends GenericDao<Estado, Integer> {
	public EstadoDao() {
		super(Estado.class);
	}

}
