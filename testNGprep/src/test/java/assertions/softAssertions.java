package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertions {

    @Test
    void test(){
        System.out.println("testing...");
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("name","name");
        sa.assertEquals(123,143);
        sa.assertEquals("xyz",789);
        System.out.println("testing...");

        sa.assertNotEquals("hp","hp");
        sa.assertNotEquals(123,156);
        System.out.println("testing...");

        sa.assertTrue(true);
        sa.assertTrue(1==2);
        sa.assertTrue(1==1);
        sa.assertTrue(false);
        System.out.println("testing...");

        sa.assertFalse(false);
        sa.assertFalse(1==2);
        sa.assertFalse(1==1);
        sa.assertFalse(true);
        System.out.println("testing...");

        sa.assertAll();
    }
}
