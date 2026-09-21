package suiteTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class s3 {

    @BeforeSuite
    void bs(){
        System.out.println("this is before suite method...");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("this is before test method...");
    }

    @Test
    void xyz(){
        System.out.println("this is xyz method in s3...");
    }
}
