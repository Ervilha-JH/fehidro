package br.unisantos.fehidro.dao;

import java.util.List;

import br.unisantos.fehidro.model.Avaliacao;

public class AvaliacaoDAO extends DAOFactory<Avaliacao> {

	public AvaliacaoDAO() {
		super(Avaliacao.class);
	}
	
	public void cadastrar(Avaliacao avaliacao) {
		adicionar(avaliacao);
	}
	
	public void atualizar(Avaliacao avaliacao) {
		atualizar(avaliacao);
	}

	public Avaliacao obter(long id) {
		return consultar(id);
	}

	public List<Avaliacao> listar() {
		return listarGenerico("Avaliacao.listarTodos");
	}
	
//	public List<Avaliacao> listar(Avaliacao avaliacao) {
//		// TODO Auto-generated method stub
//		return null;
//	}	
	
	
}
