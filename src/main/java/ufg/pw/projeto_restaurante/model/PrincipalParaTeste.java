package ufg.pw.projeto_restaurante.model;

import ufg.pw.projeto_restaurante.model.utils.endereco.Estado;
import ufg.pw.projeto_restaurante.model.utils.endereco.Pais;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.EstadoDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.PaisDao;

public class PrincipalParaTeste {

	public static void main(String[] args) {
		PaisDao pdao = new PaisDao();
		EstadoDao edao = new EstadoDao();
		Pais pais = pdao.consultarPorId(340);
		Estado goias = edao.consultarPorId(350);
		
		
		System.out.println(goias.getPais().getNome());
	}

}
