package ufg.pw.projeto_restaurante.model.utils.telefone.dao;

import ufg.pw.projeto_restaurante.model.utils.persistencia.GenericDao;
import ufg.pw.projeto_restaurante.model.utils.telefone.Telefone;

public class TelefoneDao extends GenericDao<Telefone, Long> {
    public TelefoneDao() {
       super(Telefone.class);
    }   
}
