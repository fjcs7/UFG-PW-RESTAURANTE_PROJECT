package ufg.pw.projeto_restaurante.model;

import ufg.pw.projeto_restaurante.model.cliente.Cliente;
import ufg.pw.projeto_restaurante.model.cliente.Veiculo;
import ufg.pw.projeto_restaurante.model.cliente.dao.ClienteDao;
import ufg.pw.projeto_restaurante.model.cliente.dao.VeiculoDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.Bairro;
import ufg.pw.projeto_restaurante.model.utils.endereco.Cidade;
import ufg.pw.projeto_restaurante.model.utils.endereco.Endereco;
import ufg.pw.projeto_restaurante.model.utils.endereco.EnumTipoLogradouro;
import ufg.pw.projeto_restaurante.model.utils.endereco.Estado;
import ufg.pw.projeto_restaurante.model.utils.endereco.Logradouro;
import ufg.pw.projeto_restaurante.model.utils.endereco.Pais;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.BairroDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.CidadeDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.EnderecoDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.EstadoDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.LogradouroDao;
import ufg.pw.projeto_restaurante.model.utils.endereco.dao.PaisDao;
import ufg.pw.projeto_restaurante.model.utils.telefone.Telefone;
import ufg.pw.projeto_restaurante.model.utils.telefone.dao.TelefoneDao;

public class PrincipalParaTeste {

	public static void main(String[] args) {
		Veiculo car = new Veiculo("XKY-9901","Preto","Ford Fiesta");
		VeiculoDao vDai = new VeiculoDao();
		car = vDai.salvar(car);
		
		Pais pais = new Pais("Brasil");
		PaisDao pdao = new PaisDao();
		pais = pdao.salvar(pais);
		
		Estado estado = new Estado("Goiás",pais);
		EstadoDao eDao = new EstadoDao();
		estado = eDao.salvar(estado);
		
		Cidade cidade = new Cidade("Goiânia",estado);
		CidadeDao cDao = new CidadeDao();
		cidade = cDao.salvar(cidade);
		
		Bairro bairro = new Bairro("Vila Mimosa",cidade);
		BairroDao bDaou = new BairroDao();
		bairro = bDaou.salvar(bairro);
		
		Logradouro logradouro = new Logradouro(EnumTipoLogradouro.PRACA, "Qualquer lugar",bairro);
		LogradouroDao lDao = new LogradouroDao();
		logradouro = lDao.salvar(logradouro);
		
		Endereco end;// = new Endereco(1452,45,04,logradouro);
		EnderecoDao endDao = new EnderecoDao();
		end = endDao.consultarPorId((long)1);
		
		Telefone tel = new Telefone(62, 35965456,"Celular");
		TelefoneDao tDao = new TelefoneDao();
		//tel = tDao.salvar(tel);
		
		Cliente cli = new Cliente("Johana", tel, end, "1239204144",car);
		ClienteDao cliDao = new ClienteDao();
		cli = cliDao.salvar(cli);
		
		Cliente cli2 = new Cliente("Biscatto", new Telefone(62, 35965456,"Celular"), end, "1339204144",car);
		cli2 = cliDao.salvar(cli2);
		
		System.out.println(cliDao.consultarPorId(cli.getId()).getNome());
		System.out.println(cliDao.consultarPorId(cli2.getId()).getNome());
	}

}
