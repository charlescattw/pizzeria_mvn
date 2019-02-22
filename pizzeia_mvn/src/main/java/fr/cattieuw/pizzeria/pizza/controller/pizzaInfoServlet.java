package fr.cattieuw.pizzeria.pizza.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cattieuw.pizzeria.pizza.bean.pizza;
import fr.cattieuw.pizzeria.pizza.business.impl.PizzaBusiness;

/**
 * Servlet implementation class pizzaInfoServlet
 */
@WebServlet("/pizza-info")
public class pizzaInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PizzaBusiness pb = new PizzaBusiness();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idString = request.getParameter("id"); // recupere l'id

		int id = Integer.parseInt(idString); // transforme le string en integer

		// appel la méthode pizza du business findOne(int id)
		pizza pizza = pb.findOne(id);

		request.setAttribute("pizza", pizza);

		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/pizza_info.jsp").forward(request, response);
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
