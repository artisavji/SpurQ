package spurqlab.steps;

import spurqlab.core.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class LoginSteps extends TestContext {


    @Given("User is on SauceLabs login page")
    public void userIsOnSauceLabsLoginPage()
    {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @When("User enters {string} and {string}")
    public void userEntersAnd(String userName, String password) {
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("User clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user is on product page with list of {int} products")
    public void userIsOnProductPageWithListOfProducts(int expectedResult)
    {
        List<WebElement> products=driver.findElements(By.className("inventory_item_name"));
        Assert.assertEquals(products.size(),expectedResult);

    }
}
