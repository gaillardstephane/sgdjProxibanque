package org.formation.projet.entity;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author David Stephane : Class Client, inclus la Class Adresse, est liée à la
 *         Class compte par une relation OneToMany ; et est liée à la Class
 *         Conseiller par une relation ManyToOne
 *
 */
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;

	private String nom;
	private String prenom;
	private String email;

	@Embedded
	private Adresse adresse;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;

	@OneToMany(mappedBy = "client")
	private Collection<CompteBancaire> listCompte = new HashSet<>();

	public Client() {
		super();
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Collection<CompteBancaire> getListCompte() {
		return listCompte;
	}

	public void setListCompte(Collection<CompteBancaire> listCompte) {
		this.listCompte = listCompte;
	}

	public void addCompteBancaire(CompteBancaire compteBancaire) {
		compteBancaire.setClient(this);
		listCompte.add(compteBancaire);
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", adresse=" + adresse + ", conseiller=" + conseiller + ", listCompte=" + listCompte + "]";
	}

}
