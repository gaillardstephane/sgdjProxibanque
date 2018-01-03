package org.formation.projet.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author David et Stephane : cette classe est liée à la Classe Client et
 *         cascade avec celle-ci, cette Classe hérite de CompteBancaire
 *
 */

@XmlRootElement(name="CompteEpargne")
public class CompteEpargne extends CompteBancaire {

	private double tauxRemuneration;

	public CompteEpargne() {
		super();
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public CompteEpargne(double tauxRemuneration) {
		super();
		this.tauxRemuneration = tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
