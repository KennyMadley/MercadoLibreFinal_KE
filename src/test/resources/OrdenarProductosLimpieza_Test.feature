Feature: Ver productos segun la tercer categoria de OFertas
  Scenario: El usuario puede accesar al quinto elemento de las categorias en la cinta Ofertas
    Given ingresa a la pagina de principal mercado libre
    When click en categorias
    And click en supermercado
    And click en cuidados del hogar
    And click en productos de limpieza
    And click en ordenar por mayor precio
    Then el usuario ve los productor odenador por mayor precio