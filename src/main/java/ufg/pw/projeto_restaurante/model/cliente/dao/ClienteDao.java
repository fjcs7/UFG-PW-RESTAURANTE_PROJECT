package ufg.pw.projeto_restaurante.model.cliente.dao;

import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;
import ufg.pw.projeto_restaurante.model.cliente.Cliente;

public class ClienteDao extends GenericDao<Cliente, Integer>{
	 public ClienteDao() {
	       super(Cliente.class);
	 }   
}