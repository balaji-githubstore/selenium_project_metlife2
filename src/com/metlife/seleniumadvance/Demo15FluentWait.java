package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Demo15FluentWait {

    public static WebElement waitAndGetWebElement(WebDriver driver,By locator) {
        Wait<WebDriver> wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(60))
                .ignoring(Exception.class)
                .pollingEvery(Duration.ofSeconds(1)
                );

        WebElement element = wait.until(x -> x.findElement(locator));
        return element;
    }

    public void waitTillPageInReadyState(WebDriver driver, Long pageLoadTimeoutInSec) {
        new WebDriverWait(driver, Duration.ofSeconds(pageLoadTimeoutInSec)).
                until(webDriver -> ((JavascriptExecutor) webDriver).
                        executeScript("return document.readyState").equals("complete"));
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");


        waitAndGetWebElement(driver,By.xpath("//hello")).click();
    }
}
