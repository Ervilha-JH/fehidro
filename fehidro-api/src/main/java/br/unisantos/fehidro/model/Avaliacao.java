package br.unisantos.fehidro.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//Classe que mantem a nota dada por um avaliador

@Table(name = "tb_avaliacao")
@Entity
@NamedQueries({ @NamedQuery(name = "Avaliacao.listarTodos", query = "select a from Avaliacao a order by a.id") })
public class Avaliacao extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "nota_id")
    private Pontuacao nota;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario avaliador;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "proposta_id")
    private Proposta proposta;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "subcriterio_id")
    private SubcriterioAvaliacao subcriterio;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "criterio_id")
    private CriterioAvaliacao criterio;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "subPDC_id")
    private SubPDC subpdc;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "pdc_id")
    private PDC pdc;
    
    
	public Avaliacao() {
		
	}


	public Pontuacao getNota() {
		return nota;
	}


	public void setNota(Pontuacao nota) {
		this.nota = nota;
	}


	public Usuario getAvaliador() {
		return avaliador;
	}


	public void setAvaliador(Usuario avaliador) {
		this.avaliador = avaliador;
	}


	public Proposta getProposta() {
		return proposta;
	}


	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}


	public SubcriterioAvaliacao getSubcriterio() {
		return subcriterio;
	}


	public void setSubcriterio(SubcriterioAvaliacao subcriterio) {
		this.subcriterio = subcriterio;
	}


	public CriterioAvaliacao getCriterio() {
		return criterio;
	}


	public void setCriterio(CriterioAvaliacao criterio) {
		this.criterio = criterio;
	}


	public SubPDC getSubpdc() {
		return subpdc;
	}


	public void setSubpdc(SubPDC subpdc) {
		this.subpdc = subpdc;
	}


	public PDC getPdc() {
		return pdc;
	}


	public void setPdc(PDC pdc) {
		this.pdc = pdc;
	}
    
    
    
    
	
}
