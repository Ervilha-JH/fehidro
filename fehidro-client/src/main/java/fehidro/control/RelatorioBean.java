package fehidro.control;

import java.util.LinkedList;
import java.util.List;


import fehidro.model.Avaliacao;
import fehidro.model.PDC;
import fehidro.model.Proposta;
import fehidro.model.SubPDC;
import fehidro.rest.client.AvaliacaoRESTClient;

public class RelatorioBean {

	private List<Avaliacao> avaliacoes;
	private AvaliacaoRESTClient restAvaliacao;
	
	public RelatorioBean()
	{
		this.restAvaliacao = new AvaliacaoRESTClient();
		this.setAvaliacoes(restAvaliacao.findAll());
	}
	
	private void setAvaliacoes(List<Avaliacao> _avaliacoes)
	{
		this.avaliacoes = _avaliacoes;
	}
	
	public List<Avaliacao> getTodasAvalicoes()
	{
		return avaliacoes;
	}
	
	public List<Avaliacao> getAvaliacoesPdc(PDC pdc)
	{
		List<Avaliacao> resultado = new LinkedList<Avaliacao>();
		Avaliacao aux = new Avaliacao();
		
		for(int i=0;i<avaliacoes.size();i++)
		{
			aux =avaliacoes.get(i); 
			if( aux.getPdc().equals(pdc) )
			{
				resultado.add(aux);
			}
		}
		
		return resultado;
	}
	
	public List<Avaliacao> getAvaliacoesSubPdc(SubPDC subpdc)
	{
		List<Avaliacao> resultado = new LinkedList<Avaliacao>();
		Avaliacao aux = new Avaliacao();
		
		for(int i=0;i<avaliacoes.size();i++)
		{
			aux =avaliacoes.get(i); 
			if( aux.getSubpdc().equals(subpdc) )
			{
				resultado.add(aux);
			}
		}
		
		return resultado;
	}
	
	public Avaliacao getAvaliacaoProposta(Proposta proposta)
	{
		Avaliacao resultado = new Avaliacao();
		Avaliacao aux = new Avaliacao();
		
		for(int i=0;i<avaliacoes.size();i++)
		{
			aux =avaliacoes.get(i); 
			if( aux.getProposta().equals(proposta) )
			{
				resultado = aux;
				break;
			}
		}
		
		return resultado;
	}
	
}
