package fr.cattieuw.pizzeria.pizza.business.impl;

import java.util.ArrayList;

import fr.cattieuw.pizzeria.pizza.bean.pizza;
import fr.cattieuw.pizzeria.pizza.business.IPizzaBusiness;
import fr.cattieuw.pizzeria.pizza.repository.impl.PizzaReposirory;

public class PizzaBusiness implements IPizzaBusiness {
	PizzaReposirory pizzaRepo = new PizzaReposirory(); // crée le lien entre le Business et le Repository.

	@Override
	public ArrayList<pizza> findAll() { // a rappeler dans le pizzabusiness.

		ArrayList<pizza> liste = pizzaRepo.findAll(); // retourne la liste.
		return liste;
	}

	@Override
	public pizza findOne(int id) { // affiche une seule pizza

		pizza p = pizzaRepo.findOne(id); // retourne la liste.
		return p;
	}

	@Override
	public boolean add(int numero, String libelle, String description, String url_image, int prix) {
		boolean b = pizzaRepo.add(numero, libelle, description, url_image, prix);
		return b;
	}
}
