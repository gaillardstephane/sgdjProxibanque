package org.formation.projet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.formation.projet.entity.Adresse;
import org.formation.projet.entity.Client;
import org.formation.projet.service.ServiceClient;

/**
 * Servlet implementation class ServletClientUpdate
 */
@WebServlet("/ServletClientUpdate")
public class ServletClientUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceClient sc = new ServiceClient();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletClientUpdate() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nomClient");
		String prenom = request.getParameter("prenomClient");
		String adresse = request.getParameter("adresse");
		String codePostal = request.getParameter("codePostal");
		String numeroTel = request.getParameter("numeroTel");
		String ville = request.getParameter("ville");
		String email = request.getParameter("email");

		Client cli = new Client();
		cli.setNom(nom);
		cli.setPrenom(prenom);
		cli.setEmail(email);

		Adresse a = new Adresse();
		a.setCodePostal(codePostal);
		a.setAdresseClient(adresse);
		a.setNumeroTel(numeroTel);
		a.setVille(ville);

		cli.setAdresse(a);
		sc.putClient(cli);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("proxi_v3_liste_clients.jsp");
		requestDispatcher.forward(request, response);

	}
}


