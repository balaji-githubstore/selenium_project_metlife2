package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
//mouse hover
public class Demo4Actions {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://nasscom.in/");

        driver.findElement(By.xpath("//img[@alt='Happy Diwali']")).click();

        Actions action=new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//*[text()='Membership']"))).perform();

        action.moveToElement(driver.findElement(By.xpath("//*[text()='Become a member']"))).perform();

        driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();

    }
}
