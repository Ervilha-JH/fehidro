package br.unisantos.fehidro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "tb_pontuacao")
@Entity
@NamedQueries({
	@NamedQuery(name = "Pontuacao.consultarPorId",
			query = "select p from Pontuacao p where p.id=?1"),
	
})
//Classe responsavel para padronização do sistema de avaliação - NÃO POSSUI A NOTA DADA PELO AVALIADOR EM SÍ.
//Se está procurando a nota dada pelo avaliador vá para a classe Nota
public class Pontuacao extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Column(name = "nm_titulo")
	private String titulo;
	
	@Column(name = "nr_ponto")
	private int pontos;
	
	@Column(name = "bt_desclassificavel")
	private boolean desclassificavel;

}
