package ufg.pw.projeto_restaurante.model.utils.mesa.dao;

import ufg.pw.projeto_restaurante.model.utils.mesa.Mesa;
import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;

public class MesaDao extends GenericDao<Mesa, Integer> {
    public MesaDao() {
       super(Mesa.class);
    }   
}
