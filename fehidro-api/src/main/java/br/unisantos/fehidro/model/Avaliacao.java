package br.unisantos.fehidro.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Classe que mantem a nota dada por um avaliador
@Table(name = "tb_avaliacao")
@Entity
public class Avaliacao extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
    @JoinColumn(name = "nota_id")
    private Pontuacao nota;
	
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario avaliador;
    
    @ManyToOne
    @JoinColumn(name = "subcriterio_id")
    private SubcriterioAvaliacao subcriterio;
    
    @ManyToOne
    @JoinColumn(name = "criterio_id")
    private CriterioAvaliacao criterio;
    
    @ManyToOne
    @JoinColumn(name = "subPDC_id")
    private SubPDC subpdc;
    
    @ManyToOne
    @JoinColumn(name = "pdc_id")
    private PDC pdc;
	
    
    
}
