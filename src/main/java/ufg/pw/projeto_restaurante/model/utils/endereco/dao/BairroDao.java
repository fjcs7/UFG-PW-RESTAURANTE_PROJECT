package ufg.pw.projeto_restaurante.model.utils.endereco.dao;

import ufg.pw.projeto_restaurante.model.utils.endereco.Bairro;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class BairroDao extends GenericDao<Bairro, Integer> {
	public BairroDao() {
		super(Bairro.class);
	}
}
