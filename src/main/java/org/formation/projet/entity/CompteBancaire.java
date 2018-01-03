package org.formation.projet.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author David et Stephane : cette classe est liée à la Classe Client et 
 *         cascade avec celle-ci, cette Classe est parente de CompteCourant et CompteBancaire
 *
 */
@XmlRootElement(name="CompteBancaire")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class CompteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idcomptebancaire")
	private Long idCompteBancaire;

	private double solde;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "client_id")
	private Client client;

	public CompteBancaire() {
		super();
	}

	public Long getIdCompteBancaire() {
		return idCompteBancaire;
	}

	public void setIdCompteBancaire(Long idCompteBancaire) {
		this.idCompteBancaire = idCompteBancaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "CompteBancaire [idCompteBancaire=" + idCompteBancaire + ", solde=" + solde + ", client=" + client + "]";
	}

}