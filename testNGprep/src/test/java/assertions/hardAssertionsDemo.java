package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertionsDemo {

    @Test
    void test(){
        Assert.assertEquals("xyz","xyz");
        //Assert.assertEquals("xyz",133);
        Assert.assertEquals(123,123);
        //Assert.assertEquals(123,133);

        Assert.assertNotEquals(123,143);
        //Assert.assertNotEquals(123,123);

        Assert.assertTrue(true);
        //Assert.assertTrue(false);
        Assert.assertTrue(1==1);
        //Assert.assertTrue(1==2);

        Assert.assertFalse(false);
        //Assert.assertFalse(1==1);
        //Assert.assertFalse(true);

        Assert.fail();
    }
}
