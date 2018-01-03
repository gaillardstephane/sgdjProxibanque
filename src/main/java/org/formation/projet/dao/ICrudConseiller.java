package org.formation.projet.dao;

import java.util.Collection;

import org.formation.projet.entity.Conseiller;
import org.formation.projet.entity.Gerant;

/**
 * @author David Stephane interface CRUD conseiller relaie les méthodes de
 *         DaoConseiller
 *
 */
public interface ICrudConseiller {

	public void postConseiller(Conseiller conseiller);

	public Conseiller getConseillerById(Long idConseiller);

	public Collection<Conseiller> getAllConseillersByIdConseiller(Gerant gerant);

	public void putConseiller(Conseiller conseiller);

	public void deleteConseiller(Conseiller conseiller);

}
