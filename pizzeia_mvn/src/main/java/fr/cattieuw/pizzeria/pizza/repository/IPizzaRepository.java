package fr.cattieuw.pizzeria.pizza.repository;

import java.util.ArrayList;

import fr.cattieuw.pizzeria.pizza.bean.pizza;;

public interface IPizzaRepository {

	public ArrayList<pizza> findAll();

	public pizza findOne(int id); // methode d'affichage des pizza à l'unité

	public void delete(int id); // methode pour la suppression d'une ligne de la base

	public boolean add(int numero, String libelle, String description, String url_image, int prix); // methode
																									// pour
																									// l'ajout
																									// d'une
																									// pizza
																									// à
																									// partir
																									// du
																									// formulaire

}
