package br.unisantos.fehidro.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Classe que mantem a nota dada por um avaliador
@Table(name = "tb_nota")
@Entity
public class Nota extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
    @JoinColumn(name = "nota_id")
    private Pontuacao nota;
	
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario avaliador;
	
}
