import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class firstAutomation {
    WebDriver driver;
    @BeforeAll
    public void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/");


    }
    @Test
    public void logIn(){
        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        //Click on the PIM button
        List<WebElement> pimBtn = driver.findElements(By.tagName("span"));
        pimBtn.get(1).click();

        //click on add button
        List<WebElement> addButton = driver.findElements(By.tagName("button"));
        addButton.get(5).click();

        //Click on toggle button

        List<WebElement> toggleButton = driver.findElements(By.tagName("span"));
        toggleButton.get(15).click();

        // username password and confirm password input
        List<WebElement> input = driver.findElements(By.tagName("input"));
        input.get(2).sendKeys("Nur");
        input.get(3).sendKeys("Alam");
        input.get(7).sendKeys("aaaaa");
        input.get(10).sendKeys("aaaa1111");
        input.get(11).sendKeys("aaaa1111");


        //again click on the PIM buttpn
        //Click on the PIM button
        //List<WebElement> pimBtn = driver.findElements(By.tagName("span"));
        pimBtn.get(1).click();

        //search employee
        List<WebElement> employeeNameInput = driver.findElements(By.tagName("input"));
        employeeNameInput.get(1).sendKeys("Nur");

        List<WebElement> searchButton = driver.findElements(By.tagName("button"));
        searchButton.get(4).click();





    }
}
