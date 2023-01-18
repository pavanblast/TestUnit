package StepsCucumber;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@SuppressWarnings({"unused"})
public class CRetrieveQuotationSteps {

    WebDriver driver;

    @When("^I click in retrieve quotation,enter (.*) and retrieve the quotation details$")
    public void i_click_in_retrieve_quotation_details(String quotationnumber)
    {
        CEditProfileSteps cp = new CEditProfileSteps();
        this.driver = cp.driver;

        driver.findElement(By.xpath("//*[@id='ui-id-3']")).click();
        driver.findElement(By.xpath("//*[@id='tabs-3']/form/input[1]")).sendKeys(quotationnumber);
        driver.findElement(By.xpath("//*[@id='getquote']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]")).getText().contains("Test"));

        driver.close();
    }
}