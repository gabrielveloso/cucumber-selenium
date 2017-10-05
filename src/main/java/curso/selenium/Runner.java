package curso.selenium;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"}, features={"src/main/java/curso/selenium"}, tags={"@testeGabriel, @testeJuca"})
public class Runner {
	
}
