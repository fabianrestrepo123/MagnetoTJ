Feature: Realizar el flujo de compra de un ítem en SauceDemo

  Scenario: Comprar un Sauce Labs Backpack

    Given El usuario "Fabian" esta en la pagina de inicio de SauceDemo
    When Inicia sesion con el usuario "standard_user" y elige el producto para su compra
    And Llena los campos para la compra para finalizar su compra
      | First Name | Last Name | Zip    |
      | Fabian     | Restrepo  | 055450 |
    Then Valida que el mensaje final sea "Thank you for your order!"