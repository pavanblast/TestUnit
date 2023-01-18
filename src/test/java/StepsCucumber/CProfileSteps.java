package StepsCucumber;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@SuppressWarnings({"unused"})
public class CProfileSteps {

        WebDriver driver;

        @When("^I open profile options$")
        public void i_open_profile_options()
        {
            CEditProfileSteps cp = new CEditProfileSteps();
            this.driver = cp.driver;
            driver.findElement(By.xpath("//*[@id='profile']")).click();

            Assert.assertTrue(driver.findElement(By.xpath("//*[@id='tabs-4']/p[1]/strong")).isDisplayed());
            driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();
            driver.close();
        }
}