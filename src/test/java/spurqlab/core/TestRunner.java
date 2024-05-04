package spurqlab.core;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "spurqlab"
)

public class TestRunner extends AbstractTestNGCucumberTests {

}

