package Maven_and_TestNG_Homework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Exercise2 {
    // Write a test class to verify the content of a web page.
    // The class should include one test to check if the page title, header, and footer
    // are displayed correctly. The test must always check all elements.

    @Test
    public void testContent() {
        SoftAssert softAssert = new SoftAssert();

        String actualTitle = "Random Funny Page Title";
        String expectedTitle = "Random Funny Page Title";
        softAssert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match expected title!");

        String actualHeader = "Random Funny Page Header";
        String expectedHeader = "Random Funny Page Header";
        softAssert.assertEquals(actualHeader, expectedHeader, "Page header doesn't match expected header!");

        String actualFooter = "Random Funny Page Footer";
        String expectedFooter = "Random Funny Page Footer";
        softAssert.assertEquals(actualFooter, expectedFooter, "Page footer doesn't match expected footer!");

        softAssert.assertAll();
    }
}
