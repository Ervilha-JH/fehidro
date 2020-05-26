package fehidro.model;

import java.util.ArrayList;
import java.util.List;

public class PDC {
	
	private int codigo;
	private String titulo;
	private List<SubPDC> cronogramas = new ArrayList<SubPDC>();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<SubPDC> getCronogramas() {
		return cronogramas;
	}
	public void setCronogramas(List<SubPDC> cronogramas) {
		this.cronogramas = cronogramas;
	}
	
	
	
}
