package hlgamemav;

import java.util.*;

/**
 * Write a description of class Vendeur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vendeur {
	// instance variables - replace the example below with your own
	private String nomVendeur;

	ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	
	private Fruit fruit1;

	public Collection<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(ArrayList<Fruit> fruits) {
		this.fruits = fruits;
	}

	public Fruit getFruit() {
		// put your code here
		return this.fruit1;
	}

	/**
	 * Constructor for objects of class Vendeur
	 */
	
	public Vendeur(String n,ArrayList<Fruit> fs) {
		// initialise instance variables
		this.nomVendeur = n;
		this.fruits= fs;
	}
	
	public Fruit addFruit(Fruit f) {
		this.fruits.add(f);
		return f;
	}
	
	public Vendeur(String n, Fruit f) {
		// initialise instance variables
		this.nomVendeur = n;
		this.fruit1= f;
	}
	


	public String getName() {
		// put your code here
		return this.nomVendeur;
	}

	public void setName(String s) {
		// put your code here
		this.nomVendeur = s;
	}

	public void setFruit(Fruit f1) {
		// put your code here
		this.fruit1 = f1;
	}

	public String fruitVendu() {
		// put your code here
		return "le vendeur " + this.nomVendeur + " a vendu le fruit qui est " + fruit1.pasCher();
	}
}
