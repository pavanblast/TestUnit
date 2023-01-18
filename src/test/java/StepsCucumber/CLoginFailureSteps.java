package StepsCucumber;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@SuppressWarnings({"unused"})
public class CLoginFailureSteps {
    WebDriver driver;

    @Then("^I should not be loggedin$")
    public void i_should_not_be_loggedin()throws Exception
    {
        CEditProfileSteps cp = new CEditProfileSteps();
        this.driver = cp.driver;
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Enter your Email address and password correct']")).isDisplayed());
        driver.close();
    }
}