package groupingMethods;

import org.testng.annotations.Test;

public class signUpMethods {

    @Test(priority = 1, groups = {"regression"})
    void signUpGoogle(){
        System.out.println("signed up with Google...");
    }

    @Test(priority = 2, groups = {"regression"})
    void signUpApple(){
        System.out.println("signed up with Apple...");
    }

    @Test(priority = 3, groups = {"regression"})
    void signUpTwitter(){
        System.out.println("signed up with Twitter...");
    }
}
