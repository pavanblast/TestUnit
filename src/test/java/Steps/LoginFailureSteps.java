package Steps;

import Utils.Keywords;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

@SuppressWarnings({"unused"})
public class LoginFailureSteps{

    WebDriver driver;
    @Given("I launched application and logged in with $username and $password")
    public void i_launched_application_and_logged_in_with_username_and_password(String username, String password)throws Exception
    {
        Keywords kw = new Keywords();
        driver = kw.login(username,password);
        Thread.sleep(2000);
    }

    @Then("I should not be loggedin")
    public void i_should_not_be_loggedin()throws Exception
    {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Enter your Email address and password correct']")).isDisplayed());
        driver.close();
    }
}