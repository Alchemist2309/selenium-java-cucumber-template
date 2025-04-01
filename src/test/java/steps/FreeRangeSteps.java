package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class FreeRangeSteps {
    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to the website")
    public void iNavigateToFRT(){
        landingPage.navigateToPageTesters();
    }
}