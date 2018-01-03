package org.formation.projet.dao;

import java.util.Collection;

import org.formation.projet.entity.Client;
import org.formation.projet.entity.CompteCourant;

/**
 * @author David Stephane interface CRUD comptecourant relaie les méthodes de
 *         DaoComptecourant
 *
 */
public interface ICrudCompteCourant {

	public void postCompteCourant(CompteCourant comptecourant);

	public CompteCourant getCompteCourantById(CompteCourant comptecourant);

	public Collection<CompteCourant> getAllCompteCourantByIdClient(Client client);

	public void putCompteCourant(CompteCourant comptecourant);

	public void deleteCompteCourant(CompteCourant comptecourant);

}
