package stepsdefinitions;

import java.util.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.Map;

import hlgamemav.Fruit;

import static org.junit.Assert.assertEquals;

public class FruitNonDispo {
	Fruit fruit;
	@Given("^le stock de fruits et une barre de recheche$")
	public void le_stock_de_fruits_et_une_barre_de_recheche() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step1: Le client est dans la page de recherche ");
	}

	@When("^je cherche les fruits dont la quantite egale a (\\d+)$")
	public void je_cherche_les_fruits_dont_la_quantite_egale_a(int quantite) {
	    // Write code here that turns the phrase above into concrete actions
		quantite=0;
		System.out.println("Step2:Rechercher les fruits qui ont une quantite egale a "+quantite);
		fruit=new Fruit(); 
	}

	@Then("^recuperer la liste des noms des fruits \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void recuperer_la_liste_des_noms_des_fruits(String arg1, String arg2, String arg3) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step3: les fruits avec les noms  "+arg1+" "+" "+arg2+" "+arg3+" "+"et avec quantite est nulle doivent etre affiché.");
		List<String > fruitsnondispo=fruit.getNonDispoFruits();
		 List<String> expected = Arrays.asList(arg1,arg2,arg3);
		  List<String> actual = fruitsnondispo;

		  assertEquals(actual,expected);
	}
}
