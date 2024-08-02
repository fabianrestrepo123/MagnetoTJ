package com.magneto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartSauceDemo {

    public static final Target BTN_VALIDAR = Target.the("validar compra")
            .located(By.id("checkout"));
}
