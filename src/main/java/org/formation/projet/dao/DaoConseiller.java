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
import org.formation.projet.entity.Gerant;

public class DaoConseiller implements ICrudConseiller {

	@Override
	public void postConseiller(Conseiller conseiller) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.persist(conseiller);
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
	public Conseiller getConseillerById(Conseiller conseiller) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		Conseiller conseillersession = new Conseiller();

		try {
			tnx.begin();

			conseillersession = em.find(Conseiller.class, conseiller.getIdConseiller());

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

		return conseillersession;
	}

	@Override
	public Collection<Conseiller> getAllConseillersByIdConseiller(Gerant gerant) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tnx = em.getTransaction();
//
		Collection<Conseiller> collectionConseiller = new HashSet<>();
//
//		try {
//			tnx.begin();
//
//			TypedQuery<Client> query = em.createQuery(" select c from Client where idGerant= ?1 ", Conseiller.class)
//					.setParameter(1, gerant.getIdGerant());
//			collectionClient = query.getResultList();
//
//			tnx.commit();
//		} catch (Exception e) {
//			if (tnx != null) {
//				tnx.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
//
	return collectionConseiller;
	}

	@Override
	public void putConseiller(Conseiller conseiller) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.merge(conseiller);

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
	public void deleteConseiller(Conseiller conseiller) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();

		try {
			tnx.begin();

			em.remove(conseiller);

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
