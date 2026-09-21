package methodsHandling;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testMethods {
    /*
    login ----------> @BeforeMethod
    search ----------> @Test
    logout ----------> @AfterMethod
    login ----------> @BeforeMethod
    advSearch ----------> @Test
    logout ----------> @AfterMethod
     */

    @BeforeMethod
    void login(){
        System.out.println("logged in...");
    }
    @AfterMethod
    void logout(){
        System.out.println("logged out");
    }
    @Test(priority = 2)
    void advSearch(){
        System.out.println("adv search");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("search");
    }
}