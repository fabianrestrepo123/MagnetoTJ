package com.magneto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static com.magneto.userinterfaces.LoginSauceDemo.*;

public class Login implements Task {

    public Login(String user) {
        this.user = user;
    }

    private String user;


    @Override
    public <T extends Actor> void performAs(T actor) {

        String texto = Text.of(TEXTO_CONTRASENA).viewedBy(actor).value();
        String subtexto = texto.substring(texto.indexOf("secret_sauce"));

        actor.attemptsTo(Enter.theValue(user).into(USUARIO),
                Enter.theValue(subtexto).into(CONTRASENA),
                Click.on(BTN_INGRESAR));


    }


    public static Login in(String user) {
        return Tasks.instrumented(Login.class, user);
    }
}
