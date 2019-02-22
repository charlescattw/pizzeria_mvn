package fr.cattieuw.pizzeria.pizza.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.cattieuw.pizzeria.pizza.bean.pizza;
import fr.cattieuw.pizzeria.pizza.repository.IPizzaRepository;

public class PizzaReposirory implements IPizzaRepository {

	@Override
	public ArrayList<pizza> findAll() { // a rappeler dans le pizzabusiness

		ArrayList<pizza> listeUtilisateurs = new ArrayList<>();

		try {
			Class.forName("org.mariadb.jdbc.Driver");

			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root",
					"Maria166$$");

			Statement st = cnx.createStatement();

			ResultSet resultat = st
					.executeQuery("SELECT id, libelle, reference, prix, ingredients, urlimage  FROM pizzas");

			while (resultat.next()) {
				int id = resultat.getInt("id");
				String libelle = resultat.getString("libelle");
				String reference = resultat.getString("reference");
				Double prix = resultat.getDouble("prix");
				String ingredients = resultat.getString("ingredients");
				String urlimage = resultat.getString("urlimage");

				pizza u = new pizza(id, libelle, reference, prix, ingredients, urlimage);

				listeUtilisateurs.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeUtilisateurs;
	}

	@Override // affiche une pizza
	public pizza findOne(int id) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root",
					"Maria166$$");

			Statement st = cnx.createStatement();

			ResultSet resultat = st.executeQuery(
					"SELECT id, libelle, reference, prix, ingredients, urlimage  FROM pizzas WHERE id=  " + id);

			while (resultat.next()) {
				int idPizza = resultat.getInt("id");
				String libelle = resultat.getString("libelle");
				String reference = resultat.getString("reference");
				Double prix = resultat.getDouble("prix");
				String ingredients = resultat.getString("ingredients");
				String urlimage = resultat.getString("urlimage");

				pizza u = new pizza(idPizza, libelle, reference, prix, ingredients, urlimage); // renome la varible id
				// pour
				// eviter l'erreur
				// redondante avec les
				// autres methodes

				return u;
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(int numero, String libelle, String description, String url_image, int prix) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root",
					"Maria166$$");
			PreparedStatement ps = cnx.prepareStatement(
					"INSERT INTO pizzas(numero, libelle, ingredients, urlimage, prix) VALUE(?,?,?,?,?)");
//le premier libellé correspond au premier point d'intérrogation 
			ps.setInt(1, numero);
			ps.setString(2, libelle);
			ps.setString(3, description);
			ps.setString(4, url_image);
			ps.setInt(5, prix);

			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	/*
	 * @Override public pizza findOne(int id) { try {
	 * Class.forName("org.mariadb.jdbc.Driver");
	 * 
	 * Connection nx =
	 * DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzas", "root",
	 * "Maria166$$");
	 * 
	 * Statement st = nx.createStatement();
	 * 
	 * ResultSet resultat = st.executeQuery(
	 * 
	 * "SELECT id, libelle, reference, prix, ingredients, urlimage FROM pizza WHERE id = "
	 * + id);
	 * 
	 * while (resultat.next()) { int idPizza = resultat.getInt("id"); String
	 * libPizza = resultat.getString("libelle"); String refPizza =
	 * resultat.getString("reference"); Double prixPizza =
	 * resultat.getDouble("prix"); String ingrPizza =
	 * resultat.getString("ingredient"); String urlPizza =
	 * resultat.getString("urlimage");
	 * 
	 * pizza u = new pizza(idPizza, libPizza, refPizza, prixPizza, ingrPizza,
	 * urlPizza); return u; }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return null; }
	 * 
	 * @Override public void delete(int id) { try {
	 * Class.forName("org.mariadb.jdbc.Driver"); Connection cnx =
	 * DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzas", "root",
	 * "Maria166$$");
	 * 
	 * Statement st = cnx.createStatement();
	 * 
	 * st.executeQuery("DELETE FROM utilisateurs WHERE id = " + id);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * @Override public boolean add(int id, String libelle, String reference, double
	 * prix, String ingredients, String urlimage) { try {
	 * Class.forName("org.mariadb.jdbc.Driver");
	 * 
	 * Connection cnx =
	 * DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzas", "root",
	 * "Maria166$$");
	 * 
	 * PreparedStatement ps = cnx.prepareStatement(
	 * "INSERT INTO utilisateurs(id, libelle, reference, prix, ingredients, urlimage) VALUES (?,?,?,?,?,?)"
	 * ); ps.setInt(1, id); ps.setString(2, libelle); ps.setString(3, reference);
	 * ps.setDouble(4, prix); ps.setString(5, ingredients); ps.setString(6,
	 * urlimage); ps.executeUpdate(); return true; } catch (Exception e) {
	 * e.printStackTrace(); return false; }
	 * 
	 * }
	 */
}