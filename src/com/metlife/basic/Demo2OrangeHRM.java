package com.metlife.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo2OrangeHRM {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        driver.get("https://opensource-demo.orangehrmlive.com/");  //wait for page load to complete

//        By locator= By.id("txtUsername");
//        WebElement element= driver.findElement(locator);
//        element.sendKeys("Admin");

//        WebElement element= driver.findElement(By.id("txtUsername"));
//        element.sendKeys("Admin");

        driver.findElement(By.id("txtUsername33")).sendKeys("Admin");  //check for presence of element in 0.5s

        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        driver.findElement(By.name("Submit")).click();

        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("welcome")).click();

        driver.findElement(By.linkText("Logout")).click();

    }
}
