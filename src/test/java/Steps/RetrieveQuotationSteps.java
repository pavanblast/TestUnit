package Steps;

import Utils.Keywords;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

@SuppressWarnings({"unused"})
public class RetrieveQuotationSteps {

    WebDriver driver;
    @Given("I launched application and logged in with $username and $password")
    public void i_launched_application_and_logged_in_with_username_and_password(String username, String password)throws Exception
    {
        Keywords kw = new Keywords();
        driver = kw.login(username,password);
        Thread.sleep(2000);
    }

    @When("I click in retrieve quotation,enter quotation number and retrieve the quotation details")
    public void i_click_in_retrieve_quotation_details()
    {
        driver.findElement(By.xpath("//*[@id='ui-id-3']")).click();
        driver.findElement(By.xpath("//*[@id='tabs-3']/form/input[1]")).click();
        driver.findElement(By.xpath("//*[@id='getquote']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]")).getText().contains("Test"));

        driver.findElement(By.xpath("//*[@id='new_quotation']/div[8]/input[3]")).click();
        driver.close();
    }
}