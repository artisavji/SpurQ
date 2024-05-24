package spurqlab.Pages;

import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import spurqlab.core.TestRunner;
import spurqlab.core.TextContext;

import java.util.List;

public class ProductPage extends TestRunner.TestContext {
    public int getProductCount()
     {
        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
        return products.size();
     }
}
