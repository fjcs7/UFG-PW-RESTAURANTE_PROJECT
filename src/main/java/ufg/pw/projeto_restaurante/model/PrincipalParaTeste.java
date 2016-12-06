package ufg.pw.projeto_restaurante.model;

import ufg.pw.projeto_restaurante.model.utils.endereco.Estado;
import ufg.pw.projeto_restaurante.model.utils.endereco.Pais;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.EstadoDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.PaisDao;

public class PrincipalParaTeste {

	public static void main(String[] args) {
		Pais pais = new Pais("Brasil");
		Estado goias = new Estado("Goiás",pais);
		PaisDao pdao = new PaisDao();
		EstadoDao edao = new EstadoDao();
		pdao.salvar(pais);
		edao.salvar(goias);
		System.out.println(edao.consultarPorId(goias.getID()));
	}

}
