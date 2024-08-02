package com.magneto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.magneto.stepdefinitions",
        features = "src/test/resources/features/flujo_compra.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class CompraSauceDemo {
}
