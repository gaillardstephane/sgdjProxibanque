package org.formation.projet.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author David et Stephane : cette classe est li�e � la Classe Client et
 *         cascade avec celle-ci, cette Classe h�rite de CompteBancaire
 *
 */
@XmlRootElement(name="CompteCourant")
public class CompteCourant extends CompteBancaire {

	private double decouvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
