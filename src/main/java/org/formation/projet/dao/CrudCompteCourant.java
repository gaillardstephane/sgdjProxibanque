package org.formation.projet.dao;

import java.util.Collection;
import java.util.HashSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.formation.projet.entity.Client;
import org.formation.projet.entity.CompteCourant;

public class CrudCompteCourant implements ICrudCompteCourant {

	@Override
	public void postCompteCourant(CompteCourant comptecourant) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.persist(comptecourant);
			System.out.println("added dao");

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
	public CompteCourant getCompteCourantById(CompteCourant comptecourant) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		CompteCourant compteCourantsession = new CompteCourant();

		try {
			tnx.begin();

			compteCourantsession = em.find(CompteCourant.class, comptecourant.getIdCompteBancaire());

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

		return compteCourantsession;
	}

	@Override
	public Collection<CompteCourant> getAllCompteCourantByIdClient(Client client) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		Collection<CompteCourant> collectionCompteCourant = new HashSet<>();

		try {
			tnx.begin();

			TypedQuery<CompteCourant> query = em
					.createQuery(" select c from CompteCourant where idClient= ?1 ", CompteCourant.class)
					.setParameter(1, client.getIdClient());
			collectionCompteCourant = query.getResultList();

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
		return collectionCompteCourant;
	}

	@Override
	public void putCompteCourant(CompteCourant comptecourant) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.merge(comptecourant);

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
	public void deleteCompteCourant(CompteCourant comptecourant) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.remove(comptecourant);

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
