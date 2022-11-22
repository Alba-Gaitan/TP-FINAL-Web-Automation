@MyAccount
Feature: My Account - Register

  Background:
    Given El usuario esta en la pagina de automation practice
    And hace click en el boton mi cuenta

  Scenario Outline: visualizar exitosamente detalles de la cuenta y opcion de cambiar contraseña
    And ingresa usuario <usuario> y password <password>
    When hace click en el boton login
    And visualiza el panel principal
    And hace click en account details
    Then visualiza los detalles de la cuenta y la opcion de cambiar password

    Examples:
      | usuario                  | password  |
      | albagaitan.fsk@gmail.com | alba1234* |


  Scenario Outline: Cerrar sesion exitosamente
    And ingresa usuario <usuario> y password <password>
    When hace click en el boton login
    And visualiza el panel principal
    And hace click en el boton mi cuenta
    And hace click en el boton logout
    Then se verifica que cierra sesion exitosamente

    Examples:
      | usuario                  | password  |
      | albagaitan.fsk@gmail.com | alba1234* |