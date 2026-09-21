package testHandling;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {

    @Test
    void abc(){
        System.out.println("this is abc from test1....");
    }

    @BeforeTest
    void def(){
        System.out.println("it's a before test method...");
    }
}
