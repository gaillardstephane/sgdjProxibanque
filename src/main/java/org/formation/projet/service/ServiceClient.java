package org.formation.projet.service;

import java.util.Collection;

import org.formation.projet.dao.DaoClient;
import org.formation.projet.dao.ICrudClient;
import org.formation.projet.entity.Client;
import org.formation.projet.entity.Conseiller;

/**
 * @author David Stephane : couche service Client qui relaie les méthodes de
 *         l'interface IcrudClient
 *
 */
public class ServiceClient {

	ICrudClient daoClient = new DaoClient();

	public void postClient(Client client) {
		daoClient.postClient(client);
	}

	public Client getClient(Long idClient) {
		return daoClient.getClientById(idClient);
	}

	public Collection<Client> getAllClients(Conseiller conseiller) {
		return daoClient.getAllClientsByIdConseiller(conseiller);
	}

	public void putClient(Client client) {
		daoClient.putClient(client);
	}

	public void deleteClient(Client client) {
		daoClient.deleteClient(client);
	}

}
