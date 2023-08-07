Feature: Filtros de Búsqueda
  Scenario: El usuario aplica dos o más filtros a la búsqueda celulares
    Given ingresa a la pagina de principal mercado libre
    When ingresa el texto celulares
    And click en buscar
    And usuario ve los resultados de la busqueda
    And click en filtro samsung y nuevo
    Then usuario ve los resultado filtrados