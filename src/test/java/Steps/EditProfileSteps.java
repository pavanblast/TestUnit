package Steps;

import Utils.Keywords;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@SuppressWarnings({"unused"})
public class EditProfileSteps{

    WebDriver driver;
    @Given("I launched application and logged in with $username and $password")
    public void i_launched_application_and_logged_in_with_username_and_password(String username, String password)throws Exception
    {
        Keywords kw = new Keywords();
        driver = kw.login(username,password);
        Thread.sleep(2000);
    }

    @When("I open edit profile option")
    public void i_open_edit_profile_option()throws Exception
    {
        driver.findElement(By.xpath("//*[@id='ui-id-5']")).click();
        Thread.sleep(2000);
    }

    @Then("I update $FirstName and $LastName and click on update user button")
    public void i_update_FirstName_and_LastName_and_click_on_update_user_button(String FirstName,String LastName)throws Exception
    {
        driver.findElement(By.xpath("//*[@id='user_firstname']")).sendKeys(FirstName);
        driver.findElement(By.xpath("//*[@id='user_surname']")).sendKeys(LastName);
        driver.findElement(By.xpath("//*[@id='edit_user_']/div[14]/input")).click();

        driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();
        driver.close();
    }
}