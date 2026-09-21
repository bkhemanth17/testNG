package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {
    String s= "open text";
    String s2 = "open shot";
    String s1 = "open text";

    @Test
    void validator(){
        Assert.assertEquals(s,s2);
    }

    @Test
    void valid(){
        if(s.equals(s1)){
            System.out.println("passed...");
            Assert.assertTrue(true);
        }else {
            System.out.println("failed...");
            Assert.assertTrue(false);
        }
    }
}
