package fr.cattieuw.pizzeria.pizza.bean;

public class pizza {

	private int id;
	private String libelle;
	private String reference;
	private Double prix;
	private String ingredients;
	private String urlimage;

	public pizza(int id, String libelle, String reference, Double prixPizza, String ingredients, String urlimage) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.reference = reference;
		this.prix = prixPizza;
		this.ingredients = ingredients;
		this.urlimage = urlimage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getUrlimage() {
		return urlimage;
	}

	public void setUrlimage(String urlimage) {
		this.urlimage = urlimage;
	}

}
