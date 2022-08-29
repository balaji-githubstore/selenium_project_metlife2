package com.metlife.seleniumadvance;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Demo24FluentWaitFinal {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

        FluentWait<WebDriver> wait=new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(40));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(Exception.class);

     //   wait.until(x->x.findElement(By.xpath("//img[@alt='Go']"))).click();

        String alertText = wait.until(x->x.switchTo().alert().getText());
        System.out.println(alertText);

        wait.until(x->x.switchTo().alert()).dismiss();
    }
}
