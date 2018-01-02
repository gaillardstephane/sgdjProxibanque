package org.formation.projet.entity;

public class CompteCourant extends CompteBancaire{

	private double decouvert ;
	
	
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
