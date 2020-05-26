package fehidro.model;

import java.util.ArrayList;
import java.util.List;

public class SubcriterioAvaliacao {
	private String titulo;
	private List<Pontuacao> pontuacoes = new ArrayList<>();
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Pontuacao> getPontuacoes() {
		return pontuacoes;
	}
	public void setPontuacoes(List<Pontuacao> pontuacoes) {
		this.pontuacoes = pontuacoes;
	}
	
	
	
}
