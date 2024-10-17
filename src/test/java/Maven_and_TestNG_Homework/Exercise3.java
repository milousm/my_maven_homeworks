package Maven_and_TestNG_Homework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exercise3 {
    //Update the previous two tasks by using @DataProvider. Choose suitable sets of data.

    @DataProvider(name = "orderStatusData")
    public Object[][] orderStatusData() {
        return new Object[][]{
                {"Waiting", "Waiting"},
                {"Updated", "Updated"},
                {"Sent", "Sent"}
        };
    }

    @Test(dataProvider = "orderStatusData")
    public void testOrderStatus(String actualStatus, String expectedStatus) {
        Assert.assertEquals(actualStatus, expectedStatus, "The order status is not updated!");
    }

    @DataProvider(name = "totalPriceData")
    public Object[][] totalPriceData() {
        return new Object[][]{
                {50.50, 50.50},
                {45.26, 45.26},
                {0.0, 0.0}
        };
    }

    @Test(dataProvider = "totalPriceData")
    public void testTotalPrice(double actualTotalPrice, double expectedTotalPrice) {
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "The total price is incorrect!");
    }
}
