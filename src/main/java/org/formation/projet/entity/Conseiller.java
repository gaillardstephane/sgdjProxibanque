package org.formation.projet.entity;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
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

}
