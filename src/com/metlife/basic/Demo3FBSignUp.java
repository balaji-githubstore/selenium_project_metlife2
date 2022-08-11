package com.metlife.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo3FBSignUp {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.facebook.com/");

        //click on Create New Account
        driver.findElement(By.partialLinkText("New Account")).click();
        //Enter firstname as jack
        driver.findElement(By.name("firstname")).sendKeys("jack");

        //Enter lastname as wick
        driver.findElement(By.name("lastname")).sendKeys("jack123");

        //enter mobile number 87878

        //enter password as welcome123


        //click on custom radio button
        driver.findElement(By.xpath("//input[@value='-1']")).click();


        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();


    }
}
