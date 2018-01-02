package org.formation.projet.dao;

import java.util.Collection;

import org.formation.projet.entity.Client;
import org.formation.projet.entity.CompteEpargne;


public interface ICrudCompteEpargne  {

	public void postCompteEpargne(CompteEpargne comptepargne);
	
	public CompteEpargne getCompteEpargneById(CompteEpargne comptepargne);
	
	public Collection<CompteEpargne> getAllCompteEpargneByIdClient(Client client);
	
	public void putCompteEpargne(CompteEpargne comptepargne);
	
	public void deleteCompteEpargne(CompteEpargne comptepargne);
	
}
