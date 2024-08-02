package com.magneto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginSauceDemo {

    public static final Target USUARIO = Target.the("Nombre de usuario")
            .located(By.id("user-name"));

    public static final Target CONTRASENA = Target.the("Contraseña del usuario")
            .located(By.id("password"));

    public static final Target TEXTO_CONTRASENA = Target.the("Texto de la contraseña")
            .located(By.xpath("//div[contains(text(), 'secret_sauce')]"));

    public static final Target BTN_INGRESAR = Target.the("Login del usuario")
            .located(By.id("login-button"));
}
