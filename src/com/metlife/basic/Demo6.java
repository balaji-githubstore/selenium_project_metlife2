package com.metlife.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo6 {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.icicibank.com/");

        //html pop up
        driver.findElement(By.id("push-modal-close")).click();

//        driver.findElement(By.id("form_DOB")).sendKeys("2022-08-12");
    }
}
