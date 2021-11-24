

@tag
Feature: Fruits Non Disponibles
  En tant que vendeur je veux recuperer la liste des fruits dans la quantite eagle a 0
  Afin de controler son stock de fruits et faire les achat necessaires 

  @tag1
  Scenario Outline: recuperer les fruits dont le stock est epuise
    Given le stock de fruits et une barre de recheche
    When je cherche les fruits dont la quantite egale a 0
    Then recuperer la liste des noms des fruits <fruits>


    Examples: 
      | fruits|
      | "Kiwi","kaki","banane" |
