package Steps;

import Utils.Keywords;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

@SuppressWarnings({"unused"})
public class ProfileSteps {

        WebDriver driver;
        @Given("I launched application and logged in with $username and $password")
        public void i_launched_application_and_logged_in_with_username_and_password(String username, String password)throws Exception
        {
            Keywords kw = new Keywords();
            driver = kw.login(username,password);
            Thread.sleep(2000);
        }

        @When("I open profile options")
        public void i_open_profile_options()
        {
            driver.findElement(By.xpath("//*[@id='profile']")).click();

            Assert.assertTrue(driver.findElement(By.xpath("//*[@id='tabs-4']/p[1]/strong")).isDisplayed());
            driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();
            driver.close();
        }
}