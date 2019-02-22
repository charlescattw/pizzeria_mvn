package fr.cattieuw.pizzeria.pizza.business;

import java.util.ArrayList;

import fr.cattieuw.pizzeria.pizza.bean.pizza;

public interface IPizzaBusiness {

	ArrayList<pizza> findAll();

	pizza findOne(int id);

	public boolean add(int numero, String libelle, String description, String url_image, int prix);
}
