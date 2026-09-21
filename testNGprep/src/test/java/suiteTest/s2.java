package suiteTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class s2 {

    @AfterSuite
    void as(){
        System.out.println("this is after suite method...");
    }

    @Test
    void def(){
        System.out.println("this is def method from s2...");
    }
}
