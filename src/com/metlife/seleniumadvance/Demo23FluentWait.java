package com.metlife.seleniumadvance;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Demo23FluentWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

        FluentWait<WebDriver> wait=new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoAlertPresentException.class).ignoring(NoSuchElementException.class);


     //   wait.until(x->x.findElement(By.xpath("//img[@alt='Go']"))).click();

        String alertText = wait.until(x->x.switchTo().alert().getText());
        System.out.println(alertText);

        wait.until(x->x.switchTo().alert()).dismiss();
    }
}
