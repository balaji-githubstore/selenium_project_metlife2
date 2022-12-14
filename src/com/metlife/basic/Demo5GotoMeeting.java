package com.metlife.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo5GotoMeeting {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.goto.com/meeting");

        //check for presence of element
        if(driver.findElements(By.id("truste-consent-button")).size()>0)
        {
            driver.findElement(By.id("truste-consent-button")).click();
        }
        driver.findElement(By.linkText("Try Free")).click();

    }
}
