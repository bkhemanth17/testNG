package suiteHandling;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suite2 {

    @Test
    void xyz(){
        System.out.println("this is xyz method in suite2...");
    }

    @BeforeSuite
    void bs(){
        System.out.println("this is before suite method...");
    }
}
