package com.magneto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.magneto.userinterfaces.Inventory.*;

public class Inventory implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AGREGAR_AL_CARRITO),
        Click.on(BTN_CARRITO));

    }

    public static Inventory aggregate (){
        return Tasks.instrumented(Inventory.class);
    }
}
