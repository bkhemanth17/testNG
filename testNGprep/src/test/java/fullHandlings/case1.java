package fullHandlings;

import org.testng.annotations.*;

public class case1 {

    @BeforeSuite
    void bs(){
        System.out.println("this is before suite case1...");
    }

    @AfterSuite
    void as(){
        System.out.println("this is after suite case1...");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("this is before test case1...");
    }

    @AfterTest
    void afterTest(){
        System.out.println("this is after test case1...");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("this is before class case1");
    }

    @AfterClass
    void afterClass(){
        System.out.println("this is after class case1...");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this is before Method case1...");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("this is after Method case1...");
    }

    @Test(priority = 1)
    void test1(){
        System.out.println("test1 in case11...");
    }

    @Test(priority = 2)
    void test2(){
        System.out.println("test2 in case12...");
    }
}
