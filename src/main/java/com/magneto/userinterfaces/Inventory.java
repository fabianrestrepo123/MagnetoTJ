package com.magneto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Inventory {

    public static final Target AGREGAR_AL_CARRITO = Target.the("Agregar")
            .located(By.id("add-to-cart"));

    public static final Target BTN_CARRITO = Target.the("Ir al carrito")
            .located(By.id("shopping_cart_container"));
}
