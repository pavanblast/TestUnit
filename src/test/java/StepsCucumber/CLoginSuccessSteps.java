package StepsCucumber;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@SuppressWarnings({"unused"})
public class CLoginSuccessSteps {

    WebDriver driver;

    @Then("I should be loggedin")
    public void i_should_be_loggedin()
    {
        CEditProfileSteps cp = new CEditProfileSteps();
        this.driver = cp.driver;
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='pavanblast008@gmail.com']")).isDisplayed());
        driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();
        driver.close();
    }
}

