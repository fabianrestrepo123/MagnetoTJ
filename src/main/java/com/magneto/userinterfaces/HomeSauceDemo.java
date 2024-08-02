package com.magneto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeSauceDemo {

    public static final Target SELECCIONAR_ARTICULO = Target.the("Producto")
            .located(By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]"));
}
