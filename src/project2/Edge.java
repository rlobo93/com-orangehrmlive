package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {

    public static void main(String[] args) {

        String Url = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current Url"+ driver.getCurrentUrl());
        System.out.println("Page Resource: "+driver.getPageSource());

        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        usernameField.sendKeys("rlobo@gmail.com");

        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("Pass123?");

        driver.close();






    }

}
