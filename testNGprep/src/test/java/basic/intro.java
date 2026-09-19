package basic;

import org.testng.annotations.Test;

public class intro {

    //1st step

    @Test
    void openApp(){
        System.out.println("application opened");
    }
    @Test
    void login(){
        System.out.println("logged in");
    }
    @Test
    void logout(){
        System.out.println("logged out");
    }

}
