package ufg.pw.projeto_restaurante.model.utils.endereco.dao;

import ufg.pw.projeto_restaurante.model.utils.endereco.Cidade;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class CidadeDao extends GenericDao<Cidade, Integer> {
	public CidadeDao() {
		super(Cidade.class);
	}

}
