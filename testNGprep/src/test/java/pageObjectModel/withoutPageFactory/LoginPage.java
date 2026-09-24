package pageObjectModel.withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
      public LoginPage(WebDriver driver){
          this.driver= driver;
      }

      //locators
      By text_userName_loc = By.xpath("//input[@name='username']");
      By text_Passwd_loc = By.xpath("//input[@name='password']");
      By btn_loc = By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

      //action methods
    public void setUserName(String userName){
        driver.findElement(text_userName_loc).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(text_Passwd_loc).sendKeys(password);
    }

    public void setLoginBtn(){
        driver.findElement(btn_loc).click();
    }
}
