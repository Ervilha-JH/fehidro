package fehidro.rest.client;

import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.*;
import javax.ws.rs.core.Response;

import fehidro.rest.client.RESTClientInterface;
import fehidro.model.Avaliacao;

public class AvaliacaoRESTClient implements RESTClientInterface<Avaliacao>{

	@Override
	public List<Avaliacao> findAll() {
		List<Avaliacao> avaliacoes = 	
				ClientBuilder.newClient().
				target(REST_WEBSERVICE_URL + REST_AVALIACAO_URL).
				request(MediaType.APPLICATION_JSON).get().
				readEntity(new GenericType<List<Avaliacao>> () {});
		return avaliacoes;
	}

	@Override
	public Avaliacao find(Long id) {
		Avaliacao avaliacao = ClientBuilder.newClient().
				target(REST_WEBSERVICE_URL + REST_AVALIACAO_URL + id).
				request(MediaType.APPLICATION_JSON).get()
				.readEntity(Avaliacao.class);
		
		return avaliacao;
	}

	@Override
	public Avaliacao create(Avaliacao obj) {
		Avaliacao avaliacao = 			
				ClientBuilder.newClient().
				target(REST_WEBSERVICE_URL + REST_AVALIACAO_URL).
				queryParam("avaliacao", obj).
				request(MediaType.APPLICATION_JSON).
				post(Entity.entity(obj, MediaType.APPLICATION_JSON)).
				readEntity(Avaliacao.class);
		
		return avaliacao;
	}

	@Override
	public Avaliacao edit(Avaliacao obj) {
		Avaliacao avaliacao = 
				ClientBuilder.newClient().
				target(REST_WEBSERVICE_URL + REST_AVALIACAO_URL).
				queryParam("avaliacao", obj).
				request(MediaType.APPLICATION_JSON).
				put(Entity.entity(obj, MediaType.APPLICATION_JSON)).
				readEntity(Avaliacao.class);
		
		return avaliacao;
	}

	@Override
	public boolean delete(Long id) {
		return 	ClientBuilder.newClient().
				target(REST_WEBSERVICE_URL + REST_AVALIACAO_URL + id).
				request(MediaType.APPLICATION_JSON).
				delete().getStatus() 
				== Response.Status.OK.getStatusCode();
	}

	
	
}
