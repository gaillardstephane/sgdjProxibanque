package org.formation.projet.service;

import java.util.Collection;

import org.formation.projet.dao.DaoConseiller;
import org.formation.projet.dao.ICrudConseiller;
import org.formation.projet.entity.Conseiller;
import org.formation.projet.entity.Gerant;

/**
 * @author David Stephane : couche service Conseiller qui relaie les méthodes de
 *         l'interface ICrudConseiller
 *
 */
public class ServiceConseiller {

	ICrudConseiller daoConseiller = new DaoConseiller();

	public void postConseiller(Conseiller conseiller) {
		daoConseiller.postConseiller(conseiller);
	}

	public Conseiller getConseiller(Long idConseiller) {
		return daoConseiller.getConseillerById(idConseiller);
	}

	public Collection<Conseiller> getAllClients(Gerant gerant) {
		return daoConseiller.getAllConseillersByIdConseiller(gerant);
	}

	public void putConseiller(Conseiller conseiller) {
		daoConseiller.putConseiller(conseiller);
	}

	public void deleteConseiller(Conseiller conseiller) {
		daoConseiller.deleteConseiller(conseiller);
	}

}
