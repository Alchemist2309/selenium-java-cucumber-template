package pages;

import pages.BasePage;

public class PaginaPrincipal extends BasePage{
    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToPageTesters() {
        navigateTo("https://sanangel.com.co/");
    }
}
