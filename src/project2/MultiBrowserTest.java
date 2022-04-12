package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String Url = "https://opensource-demo.orangehrmlive.com/";
    static String browser = "Firefox";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();


        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong browser name");
        }

        driver.get(Url);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Current Url" + driver.getCurrentUrl());

        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        usernameField.sendKeys("rlobo@gmail.com");

        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("Pass123?");
        driver.close();


    }


}
