package fullHandlings;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class case2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("before class case2...");
    }

    @Test
    void test(){
        System.out.println("test in case2...");
    }

    @AfterClass
    void afterClass(){
        System.out.println("after class case2...");
    }
}
