package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

//mouse hover
public class Demo6Actions {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.google.co.in/");

        Actions actions=new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).pause(1000)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .pause(1000).sendKeys(Keys.ENTER).build().perform();

    }
}
