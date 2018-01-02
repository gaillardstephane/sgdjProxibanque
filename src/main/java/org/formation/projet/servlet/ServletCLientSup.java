package org.formation.projet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.formation.projet.entity.Client;
import org.formation.projet.service.*;

/**
 * Servlet implementation class , elle reçoit la requette émise par
 * le conseiller pour creer un client, la traite et l'execute, et renvoi vers la page adequate.
 */
@WebServlet("/ServletClientSup")
public class ServletCLientSup extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	ServiceClient sc = new ServiceClient();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCLientSup() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Client client = new Client(); 
		
			request.getParameter("client");
				
		
		sc.deleteClient(client);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Ecran2.jsp");
		requestDispatcher.forward(request, response);
	}

}
