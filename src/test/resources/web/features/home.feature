@Home
Feature: Pagina de inicio

  Background:
    Given El usuario esta en la pagina de automation practice
    And hace click en el boton shop
    And hace click en el boton home
    And recorre la pantalla visualizando tres Arrivals

  Scenario Outline: Añadir articulos al carrito de compras y visualizar pasarela de pagos exitosamente
    And selecciona una imagen Arrivals Mastering JavaScript
    When hace click en el boton añadir al carrito
    And hace click en el boton view basket y visualiza los importes total y sub total
    And hace click en el boton proceed to checkout
    And completa el formulario y selecciona una forma de pago
    Then se verifica que puede agregar un cupon <cupon> y visualizar los detalles de la facturacion
    Examples:
      | cupon       |
      | cuponprueba |


  Scenario: Realizar un pedido exitosamente
    And selecciona una imagen Arrivals Mastering JavaScript
    When hace click en el boton añadir al carrito
    And hace click en el boton view basket y visualiza los importes total y sub total
    And hace click en el boton proceed to checkout
    And completa el formulario y selecciona una forma de pago
    And hace click en el boton place order
    Then se visualiza la pantalla de confirmacion de pedido y los datos de la factura

