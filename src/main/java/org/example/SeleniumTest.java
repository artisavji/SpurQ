package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
public class SeleniumTest {
    WebDriver driver;

    @BeforeTest
    public void beforetest() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void validLoginTest()
    {
        login("standard_user");
        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
        Assert.assertEquals(products.size(), 6);

    }

    @Test
    public void lockedUserTest()
    {
        login("locked_out_user");
     Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(), "Epic sadface: Sorry, this user has been locked out.");
    //Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"Epic sadface: Sorry, this user has been locked out.");
    }

public void login(String userName)
 {
    driver.findElement(By.id("user-name")).sendKeys(userName);
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
 }

 @Test( dataProvider ="userDataProvider")
  public void paramUserTest(String userName , String expectedResult)
{
    login(userName);
    List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
    Assert.assertEquals(products.size(), 6);

  //  Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),expectedResult);
    //Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"Epic sadface: Sorry, this user has been locked out.");
}

     @DataProvider
      public Object[][]userDataProvider()
          {

    return new Object[][]
            {
                    {"standard_user",6},
                    {"problem_user",6}
            };
}
       @AfterTest
       public void aftertest()
       {
        driver.quit();
    }
}