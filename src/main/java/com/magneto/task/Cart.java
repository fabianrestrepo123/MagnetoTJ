package com.magneto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.magneto.userinterfaces.CartSauceDemo.BTN_VALIDAR;

public class Cart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_VALIDAR));
    }
        public static Cart shopping(){
        return Tasks.instrumented(Cart.class);
        }
}

