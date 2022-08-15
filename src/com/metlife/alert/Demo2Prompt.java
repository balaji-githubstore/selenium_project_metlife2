package com.metlife.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo2Prompt {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

        //click on Go
        driver.findElement(By.xpath("//img[@alt='Go']")).click();

        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        
        driver.switchTo().alert().sendKeys("hello");

        driver.switchTo().alert().dismiss();
    }
}
