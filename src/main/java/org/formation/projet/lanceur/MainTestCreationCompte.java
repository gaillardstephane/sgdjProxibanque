package org.formation.projet.lanceur;

import org.formation.projet.entity.Client;
import org.formation.projet.entity.CompteBancaire;
import org.formation.projet.entity.CompteCourant;
import org.formation.projet.entity.Conseiller;
import org.formation.projet.service.ServiceConseiller;

/**
 * @author David Stephane , test la creation d'un compte bancaire
 *
 */
public class MainTestCreationCompte {

	public static void main(String[] args) {

		CompteBancaire d = new CompteCourant();
		d.setSolde(100);

	}

}
