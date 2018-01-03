package org.formation.projet.entity;

import javax.persistence.Embeddable;



/**
 * @author David Stephane : Class Adresse, classe incluse dans la Class Client
 *
 */
@Embeddable
public class Adresse {

	private String adresseClient; 
	private String codePostal; 
	private String ville; 
	private String numeroTel;
	
	public Adresse() {
		super();
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	} 
	
	
}
