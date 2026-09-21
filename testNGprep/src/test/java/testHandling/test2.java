package testHandling;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test2 {

    @AfterTest
    void after(){
        System.out.println("this is after test method...");
    }

    @Test
    void xyz(){
        System.out.println("this is a xyz from test2...");
    }
}
