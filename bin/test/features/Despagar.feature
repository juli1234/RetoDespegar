@Despegar-Reservation
Feature: i as usuario, Make a reservation in the page of despagar.com

  Scenario Outline: Go into the navegator
    Given I need to go to the page despagar.com
    When I send the information for make the reservation, <id> , <nombre> , <apellido>, <nombrec>, <email>, <numero>, <direccion>,<codarea>,<ciudadorigen>,<ciudaddestino>
    Then I validate the if i sen all the information

    Examples: 
      | id           | nombre    | apellido | nombrec         | email                    | numero       | direccion     | codarea | ciudadorigen | ciudaddestino |
      | "1020491006" | "juliana" | "perez"  | "juliana perez" | "juliperez550@gmail.com" | "3215713776" | "carrera 50B" | "4"     | "medellin"   | "bogota"      |
