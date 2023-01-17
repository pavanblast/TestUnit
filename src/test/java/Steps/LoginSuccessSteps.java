package Steps;

import Utils.Keywords;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

@SuppressWarnings({"unused"})
public class LoginSuccessSteps{

    WebDriver driver;
    @Given("I launched application and logged in with $username and $password")
    public void i_launched_application_and_logged_in_with_username_and_password(String username, String password)throws Exception
    {
        Keywords kw = new Keywords();
        driver = kw.login(username,password);
        Thread.sleep(2000);
    }

    @Then("I should be loggedin")
    public void i_should_be_loggedin()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='pavanblast008@gmail.com']")).isDisplayed());
        driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();
        driver.close();
    }
}

