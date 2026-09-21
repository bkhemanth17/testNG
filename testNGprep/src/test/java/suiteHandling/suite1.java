package suiteHandling;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class suite1 {
    @Test
    void abc(){
        System.out.println("this is abc test method in suite1....");
    }

    @AfterSuite
    void as(){
        System.out.println("this is after suite method... ");
    }
}
