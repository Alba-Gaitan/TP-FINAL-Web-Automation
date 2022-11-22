@Shop @Alba
Feature: Shop
  Background:
    Given El usuario esta en la pagina de automation practice
    And hace click en el boton shop
    And añade un libro al carrito de compras

  Scenario: Añadir articulos al carrito de compras y ver enlace del articulo- revisar titulo
    And hace click en el boton view basket y visualiza los importes total y sub total
    When hace click en el boton proceed to checkout
    And completa el formulario y selecciona una forma de pago
    And hace click en el boton place order
    Then se visualiza la pantalla de confirmacion de pedido y los datos de la factura


  Scenario: Verificar los impuestos correspondientes para la india y el extranjero
    And hace click en el boton view basket y visualiza los importes total y sub total
    When hace click en el boton proceed to checkout
    Then se verifica la tasa impositiva para india es de porcentaje 2 y para el extranjero 5
