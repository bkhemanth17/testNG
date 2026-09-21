package fullHandlings;

import org.testng.annotations.*;

public class case3 {

    @BeforeSuite
    void bs(){
        System.out.println("this is before suite case3...");
    }

    @AfterSuite
    void as(){
        System.out.println("this is after suite case3...");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("this is before test case3...");
    }

    @AfterTest
    void afterTest(){
        System.out.println("this is after test case3...");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("this is before class case3");
    }

    @AfterClass
    void afterClass(){
        System.out.println("this is after class case3...");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this is before Method case3...");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("this is after Method case3...");
    }

    @Test(priority = 1)
    void test1(){
        System.out.println("test1 in case331...");
    }

    @Test(priority = 2)
    void test2(){
        System.out.println("test2 in case332...");
    }
}
