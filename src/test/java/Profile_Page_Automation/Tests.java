package Profile_Page_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class Tests {
    private WebDriver driver;

    @BeforeSuite
    public void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
    }



    @BeforeMethod
    public void setupTests() {
        this.driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("http://training.skillo-bg.com:4300/posts/all");
    }

    @Test
    public void registrationProcess() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();

        String expectedLoginURL = "http://training.skillo-bg.com:4300/users/login";
        wait.until(ExpectedConditions.urlToBe(expectedLoginURL));

        WebElement signUpElement = driver.findElement(By.className("h4"));
        wait.until(ExpectedConditions.visibilityOf(signUpElement));

        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/register"));
        WebElement signUpButtonElement = driver.findElement(By.id("sign-in-button"));
        wait.until(ExpectedConditions.visibilityOf(signUpButtonElement));

        WebElement userNameField = driver.findElement(By.name("username"));
        userNameField.sendKeys(usernameHolder);

        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        emailField.sendKeys(generateRandomAlphabeticString(6, 10) + "@gmail.com");

        WebElement birthDateElement = driver.findElement(By.cssSelector("[placeholder='Birth date']"));
        birthDateElement.sendKeys("01022003");

        WebElement passwordElement = driver.findElement(By.id("defaultRegisterFormPassword"));
        passwordElement.sendKeys(passwordHolder);

        WebElement confirmPasswordElement = driver.findElement(By.id("defaultRegisterPhonePassword"));
        confirmPasswordElement.sendKeys(passwordHolder);

        WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
        publicInfoField.sendKeys("My Public Info");

        signUpButtonElement.click();


        String expectedAllPostsURL = "http://training.skillo-bg.com:4300/posts/all";
        wait.until(ExpectedConditions.urlToBe(expectedAllPostsURL));

        WebElement profileHeaderElement = driver.findElement(By.id("nav-link-profile"));
        wait.until(ExpectedConditions.visibilityOf(profileHeaderElement));
        profileHeaderElement.click();

        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users/"));

        WebElement userName = driver.findElement(By.tagName("h2"));
        wait.until(ExpectedConditions.visibilityOf(userName));
        String actualUserName = userName.getText();
        String expectedUserName = usernameHolder;
        Assert.assertEquals(actualUserName, expectedUserName, "The username is incorrect!");

        //WebElement initailUserPosts = driver.findElement(By.className("profile-stat-count"));
        //wait.until(ExpectedConditions.visibilityOf(initailUserPosts));
       // Assert.assertEquals(initailUserPosts.getText(), "0", "User posts are not 0!");

       // WebElement initailUserFollowers = driver.findElement(By.id("followers"));
       // wait.until(ExpectedConditions.visibilityOf(initailUserFollowers));
       // Assert.assertEquals(initailUserFollowers.getText(), "0", "User followers are not 0!");

       // WebElement initailUserFollowing = driver.findElement(By.id("following"));
       // wait.until(ExpectedConditions.visibilityOf(initailUserFollowing));
       // Assert.assertEquals(initailUserFollowing.getText(), "0", "User following is not 0!");

        //WebElement allButton = driver.findElement(By.className("btn-all"));
        //wait.until(ExpectedConditions.visibilityOf(allButton));
        //allButton.click();

        //WebElement allNoPostsText = driver.findElement(By.tagName("h3"));
        //wait.until(ExpectedConditions.visibilityOf(allNoPostsText));
        //String expectedAllNoPostsText = "No posts here";
        //Assert.assertEquals(allNoPostsText.getText(), expectedAllNoPostsText, "No posts text is incorrect for All posts!");

        WebElement newPostButton = driver.findElement(By.className("far"));
        wait.until(ExpectedConditions.visibilityOf(newPostButton));
        newPostButton.click();

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/create"));

        WebElement closeButton = driver.findElement(By.className("fa-times"));
        wait.until(ExpectedConditions.visibilityOf(closeButton));
        closeButton.click();

    }




    private int generateRandomNumber(){
        Random objGenerator = new Random();
        int randomNumber = 0;
        for (int iCount = 0; iCount < 10; iCount++) {
            randomNumber = objGenerator.nextInt(100);
        }
        return randomNumber;
    };
    private String passwordHolder = generateRandomAlphabeticString(6, 10) + generateRandomNumber();
    private String usernameHolder = generateRandomAlphabeticString(5,10);

    private String generateRandomAlphabeticString(int minLenght, int maxLenght) {
        return RandomStringUtils.randomAlphabetic(minLenght, maxLenght);
    }

}








   // @AfterTest
   // public void closeBrowser(){
     //   if(this.driver != null) {
     //       driver.quit();
      //  }
   // }

