package com.magneto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static com.magneto.userinterfaces.CheckoutSauceDemo.*;

public class Checkout implements Task {

    private List<Map<String, String>> userFields;

    public Checkout(List<Map<String, String>> userFields) {
        this.userFields = userFields;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(userFields.get(0).get("First Name")).into(PRIMER_NOMBRE),
                Enter.theValue(userFields.get(0).get("Last Name")).into(APELLIDO),
                Enter.theValue(userFields.get(0).get("Zip")).into(ZIP),
                Click.on(BTN_CONTINUAR));

    }

    public static Checkout next(List<Map<String, String>> userFields){
        return Tasks.instrumented(Checkout.class, userFields);
    }

}
