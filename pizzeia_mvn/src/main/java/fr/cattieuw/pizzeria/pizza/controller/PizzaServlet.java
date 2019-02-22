package fr.cattieuw.pizzeria.pizza.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cattieuw.pizzeria.pizza.bean.pizza;
import fr.cattieuw.pizzeria.pizza.business.impl.PizzaBusiness;

/**
 * Servlet implementation class PizzaServlet
 */
@WebServlet("/Pizza")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PizzaBusiness pb = new PizzaBusiness();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PizzaServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<pizza> liste = pb.findAll(); // récupère la liste du <business<repository<bdd avec methode findAll
		request.setAttribute("pizza", liste); // renvoie à la jsp sous le nom de "pizza"

		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/pizza_jsp.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
