package org.formation.projet.dao;

import java.util.Collection;
import java.util.HashSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.formation.projet.entity.Client;
import org.formation.projet.entity.Conseiller;

/**
 * @author David Stephane CRUD client, méthode postClient pour incrire un
 *         nouveau client, putClient pour une miseà jour, getClientById pour
 *         aller chercher un client getAllClientsByIdConseiller pour trouver la
 *         liste des client par conseiller et enfin delete client pour effacer
 *         un client
 */

public class DaoClient implements ICrudClient {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	EntityManager em = emf.createEntityManager();
	
	
	
	@Override
	public void postClient(Client client) {
		
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.persist(client);
			
			tnx.commit();
		} catch (Exception e) {
			if (tnx != null) {
				tnx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	@Override
	public Client getClientById(Long idClient) {

		
		EntityTransaction tnx = em.getTransaction();

		Client clientsession = new Client();

		try {
			tnx.begin();

			clientsession = em.find(Client.class, idClient);

			tnx.commit();
		} catch (Exception e) {
			if (tnx != null) {
				tnx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return clientsession;
	}

	@Override
	public Collection<Client> getAllClientsByIdConseiller(Conseiller conseiller) {

		
		EntityTransaction tnx = em.getTransaction();

		Collection<Client> collectionClient = new HashSet<>();

		try {
			tnx.begin();

			TypedQuery<Client> query = em.createQuery(" select c from Client c where conseiller=:idcon", Client.class);
			query.setParameter("idcon",  conseiller.getIdConseiller());
			collectionClient = query.getResultList();

			tnx.commit();
		} catch (Exception e) {
			if (tnx != null) {
				tnx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return collectionClient;
	}

	@Override
	public void putClient(Client client) {

		
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			// Client clientsession = em.find(Client.class, client.getClientId());
			// clientsession = client;
			em.merge(client);

			tnx.commit();
		} catch (Exception e) {
			if (tnx != null) {
				tnx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	@Override
	public void deleteClient(Client client) {

		
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.remove(client);

			tnx.commit();
		} catch (Exception e) {
			if (tnx != null) {
				tnx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

}
