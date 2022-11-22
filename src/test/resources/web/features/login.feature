@Login
Feature: Login

  Background:
    Given El usuario esta en la pagina de automation practice
    And hace click en el boton mi cuenta

  Scenario Outline: Login fallido
    And ingresa usuario <usuario> y password <password>
    When hace click en el boton login
    Then se verifica que no puede iniciar sesion y se visualiza el mensaje <mensaje>

    Examples:
      | usuario                  | password   | mensaje |
      | albagaitan.fsk@gmail.com | aLBAa1834* | Error   |


  Scenario Outline: Verificar que al cerrar sesion si hago click en volver atras, no sigue logueado
    And ingresa usuario <usuario> y password <password>
    When hace click en el boton login
    And hace click en el boton logout
    And hace click en el boton back
    Then se verifica que esta en la pantalla iniciar sesion

    Examples:
      | usuario                  | password  |
      | albagaitan.fsk@gmail.com | alba1234* |