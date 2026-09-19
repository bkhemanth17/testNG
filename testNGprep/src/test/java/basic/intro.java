package basic;

import org.testng.annotations.Test;

public class intro {

    //1st step
    //it will not follow sequence executes all tes cases based on alphabetical order
    //use priority() - (priority = 1) - follows priority order
    // once priority is provided order is not considered we can write where ever we want as methods
    //priority number can be anything - which ever comes first will be executed
    //default priority - 0 not provided for @Test
    //priority is same then execute methods in alphabetical order
    //negative number are allowed (it has high priority than zero and +ve numbers)

    @Test(priority = 1)
    void openApp(){
        System.out.println("application opened");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("logged in");
    }
    @Test(priority = 3)
    void logout(){
        System.out.println("logged out");
    }

}
