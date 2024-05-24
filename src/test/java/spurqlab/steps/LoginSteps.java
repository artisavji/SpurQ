package spurqlab.steps;

import com.google.common.collect.Table;
import spurqlab.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import spurqlab.Pages.ProductPage;
import spurqlab.core.TextContext;

public class LoginSteps /*extends TextContext*/ {
    LoginPage loginPage;
    ProductPage productPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
        this.productPage = new ProductPage();
    }

    @Given("User is on SauceLabs login page")
    public void userIsOnSauceLabsLoginPage() {

    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String userName, String password) {
        loginPage.enterCredentials(userName, password);

    }

    @And("User clicks on login button")
    public void userClicksOnButton() {
        loginPage.clickLogin();
    }

    @Then("user is on product page with list of {int} products")
    public void userIsOnProductPageWithListOfProducts(int expectedResult) {
        Assert.assertEquals(productPage.getProductCount(), expectedResult);
    }

   /* @When("User enters credentials given below:")
    public void userEntersCredentialsGivenBelow(Table dataTable) {

    }*/
}

