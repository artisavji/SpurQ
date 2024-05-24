package spurqlab.core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends TestRunner.TestContext {

    @Before
    public void beforeTest()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @After
    public void afterTest()
    {
     driver.quit();
    }

}
