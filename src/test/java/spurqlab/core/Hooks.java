package spurqlab.core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends TestContext {

    @Before
    public void beforeTest()
    {
        driver = new ChromeDriver();

    }
    @After
    public void afterTest()
    {
     driver.quit();
    }

}
