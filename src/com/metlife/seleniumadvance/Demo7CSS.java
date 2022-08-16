package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo7CSS {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://opensource-demo.orangehrmlive.com/");  //wait for page load to complete

        driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");  //check for presence of element in 0.5s

        driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");

        driver.findElement(By.cssSelector("[name='Submit']")).click();


    }
}
