package com.magneto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.magneto.userinterfaces.HomeSauceDemo.SELECCIONAR_ARTICULO;


public class Home implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SELECCIONAR_ARTICULO));
    }

    public static Home item() {
        return Tasks.instrumented(Home.class);
    }
}
