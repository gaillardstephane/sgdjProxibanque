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
 * Servlet implementation class sidentifier
 */
@WebServlet("/sidentifier")
public class Sidentifier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	ServiceConseiller sco = new ServiceConseiller();

	public Sidentifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String selogger = request.getParameter("utilisateur");
		String motDePasse = request.getParameter("motdepasse");

		List<Conseiller> conseillers = new ArrayList<>();  
		
		if (motDePasse== null || selogger==null) { 
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Ecranacceuil.jsp");
			requestDispatcher.forward(request, response);
		}
		else if (motDePasse.trim() =="" || selogger.trim()==""){
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Ecranacceuil.jsp");
			requestDispatcher.forward(request, response);
		} else { 
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tnx = em.getTransaction();
				
			try {
				tnx.begin();
	
				Query q = em.createQuery("select c from Conseiller where c.nomConseiller=?1 and c.password=?2")
						.setParameter(1, selogger).setParameter(2, motDePasse);
	
				 conseillers= (List<Conseiller>) q.getResultList(); 
							
				 
				
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
			int a = conseillers.size(); 
			
			if (a == 1) { 
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("logged.jsp");
				requestDispatcher.forward(request, response);
			} else {
	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Ecranacceuil.jsp");
		requestDispatcher.forward(request, response);

			}
		}

	}
}
