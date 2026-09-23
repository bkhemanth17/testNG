package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class paramTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    @Parameters({"browser"})
    void setUp(String launcher){
        switch (launcher.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("invalid browser Enter any one chrome/edge/firefox");
                return;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    void testLogo(){
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
        boolean img = logo.isDisplayed();
        Assert.assertTrue(img);
    }
    @Test(priority = 2)
    void getTitle(){
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test(priority = 3)
    void testURL(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
