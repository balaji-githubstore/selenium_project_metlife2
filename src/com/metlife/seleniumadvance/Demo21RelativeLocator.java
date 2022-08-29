package com.metlife.seleniumadvance;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo21RelativeLocator {

    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");


        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

        driver.get("https://demo.openemr.io/b/openemr");

        driver.findElement(RelativeLocator.with(By.tagName("Input")).below(By.xpath("//*[text()='Username']"))).sendKeys("hello");
        driver.findElement(RelativeLocator.with(By.tagName("Input")).below(By.xpath("//*[text()='Password']"))).sendKeys("hello123");


       WebElement ele= driver.findElement(RelativeLocator.with(By.tagName("Select")).above(By.xpath("//*[@id='login-button']")));

        Select s=new Select(ele);
        s.selectByIndex(2);

        driver.findElement(RelativeLocator.with(By.tagName("Input")).near(By.xpath("//*[text()='Username']"))).sendKeys("hello");


        driver.switchTo().newWindow(WindowType.WINDOW);

        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.get("https://google.com");
   }
}
