package org.formation.projet.entity;

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
