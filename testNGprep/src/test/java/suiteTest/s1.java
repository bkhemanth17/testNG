package suiteTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class s1 {

    @Test
    void abc(){
        System.out.println("this is abc method from s1...");
    }

    @AfterTest
    void afterTest(){
        System.out.println("this is after Test method...");
    }
}
