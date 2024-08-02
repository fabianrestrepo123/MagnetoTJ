package com.magneto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextOf implements Question<String> {

    public TextOf(Target field) {
        this.field = field;
    }

    private Target field;

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(field).viewedBy(actor).asString();
    }

    public static  TextOf field(Target field){
        return new TextOf(field);
    }
}
