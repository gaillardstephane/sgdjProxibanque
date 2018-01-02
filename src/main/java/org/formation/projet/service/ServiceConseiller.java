package org.formation.projet.service;

import java.util.Collection;

import org.formation.projet.dao.DaoConseiller;
import org.formation.projet.dao.ICrudConseiller;
import org.formation.projet.entity.Conseiller;
import org.formation.projet.entity.Gerant;

public class ServiceConseiller {

	ICrudConseiller daoConseiller = new DaoConseiller();

	public void postConseiller(Conseiller conseiller) {
		daoConseiller.postConseiller(conseiller);
	}

	public Conseiller getConseiller(Conseiller conseiller) {
		return daoConseiller.getConseillerById(conseiller);
	}

	public Collection<Conseiller> getAllClients(Gerant gerant) {
		return daoConseiller.getAllConseillersByIdConseiller(gerant);
	}

	public void putClient(Conseiller conseiller) {
		daoConseiller.putConseiller(conseiller);
	}

	public void deleteClient(Conseiller conseiller) {
		daoConseiller.deleteConseiller(conseiller);
	}

}
