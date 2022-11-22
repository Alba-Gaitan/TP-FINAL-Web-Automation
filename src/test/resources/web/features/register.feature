@Register @MyAccount
Feature: Registrarse

  Background:
    Given El usuario esta en la pagina de automation practice
    And hace click en el boton mi cuenta

  Scenario Outline: Registro fallido con password vacio
    And ingresa email <email> y password <password> en el formulario de registro
    When hace click en el boton register
    Then el usuario no puede iniciar sesion y se visualiza el mensaje <mensaje>

    Examples:
      | email         | password | mensaje                                  |
      | alba@alba.com |          | Error: Please enter an account password. |


  Scenario Outline: Registro fallido con email y password vacio
    And ingresa email <email> y password <password> en el formulario de registro
    And hace click en el boton register
    Then el usuario visualiza el mensaje <mensaje>

    Examples:
      | email | password | mensaje                                      |
      |       |          | Error: Please provide a valid email address. |

