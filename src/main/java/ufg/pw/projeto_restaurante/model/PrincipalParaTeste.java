package ufg.pw.projeto_restaurante.model;

import ufg.pw.projeto_restaurante.model.utils.mesa.Mesa;
import ufg.pw.projeto_restaurante.model.utils.mesa.dao.MesaDao;

public class PrincipalParaTeste {

	public static void main(String[] args) {
		Mesa mesa = new Mesa();
		mesa.setId(10);
		MesaDao persistMesa = new MesaDao();
		persistMesa.salvar(mesa);
	}

}
