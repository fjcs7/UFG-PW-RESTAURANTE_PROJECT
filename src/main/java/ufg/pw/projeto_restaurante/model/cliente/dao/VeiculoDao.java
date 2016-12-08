package ufg.pw.projeto_restaurante.model.cliente.dao;

import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;
import ufg.pw.projeto_restaurante.model.cliente.Veiculo;

public class VeiculoDao extends GenericDao<Veiculo, Long>{
	 public VeiculoDao() {
	       super(Veiculo.class);
	 }   
}