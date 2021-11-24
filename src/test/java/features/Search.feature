
@tag
Feature: Fruit Search
  En tant que client, je souhaite rechercher un fruit par nom et obtenir son prix. 
  pour vérifier si le fruit existe et si je peux acheter.

  @tag1
  Scenario Outline: chercher un fruit
    Given Une barre de recherche
    When Je cherche le fruit avec le nom  <fruit> et le prix <prix> 
    Then le fruit avec le nom <fruit> doit etre affiche.
    
    Examples:
        | fruit    | prix  | 
		    | "Orange" |     3 | 
		    | "Pomme"  |     2 |
    
    #Examples: 
#	      | fruit    | prix  | 
#	      | "Orange" |     3 | 
#	      | "Pomme"  |     2 | 

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

  
  
