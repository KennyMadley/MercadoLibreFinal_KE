Feature: Resultados por Relevancia
  Scenario: El usuario puede ordenar los resultados de la búsqueda por relevancia
    Given ingresa a la pagina de principal mercado libre
    When ingresa el texto celulares
    And click en buscar
    Then usuario ve los resultados ordenados por relevancia