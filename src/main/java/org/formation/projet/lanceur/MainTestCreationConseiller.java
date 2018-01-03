package org.formation.projet.lanceur;

import org.formation.projet.entity.Conseiller;
import org.formation.projet.service.ServiceConseiller;

/**
 * @author David Stephane , test la creation d'un conseiller
 *
 */
public class MainTestCreationConseiller {

	public static void main(String[] args) {

		ServiceConseiller servCons = new ServiceConseiller();

		Conseiller c = new Conseiller();
		c.setNomConseiller("bibOOio");
		c.setPrenomConseiller("bernardO");
		c.setPassword("cardinal");

		servCons.postConseiller(c);
					
		System.out.println(c.getNomConseiller());
	}

}
