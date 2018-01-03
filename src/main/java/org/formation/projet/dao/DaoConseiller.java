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

/**
 * @author David Stephane CRUD client, méthode postConseiller pour incrire un
 *         nouveau conseiller, putConseiller pour une mise à jour,
 *         getConseillerById pour aller chercher un client
 *         getAllConseillersByIdgerant pour trouver la liste des conseillers par
 *         gerant et enfin delete conseiller pour effacer un conseillser
 *
 */
public class DaoConseiller implements ICrudConseiller {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	EntityManager em = emf.createEntityManager();

	@Override
	public void postConseiller(Conseiller conseiller) {

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
	public Conseiller getConseillerById(Long idConseiller) {

		EntityTransaction tnx = em.getTransaction();

		Conseiller conseillersession = new Conseiller();

		try {
			tnx.begin();

			conseillersession = em.find(Conseiller.class, idConseiller);

			// System.out.println("88888888888888888"+conseillersession.getPrenomConseiller());
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
		// EntityTransaction tnx = em.getTransaction();
		//
		Collection<Conseiller> collectionConseiller = new HashSet<>();
		//
		// try {
		// tnx.begin();
		//
		// TypedQuery<Client> query = em.createQuery(" select c from Client where
		// idGerant= ?1 ", Conseiller.class)
		// .setParameter(1, gerant.getIdGerant());
		// collectionClient = query.getResultList();
		//
		// tnx.commit();
		// } catch (Exception e) {
		// if (tnx != null) {
		// tnx.rollback();
		// }
		// e.printStackTrace();
		// } finally {
		// if (em != null) {
		// em.close();
		// }
		// }
		//
		return collectionConseiller;
	}

	@Override
	public void putConseiller(Conseiller conseiller) {

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
