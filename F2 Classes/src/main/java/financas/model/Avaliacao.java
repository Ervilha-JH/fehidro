package financas.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
@Table(name="tb_avaliacao")
@Entity
public class Avaliacao extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Column(name = "nm_criterio", length = 100)
    private String criterio;
    @Column(name = "nota")
    private Integer nota;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Avaliador avaliador;
    

    public Avaliacao() {
	}


	public String getCriterio() {
		return criterio;
	}


	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}


	public Integer getNota() {
		return nota;
	}


	public void setNota(Integer nota) {
		this.nota = nota;
	}


	public Avaliador getAvaliador() {
		return avaliador;
	}


	public void setAvaliador(Avaliador avaliador) {
		this.avaliador = avaliador;
	}

	
}
