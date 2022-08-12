package com.metlife.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

//switching to frame using name or id as String
public class Demo3HdfcLogin {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/");

        driver.switchTo().frame("login_page");

        driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
        driver.findElement(By.linkText("CONTINUE")).click();

        //switch to main html
        driver.switchTo().defaultContent();

    }
}
