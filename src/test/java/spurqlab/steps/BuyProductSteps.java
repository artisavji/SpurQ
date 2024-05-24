package spurqlab.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import spurqlab.core.TestRunner;

public class BuyProductSteps extends TestRunner.TestContext {

    @When("user selects {string} product")
    public void userSelectsProduct(String productName)  {
        driver.findElement(By.xpath("//div[text()=\""+productName+"\"]")).click();
        
    }
    @Then("User sees the product in the cart")
    public void userSeesTheProductInTheCart() {
        Assert.assertEquals(driver.findElement(By.className("shopping_cart_badge")).getText(),"1");
    }

    @And("User clicks on Add to Cart button")
    public void userClicksOnAddToCartButton() {
        driver.findElement(By.id("add-to-cart")).click();
    }
}
