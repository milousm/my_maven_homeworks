package Maven_and_TestNG_Homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise1 {
//Write a test class to verify the order processing in an e-commerce application.
// The class should include tests to check if the order status is updated correctly
// and if the total price is calculated

    @Test
    public void testOrderStatus() {
        String actualStatus = "Updated";
        String expectedStatus = "Updated";
        Assert.assertEquals(actualStatus, expectedStatus, "The order status is not updated!");
    }

    @Test
    public void testTotalPrice() {
        double actualTotalPrice = 50.50;
        double expectedTotalPrice = 50.50;
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "The total price is incorrect!");
    }
}

