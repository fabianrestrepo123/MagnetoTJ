package com.magneto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.magneto.userinterfaces.CheckoutTwoSauceDemo.BTN_FINALIZAR;

public class CheckoutTwo implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_FINALIZAR));

    }

    public static CheckoutTwo overview(){
        return Tasks.instrumented(CheckoutTwo.class);
    }

}
