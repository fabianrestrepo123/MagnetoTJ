package com.magneto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Complete {

    public static final Target TITULO = Target.the("El mensaje  de finalizacion de compra ")
            .locatedBy("//*[text()='{0}']");



}
