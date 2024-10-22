package Introduction_to_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercies1 {

    @Test
    public void testOpenWebsite() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://training.skillo-bg.com:4300/posts/all");
        driver.close();

    }
}
