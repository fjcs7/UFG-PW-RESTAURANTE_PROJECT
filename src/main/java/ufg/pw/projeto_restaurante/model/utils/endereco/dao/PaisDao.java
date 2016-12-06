package ufg.pw.projeto_restaurante.model.utils.endereco.dao;

import ufg.pw.projeto_restaurante.model.utils.endereco.Pais;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class PaisDao extends GenericDao<Pais, Integer>{
	public PaisDao() {
		super(Pais.class);
	}
}
