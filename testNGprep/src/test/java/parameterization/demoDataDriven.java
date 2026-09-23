package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class demoDataDriven {

    WebDriver driver;

    @BeforeClass
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dataProvider = "dp")
    void login(String email, String passwd){
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        boolean status = driver.findElement(By.xpath("//a[text()= 'Edit Account']")).isDisplayed();
        if(status){
            driver.findElement(By.xpath("//a[@class = 'list-group-item' and text()= 'Logout']")).click();
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

    @DataProvider(name = "dp", indices = {0,3})
    Object[][] loginData(){
        Object[][] objects = {
                {"temp1@temp.com", "qwertyuiop"},
                {"temp2@temp.com", "asdfghjklmn"},
                {"temp3@temp.com", "zxcvbnmasdfghj"},
                {"user@tempmail.com", "1234567890"}
        };
        return objects;
    }
}
