package org.formation.projet.dao;

import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.formation.projet.entity.Client;
import org.formation.projet.entity.Conseiller;

/**
 * @author David Stephane interface CRUD client relaie les méthodes de DaoClient
 * 
 * 
 */

@Produces({"application/xml", "application/json"})
public interface ICrudClient {

	@POST
	@Path("/client/{client}")
	public void postClient(@PathParam("client")Client client);
	@GET
	@Path("/client/{id}")
	public Client getClientById(@PathParam("id") Long idClient);
	@PUT
	@Path("/client/{client}")
	public void putClient(@PathParam("client") Client client);
	@DELETE
	@Path("/client/{client}")
	public void deleteClient(@PathParam("client") Client client);

	public Collection<Client> getAllClientsByIdConseiller(Conseiller conseiller);
}
