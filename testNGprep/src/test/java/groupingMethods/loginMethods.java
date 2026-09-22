package groupingMethods;

import org.testng.annotations.Test;

public class loginMethods {

    @Test(priority = 1, groups = {"sanity"})
    void loginGoogle(){
        System.out.println("logged in with Google...");
    }

    @Test(priority = 2, groups = {"sanity"})
    void loginApple(){
        System.out.println("logged in with Apple...");
    }

    @Test(priority = 3, groups = {"sanity"})
    void loginTwitter(){
        System.out.println("logged in with Twitter...");
    }
}
