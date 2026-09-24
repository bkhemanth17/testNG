package pageObjectModel.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    //locators
    //@FindBy(xpath = "//input[@name='username']")
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    WebElement text_userName_loc;

    @FindBy(xpath = "//input[@name='password']")
    WebElement text_Passwd_loc;

    @FindBy(xpath = "//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement btn_loc;

    //action methods
    public void setUserName(String userName){
        text_userName_loc.sendKeys(userName);
    }

    public void setPassword(String password){
        text_Passwd_loc.sendKeys(password);
    }

    public void setLoginBtn(){
        btn_loc.click();
    }
}
