package org.formation.projet.lanceur;

import java.util.Collection;

import org.formation.projet.entity.Client;
import org.formation.projet.entity.Conseiller;
import org.formation.projet.service.ServiceClient;
import org.formation.projet.service.ServiceConseiller;

public class TestListClient {

	/**
	 * @param David
	 *            Stephane , test la récupération de la liste Clients lié à un
	 *            conseiller
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceClient bn = new ServiceClient();
		ServiceConseiller bb = new ServiceConseiller();

		// Conseiller c1= bb.getConseiller(1L);
		Collection<Client> col = bn.getAllClients(bb.getConseiller(1L));

		System.out.println(col);

	}

}
