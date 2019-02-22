package fr.cattieuw.pizzeria.pizza.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cattieuw.pizzeria.pizza.business.impl.PizzaBusiness;

/**
 * Servlet implementation class PizzaAjoutServlet
 */
@WebServlet("/PizzaAjoutServlet")
public class PizzaAjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PizzaBusiness pizzabz = new PizzaBusiness();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/pizza_ajout.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// injecte au serveur les varaibles saisie dans le formulaire. Une préparation
		// est programmée par le "prepareStatement" dans le repository.
		String libelle = request.getParameter("libelle");
		String numeroS = request.getParameter("numero");
		int numero = Integer.parseInt(numeroS);
		String description = request.getParameter("description");
		String urlimage = request.getParameter("urlimage");
		String prixS = request.getParameter("prix");
		int prix = Integer.parseInt(prixS);

		boolean Sok = pizzabz.add(numero, libelle, description, urlimage, prix);
		if (Sok) {
			response.sendRedirect("Pizza");
		} else {
			response.sendRedirect("PizzaAjoutServlet");
		}
	}

}
