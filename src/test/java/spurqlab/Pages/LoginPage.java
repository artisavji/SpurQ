package spurqlab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;

import java.util.List;

import spurqlab.core.TestRunner;
import spurqlab.core.TextContext;
public class LoginPage extends TestRunner.TestContext

   {
       @FindBy (id = "user-name")
       WebElement usernameTextBox;
       @FindBy (id = "password")
       WebElement passwordTextBox;

       public LoginPage()
       {
           PageFactory.initElements(driver,this);
       }


        public void enterCredentials(String user, String password)
         {
            usernameTextBox.sendKeys(user);
            passwordTextBox.sendKeys(password);
          }

    public void clickLogin() {
        driver.findElement(By.id("login-button")).click();
    }

  /*  public int getProductCount() {
        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
        return products.size();
    }*/
}