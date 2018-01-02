package org.formation.projet.dao;

import java.util.Collection;
import java.util.HashSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.formation.projet.entity.Client;
import org.formation.projet.entity.CompteEpargne;


public class CrudCompteEpargne implements ICrudCompteEpargne {

	@Override
	public void postCompteEpargne(CompteEpargne comptecourant) {
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
	public CompteEpargne getCompteEpargneById(CompteEpargne compteepargne) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		CompteEpargne compteEparneSession = new CompteEpargne();

		try {
			tnx.begin();

			compteEparneSession = em.find(CompteEpargne.class, compteepargne.getIdCompteBancaire());

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

		return compteEparneSession;
	}

	@Override
	public Collection<CompteEpargne> getAllCompteEpargneByIdClient(Client client) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		Collection<CompteEpargne> collectionCompteEpargne = new HashSet<>();

		try {
			tnx.begin();

			TypedQuery<CompteEpargne> query = em
					.createQuery(" select c from CompteCourant where idClient= ?1 ", CompteEpargne.class)
					.setParameter(1, client.getIdClient());
			collectionCompteEpargne = query.getResultList();

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
		return collectionCompteEpargne;
	}

	@Override
	public void putCompteEpargne(CompteEpargne compteepargne) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.merge(compteepargne);

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
	public void deleteCompteEpargne(CompteEpargne compteepargne) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.remove(compteepargne);

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
