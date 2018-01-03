package org.formation.projet.lanceur;

import java.util.Collection;

import org.formation.projet.entity.Adresse;
import org.formation.projet.entity.Client;
import org.formation.projet.entity.Conseiller;
import org.formation.projet.service.ServiceClient;
import org.formation.projet.service.ServiceConseiller;

/**
 * @author David Stephane , test la creation d'un conseiller, d'un client ainsi
 *         que l'ajout d'une adresse au client
 *
 */
public class MainTestCreationclient_ajout_conseiller {

	public static void main(String[] args) {

		ServiceClient servCli = new ServiceClient();
		ServiceConseiller ser = new ServiceConseiller();

		Client c = new Client();
		c.setNom("biosedsq");
		c.setPrenom("bedfdfdord");
		c.setEmail("monclient@gmail.com");

		Adresse adresse = new Adresse();
		adresse.setVille("paris");
		adresse.setNumeroTel("0662857428");
		adresse.setAdresseClient("avenue egliCse");
		adresse.setCodePostal("7800");
		c.setAdresse(adresse);

		Conseiller d = ser.getConseiller(1l);

		c.setConseiller(d);
		d.getListClient().add(c);
		servCli.postClient(c);

		// Conseiller d = new Conseiller();
		// d.setNomConseiller("chris");
		// d.setPrenomConseiller("josepe");
		// d.setPassword("immo");
		// sercon.postConseiller(d);
		//
		// d.getListClient().add(c);

		servCli.postClient(c);

	}

}
