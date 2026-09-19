package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class basicLoginImpl {

    //2nd step

    /*
    open application
    test logo presence
    login
    logout
    close
     */

    WebDriver driver;
    @Test(priority = -1)
    void openWeb(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("opened web page");
    }

    @Test(priority = 0)
    void logoPresence(){
        boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        if (logo){
            System.out.println("yes logo is present");
        }else {
            System.out.println("no unable to find logo");
        }
    }

    @Test(priority = 1)
    void login(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
        System.out.println("logged in");
    }

    @Test(priority = 15)
    void logout(){
        driver.findElement(By.xpath("//li[@class = 'oxd-userdropdown']//i")).click();
        driver.findElement(By.xpath("//ul[@role = 'menu']/li/a[text() = 'Logout']")).click();
        System.out.println("logged out");
    }

    @Test(priority = 900)
    void close(){
        driver.close();
        System.out.println("closed web page");
    }
}
