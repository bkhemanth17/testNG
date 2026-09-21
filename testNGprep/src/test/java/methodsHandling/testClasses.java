package methodsHandling;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testClasses {

    /*
    login -----> @BeforeClass
    search --------> @Test
    adv search -----> @Test
    logout ------> @AfterClass
     */

    @AfterClass
    void logout(){
        System.out.println("logged out...");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("searched...");
    }
    @BeforeClass
    void login(){
        System.out.println("logged in...");
    }
    @Test(priority = 2)
    void advSearch(){
        System.out.println("adv search...");
    }
}
