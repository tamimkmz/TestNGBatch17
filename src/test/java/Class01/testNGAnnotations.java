package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class testNGAnnotations {
    /*testcase1:
got to syntax hrms
enter the password and username
click login
close the browser */
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("i am before method");
    }

    @Test(groups = "regression")
    public void aTestCase() {
        System.out.println("i am the first test case");
    }

    @Test
    public void bTestCase() {
        System.out.println("i am the second test case");
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("i am after method");
    }
}



