package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.awt.*;
import java.time.Duration;

public class Demo11Options {

    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        EdgeOptions options=new EdgeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--Headless");


        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.irctc.co.in/nget/train-search");  //wait for page load to complete

        System.out.println(driver.getTitle());

        driver.quit();


    }
}
