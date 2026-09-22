package groupingMethods;

import org.testng.annotations.Test;

public class paymentMethods {

    @Test(priority = 1, groups = {"regression", "sanity", "functional"})
    void googlePay(){
        System.out.println("paid through gPay...");
    }

    @Test(priority = 2, groups = {"regression", "sanity", "functional"})
    void applePay(){
        System.out.println("paid through apple pay...");
    }

    @Test(priority = 3, groups = {"regression", "sanity", "functional"})
    void twitterPay(){
        System.out.println("paid through twitter - cryptos...");
    }
}
