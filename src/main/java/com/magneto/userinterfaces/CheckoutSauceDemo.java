package com.magneto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutSauceDemo {

    public static final Target PRIMER_NOMBRE = Target.the("Ingresar nombre")
            .located(By.id("first-name"));

    public static final Target APELLIDO = Target.the("Ingresar apellido")
            .located(By.id("last-name"));

    public static final Target ZIP = Target.the("Ingresar zip")
            .located(By.id("postal-code"));

    public static final Target BTN_CONTINUAR = Target.the("La compra")
            .located(By.id("continue"));

}
