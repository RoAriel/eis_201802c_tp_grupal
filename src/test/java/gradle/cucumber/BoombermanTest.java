package gradle.cucumber;

import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamConverter;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class BoombermanTest {
    private Boomberman boomberman;

    @Given("^Crear Boomberman")
    public void crearBoomberman() throws Throwable {
        boomberman = new Boomberman();
    }

    @When("^Seteo \"([^\"]*)\" de vida")
    public void setVida(Integer vida) throws Throwable {
        boomberman.setVida(100);
    }

    @Then("^La vida de Boomberman es:")
    public void getVida() throws Throwable {
        Integer actual = boomberman.getVida();

        assertThat(actual).isEqualTo(100);
    }


    @When("^Seteo una posicion inicial (\\d+)")
    public void setCeldaInicial(Celda celda) throws Throwable {
        celda = new Celda(0,0);

        boomberman.setCeldaInicial(celda);
    }

    @Then("^La celda es:")
    public void getCelda() throws Throwable {
        Celda celda = boomberman.getCelda();
        Celda expected = new Celda(0,0);

        assertThat(celda).isEqualTo(expected);
    }
}
