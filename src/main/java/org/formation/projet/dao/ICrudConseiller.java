package org.formation.projet.dao;

import java.util.Collection;


import org.formation.projet.entity.Conseiller;
import org.formation.projet.entity.Gerant;

public interface ICrudConseiller {
	
	public void postConseiller(Conseiller conseiller);
	
	public Conseiller getConseillerById(Conseiller conseiller);
	
	public Collection<Conseiller> getAllConseillersByIdConseiller(Gerant gerant);
	
	public void putConseiller(Conseiller conseiller);
	
	public void deleteConseiller(Conseiller conseiller);
	
}
