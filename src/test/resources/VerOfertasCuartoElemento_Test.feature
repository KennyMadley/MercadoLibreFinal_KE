Feature: Ver productos segun la tercer categoria de OFertas
  Scenario: El usuario puede accesar al cuarto elemento de las categorias en la cinta Ofertas
    Given ingresa a la pagina de principal mercado libre
    When click en ofertas
    And click en la cuarta categoria de la cinta
    Then el usuario ve los resultados correspondientes a la cuarta categoria