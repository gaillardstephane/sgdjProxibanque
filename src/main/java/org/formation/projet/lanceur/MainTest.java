package org.formation.projet.lanceur;

import java.util.Collection;

import org.formation.projet.entity.Adresse;
import org.formation.projet.entity.Client;
import org.formation.projet.entity.Conseiller;
import org.formation.projet.service.ServiceClient;

public class MainTest {

	public static void main(String[] args) {

		ServiceClient servCli = new ServiceClient();

		Client c = new Client();
		c.setNom("bi");
		c.setPrenom("bed");
		c.setEmail("monclient@gmail.com");
		
		servCli.postClient(c);

		Client c2 = servCli.getClient(c);
		
		Adresse adresse = new Adresse();
		adresse.setAdresseClient("avenue eglise");
		adresse.setCodePostal("7800");
		c2.setAdresse(adresse);

		servCli.putClient(c);

		// Conseiller conseiller = new Conseiller();
		// conseiller.setNomConseiller("robert");
		// conseiller.addClient(c);
		//
		// servCli.postClient(c);

		// Client c1 = servCli.postClient(client);
		// Client c2 = servCli.getClient();
		// Collection<Client> c3 = servCli.getAllClients();
		// Client c4 = servCli.putClient();
		// Client c5 = servCli.deleteClient();
		//

	}

}
