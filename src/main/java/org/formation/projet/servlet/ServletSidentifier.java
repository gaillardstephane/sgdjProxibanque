package org.formation.projet.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.formation.projet.entity.Conseiller;
import org.formation.projet.service.ServiceConseiller;

/**
 * Servlet Stephane David : la servlet reçoit la requette émise par le
 * conseiller pour se connecter, la query fait référence à une méthode de la
 * Classe Conseiller : conseiller.login la liste remontée est testée
 */

@WebServlet("/sidentifier")
public class ServletSidentifier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	ServiceConseiller sco = new ServiceConseiller();

	public ServletSidentifier() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String seLogger = request.getParameter("login");
		String motDePasse = request.getParameter("password");

		if (motDePasse == null || seLogger == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login_conseiller_erreur_null.jsp");
			requestDispatcher.forward(request, response);

		} else if (motDePasse.trim() == "" || seLogger.trim() == "") {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login_conseiller_erreur_null.jsp");
			requestDispatcher.forward(request, response);
		}

		else if (seLogger.equals("david") && motDePasse.equals("proxy")) {
			HttpSession session = request.getSession();
			session.setAttribute("login", seLogger);

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("loggin_conseiller_confirme.jsp");
			requestDispatcher.forward(request, response);

		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("loggin_conseiller_erreur_erreur.jsp");
			requestDispatcher.forward(request, response);
		}

		// EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		// EntityManager em = emf.createEntityManager();
		// EntityTransaction tnx = em.getTransaction();
		//
		// try {
		// tnx.begin();
		//
		// Query q = em.createQuery("conseiller.login").setParameter(1,
		// seLogger).setParameter(2, motDePasse);
		// conseillers= q.getResultList();
		// tnx.commit();
		//
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
		// int a = conseillers.size();
		//
		// if (a==1) {
		//
		// HttpSession session = request.getSession();
		// session.setAttribute("login", seLogger);
		//
		// RequestDispatcher requestDispatcher =
		// request.getRequestDispatcher("loggin_conseiller_confirme.jsp");
		// requestDispatcher.forward(request, response);
		//
		// } else {
		//
		// RequestDispatcher requestDispatcher =
		// request.getRequestDispatcher("loggin_conseiller_erreur_erreur.jsp");
		// requestDispatcher.forward(request, response);
		//
		// }
		// }
	}
}
