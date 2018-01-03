package org.formation.projet.dao;

import java.util.Collection;

import org.formation.projet.entity.Client;
import org.formation.projet.entity.Conseiller;

/**
 * @author David Stephane interface CRUD client relaie les méthodes de DaoClient
 * 
 * 
 */
public interface ICrudClient {

	public void postClient(Client client);

	public Client getClientById(Long idClient);

	public Collection<Client> getAllClientsByIdConseiller(Conseiller conseiller);

	public void putClient(Client client);

	public void deleteClient(Client client);

}
