package com.metlife.seleniumadvance;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Demo22FluentWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();


        driver.get("https://opensource-demo.orangehrmlive.com/");  //wait for page load to complete

        FluentWait<WebDriver> wait=new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoAlertPresentException.class).ignoring(NoSuchElementException.class);

        WebElement ele= wait.until(x->x.findElement(By.xpath("//*[@name='username']")));
        ele.sendKeys("Admin");

        wait.until(x->x.findElement(By.xpath("//*[@name='password']"))).sendKeys("admin123");

        wait.until(x->x.findElement(By.xpath("//button[normalize-space()='Login']"))).click();
    }
}
