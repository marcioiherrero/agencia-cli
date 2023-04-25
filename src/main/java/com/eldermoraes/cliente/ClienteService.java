package com.eldermoraes.cliente;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


//RegisterRestClient -> permite que o Quarkus saiba que essa interface deve
//estar disponível para injeção CDI como um cliente REST.
@RegisterRestClient(baseUri="http://localhost:8080/cliente")
public interface ClienteService {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response newCliente(Cliente cliente);
	
}
