package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keywords{
    public WebDriver driver;

    @SuppressWarnings("deprecation")
    public WebDriver login(String username, String password) throws Exception
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_SHIFT);
        rb.keyPress(KeyEvent.VK_SLASH);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_SHIFT);
        rb.keyRelease(KeyEvent.VK_SLASH);

        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/insurance/v1/index.php");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='login-form']/div[3]/input")).click();
        return driver;
    }
}
