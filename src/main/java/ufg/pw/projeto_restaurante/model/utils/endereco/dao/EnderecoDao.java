package ufg.pw.projeto_restaurante.model.utils.endereco.dao;

import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class EnderecoDao extends GenericDao<Endereco, Long> {
	public EnderecoDao() {
		super(Endereco.class);
	}

}
