package br.unisantos.fehidro.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//Essa classe é o grupo de criterios
//Se está procurando a nota dada pelo avaliador vá para a classe "Nota"
@Table(name = "tb_avaliacao")
@Entity
public class Avaliacao  extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "criterio_id")
	List<CriterioAvaliacao> criterios = new ArrayList<>();
	

}
