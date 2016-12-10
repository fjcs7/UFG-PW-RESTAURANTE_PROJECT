package ufg.pw.projeto_restaurante.model.utils.endereco;

import ufg.pw.projeto_restaurante.model.utils.endereco.dao.EstadoDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.PaisDao;

public class EnderecoNegocio {
	private PaisDao paisDao;
	private EstadoDao estadoDao;
	
	public Pais SalvarPais(String nomeDoPais){
		paisDao = new PaisDao();
		Pais p = paisDao.salvar(new Pais(nomeDoPais));
		return p;	
	}
	
	public Pais AtualizarPais(int id, String nomeDoPais){
		paisDao = new PaisDao();
		Pais p = paisDao.consultarPorId(id);
		p.setNome(nomeDoPais);
		p = paisDao.atualizar(p);
		return p;
	}
	
	public Estado SalvarEstado(String estado, int idPais){
		paisDao = new PaisDao();
		estadoDao = new EstadoDao();
		Estado e = new Estado(estado, paisDao.consultarPorId(idPais));
		e = estadoDao.salvar(e);
		return e;
	}
	
	public Estado SalvarEstado(String estado, String nomeDoPais){
		estadoDao = new EstadoDao();
		Estado e = new Estado(estado, this.SalvarPais(nomeDoPais));
		e = estadoDao.salvar(e);
		return e;
	}
	
	
}
