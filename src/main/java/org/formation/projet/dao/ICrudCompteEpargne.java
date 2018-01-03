package org.formation.projet.dao;

import java.util.Collection;

import org.formation.projet.entity.Client;
import org.formation.projet.entity.CompteEpargne;


/**
 * @author David Stephane interface CRUD compteEpargne relaie les méthodes de
 *         DaoCompteEpargne
 *
 */
public interface ICrudCompteEpargne  {

	public void postCompteEpargne(CompteEpargne comptepargne);
	
	public CompteEpargne getCompteEpargneById(CompteEpargne comptepargne);
	
	public Collection<CompteEpargne> getAllCompteEpargneByIdClient(Client client);
	
	public void putCompteEpargne(CompteEpargne comptepargne);
	
	public void deleteCompteEpargne(CompteEpargne comptepargne);
	
}
