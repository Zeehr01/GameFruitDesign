package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import hlgamemav.Fruit;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StepsFruitSearch{
	Fruit fruit;
@Given("^Une barre de recherche$")
public void i_have_a_list_of_fruits(){
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step1: Le client est dans la page de recherche ");
}

@When("^Je cherche le fruit avec le nom  \"([^\"]*)\" et le prix (\\d+)$")
public void i_search_for_a_fruit_with_the_name_and_price(String fruitName, int prix) {
	System.out.println("Step2:Rechercher le produit avec le nom "+fruitName+" et le prix est "+prix);
	fruit=new Fruit(fruitName,prix); 

}

@Then("^le fruit avec le nom \"([^\"]*)\" doit etre affiche\\.$")
public void the_fruit_with_name_should_be_displayed(String fruitName) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step3:  Si le fruit existe,  son nom "+fruitName+" sera affiché.");
	String name =fruit.searchFruit(fruit); 
	System.out.println("le nom e  "+name);
	assertEquals(fruit.getName(), name);
}

}