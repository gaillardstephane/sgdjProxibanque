package org.formation.projet.entity;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * @author David Stephane : Class Conseiller, est liée à la Class Client par une
 *         relation ManyToOne, possède une méthode addClient pour gérer le
 *         ReverseEnd
 *
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "conseiller.login", query = "select c from Conseiller c where c.nomConseiller=?1 and c.password=?2") })
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConseiller;
	private String nomConseiller;
	private String prenomConseiller;
	private String password;

	@OneToMany(mappedBy = "conseiller")
	private Collection<Client> listClient = new HashSet<>();

	public Conseiller() {
		super();
	}

	public Conseiller(String nomConseiller) {
		super();
		this.nomConseiller = nomConseiller;
	}

	public Conseiller(Long idConseiller, String password) {
		super();
		this.idConseiller = idConseiller;
		this.password = password;
	}

	public Long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Long idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getNomConseiller() {
		return nomConseiller;
	}

	public void setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}

	public String getPrenomConseiller() {
		return prenomConseiller;
	}

	public void setPrenomConseiller(String prenomConseiller) {
		this.prenomConseiller = prenomConseiller;
	}

	public Collection<Client> getListClient() {
		return listClient;
	}

	public void setListClient(Collection<Client> listClient) {
		this.listClient = listClient;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addClient(Client client) {
		listClient.add(client);
		client.setConseiller(this);

	}

	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", nomConseiller=" + nomConseiller + ", prenomConseiller="
				+ prenomConseiller + ", password=" + password + ", listClient=" + listClient + "]";
	}

}
