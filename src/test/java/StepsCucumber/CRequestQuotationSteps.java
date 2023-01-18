package StepsCucumber;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings({"unused"})
public class CRequestQuotationSteps {

        WebDriver driver;

        @When("^I click in request quotation,enter all the values and save quotation$")
        public void i_click_in_request_quotation_enter_all_the_values_and_save_quotation()
        {
            CEditProfileSteps cp = new CEditProfileSteps();
            this.driver = cp.driver;

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
