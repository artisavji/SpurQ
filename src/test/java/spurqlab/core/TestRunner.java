package spurqlab.core;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "spurqlab"
)

public class TestRunner extends AbstractTestNGCucumberTests {

    public static class TestContext {

      public static WebDriver driver;

    }
}

