package ar.steps;

import api.config.EntityConfiguration;
import api.model.Shorten;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class ShortenSteps {
    @When("realizo una operacion (.*) a (.*) al endpoint (.*)")
    public void realizoPeticion(String operation, String entity, String request)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);
    }

    @Then("obtengo el statusCode (.*)")
    public void obtengoStatusCode(int statusCodeEsperado) {
        int respStatusCode = APIManager.getLastResponse().getStatusCode();

        Assert.assertEquals(respStatusCode,statusCodeEsperado, "Los status code son distintos");
    }

    @And("obtengo la url acortada")
    public void obtengoLaUrlAcortada() {
        Shorten urlacortada = (Shorten) APIManager.getLastResponse().getResponse();
        System.out.println("Link acortado: "+urlacortada.getResult_url());
    }
}
