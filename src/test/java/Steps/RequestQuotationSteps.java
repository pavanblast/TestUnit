package Steps;

import Utils.Keywords;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings({"unused"})
public class RequestQuotationSteps {

        WebDriver driver;
        @Given("I launched application and logged in with $username and $password")
        public void i_launched_application_and_logged_in_with_username_and_password(String username, String password)throws Exception
        {
            Keywords kw = new Keywords();
            driver = kw.login(username,password);
            Thread.sleep(2000);
        }

        @When("I click in request quotation,enter all the values and save quotation")
        public void i_click_in_request_quotation_enter_all_the_values_and_save_quotation()
        {

            driver.findElement(By.xpath("//*[@id='ui-id-2']")).click();
            Select select1 = new Select(driver.findElement(By.xpath("//*[@id='quotation_breakdowncover']")));
            select1.selectByVisibleText("Roadside");

            driver.findElement(By.xpath("//*[@id='quotation_windscreenrepair_f']")).click();
            driver.findElement(By.xpath("//*[@id='quotation_incidents']")).sendKeys("5");
            driver.findElement(By.xpath("//*[@id='quotation_vehicle_attributes_registration']")).sendKeys("Test");
            driver.findElement(By.xpath("//*[@id='quotation_vehicle_attributes_mileage']")).sendKeys("50");
            driver.findElement(By.xpath("//*[@id='quotation_vehicle_attributes_value']")).sendKeys("5000");

            Select select2 = new Select(driver.findElement(By.xpath("//*[@id='quotation_vehicle_attributes_parkinglocation']")));
            select2.selectByVisibleText("Public Place");

            driver.findElement(By.xpath("//*[@id='new_quotation']/div[8]/input[3]")).click();
            driver.close();
        }
}
